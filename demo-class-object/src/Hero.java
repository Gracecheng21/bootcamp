import java.math.BigDecimal;

public class Hero {
  // Attribute with variable value // Dicationary
  // Max Hp
  private static final int[] MAX_HP =
      new int[] {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};
  private static final int[] MAX_MP =
      new int[] {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};
  private static final int[] PHY_ATTACK =
      new int[] {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
  private static final int[] PHY_DEFENCE =
      new int[] {3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
  private static final double[] MAX_EXP =
      new double[] {3.0, 5.0, 7.0, 9.0, 11.0, 13.0, 15.0, 17.0, 19.0, 21.0};
  private static final double[] EXP_GAINED =
      new double[] {1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5};
  // final [] = [] {basic value}

  // state
  private int level;
  private int hp;
  private int mp;
  private double exp;

  public Hero() { // 初始化 start from
    this.level = 1;
    this.hp = MAX_HP[1];
    this.mp = MAX_MP[1];
  }

  public void levelUp() {
    this.level++;
    this.recoverHp();
    this.recoverMp();
    this.exp = 0.0;
  }

  public void recoverHp() { // recover() 不特別定義 比較容易處理
    this.hp = MAX_HP[this.level - 1];
  }

  public void recoverMp() {
    this.mp = MAX_MP[this.level - 1];
  }

  // set a method to deductHP (被attack) 被動式解決問題, name by 動詞
  public void deductHP(int deductedHP) {
    this.hp = Math.max(this.hp - deductedHP, 0); // Math.max(int a, int b) return the larger of a and b
  }
  // same as above: Math.max(this.hp - deductedHP, 0))
  // if (this.hp >= deductHP) { = Math.max
  // this.hp = this.hp - deductHP; = this.hp - deductedHP
  // } else {
  // this.hp = 0; = 0
  // }

  // Dealer -> Player
  public void attack(Hero hero) {
    int deductedHP = Math.max(this.getPa() - hero.getPd(), 0);
    hero.deductHP(deductedHP);
    if (!hero.isAlive()) { // == false
      double addedEXP = calcAddedExp(hero.getLevel());
      this.exp = BigDecimal.valueOf(this.exp).add(BigDecimal.valueOf(addedEXP))
          .doubleValue();
      if (this.exp >= MAX_EXP[this.level - 1]) {
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
    return PHY_ATTACK[this.level - 1];
  }

  public int getPd() {
    return PHY_DEFENCE[this.level - 1];
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
    return getMaxHp(this.level);
  }

  public static int getMaxHp(int level) {
    if (level < 1 || level > MAX_HP.length)
      return -1;
    return MAX_HP[level - 1];
  }

  public static double calcAddedExp(int heroLevel) { // verb + adj + noun ()
    return EXP_GAINED[killedHeroLevel - 1];
  }

  public static void main(String[] args) {
    Hero h1 = new Hero();
    System.out.println(h1.getLevel()); // 1
    System.out.println(h1.getPa()); // 10
    System.out.println(h1.getHp()); // 40
    System.out.println(h1.getMaxHp()); // 20
    System.out.println(h1.isAlive());; // true

    Hero h2 = new Hero();
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
