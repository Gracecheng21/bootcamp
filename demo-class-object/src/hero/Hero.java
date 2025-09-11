package hero;
import java.math.BigDecimal;

public abstract class Hero {
  private static int idCounter = 0;

  // state/ attribute (default 0 / null)
  private int id;
  private int level;
  private int hp;
  private int mp;
  private double exp;
  // weapon can be attribute, 可隨時捨棄
  // role cannot be change, set a new class for object
  // if role can be change, set as attribute
  // if set weapon as attribute, cannot change for Hero

  public Hero() { // 初始化 start from
    this.id = ++idCounter; // 每次新增hero, 新增id, 不會重覆
    this.level = 1;
    this.hp = Heros.MAX_HP[0];
    this.mp = Heros.MAX_MP[0];
  }

  public void levelUp() {
    this.level++;
    this.recoverHp();
    this.recoverMp();
    this.exp = 0.0;
  }

  public void recoverHp() { // recover() 不特別定義 比較容易處理
    this.hp = Heros.MAX_HP[this.level - 1];
  }

  public void recoverMp() {
    this.mp = Heros.MAX_MP[this.level - 1];
  }


  // set a method to deductHP (被attack) 被動式解決問題, name by 動詞
  public void deductHp(int deductedHp) {
    this.hp = Math.max(this.hp - deductedHp, 0); // Math.max(int a, int b) return the larger of a and b
  }
  // same as above: Math.max(this.hp - deductedHP, 0))
  // if (this.hp >= deductHP) { = Math.max
  // this.hp = this.hp - deductHP; = this.hp - deductedHP
  // } else {
  // this.hp = 0; = 0
  // }

  // Dealer -> Player
  public void attack(Hero hero) {
    int deductedHp = Math.max(this.getPa() - hero.getPd(), 0);
    hero.deductHp(deductedHp);
    if (!hero.isAlive()) {
      double addedExp = Heros.calcAddedExp(hero.getLevel());
      this.exp = BigDecimal.valueOf(this.exp).add(BigDecimal.valueOf(addedExp))
          .doubleValue();
      if (this.exp >= Heros.MAX_EXP[this.level - 1]) {
        this.levelUp();
      }
    }
  }

  public boolean isAlive() {
    return this.hp > 0; // dont put =0 , error
  }

  // same mindset of cal Circle area
  // Presentation // static method cannot use with this.
  public int getPa() {
    return Heros.PHY_ATTACK[this.level - 1];
  }

  public int getPd() {
    return Heros.PHY_DEFENSE[this.level - 1];
  }

  public int getMa() {
    return Heros.MAGICAL_ATTACK[this.level - 1];
  }

  public int getMd() {
    return Heros.MAGICAL_DEFENSE[this.level - 1];
  }

  public int getLevel() {
    return this.level;
  }

  public int getHp() {
    return this.hp;
  }

  public int getMp() {
    return this.mp;
  }

  public double getExp() {
    return this.exp;
  }

  // instance method can call static things
  public int getMaxHp() {
    return Heros.getMaxHp(this.level);
  }

  public int getId() {
    return this.id;
  }

    public boolean equals(Hero hero) {
    return this.id == hero.getId();
  }


  public static void main(String[] args) {
    Hero h1 = new Warrior(); // use program memory to create object
    System.out.println(h1.getLevel()); // 1
    System.out.println(h1.getPa()); // 10
    System.out.println(h1.getHp()); // 40
    System.out.println(h1.getMaxHp()); // 20
    System.out.println(h1.isAlive());; // true

    Hero h2 = new Archer();
    System.out.println(h2.getHp()); // 40
    h1.attack(h2); //
    System.out.println(h1.getHp()); // 40
    System.out.println(h2.getHp()); // 0
    System.out.println(h2.isAlive()); // false

    h1.attack(h2);
    System.out.println(h2.getHp()); // 0
    System.out.println(h2.isAlive()); // false
  }


}
