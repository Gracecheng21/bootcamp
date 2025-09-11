package hero;

import java.math.BigDecimal;

public class Hero {
  private static int idCounter = 0;

  // state/ attribute
  private int id;
  private int level;
  private int hp;
  private int mp;
  private double exp;

  public Hero() {
    this.id = ++idCounter;
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

  public void recoverHp() {
    this.hp = Heros.MAX_HP[this.level - 1];
  }

  public void recoverMp() {
    this.mp = Heros.MAX_MP[this.level - 1];
  }

  public void deductHp(int deductedHp) {
    this.hp = Math.max(this.hp - deductedHp, 0);
    // if (this.hp >= deductedHp) {
    // this.hp = this.hp - deductedHp;
    // } else {
    // this.hp = 0;
    // }
  }

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

  // Circle radius
  public int getLevel() {
    return this.level;
  }

  public double getExp() {
    return this.exp;
  }

  public int getHp() {
    return this.hp;
  }

  public int getMp() {
    return this.mp;
  }

  // Circle Area
  public int getPa() {
    return Heros.PHY_ATTACK[this.level - 1];
  }

  public int getPd() {
    return Heros.PHY_DEFENSE[this.level - 1];
  }

  public boolean isAlive() {
    return this.hp > 0;
  }

  // instance method can call static things..
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
    Hero h1 = new Hero();
    System.out.println(h1.getLevel());
    System.out.println(h1.getPa());
    System.out.println(h1.getHp());
    System.out.println(h1.getMaxHp());
    System.out.println(h1.isAlive());

    Hero h2 = new Hero();
    h1.attack(h2);
    System.out.println(h1.getHp());
    System.out.println(h2.getHp());
    System.out.println(h2.isAlive());

    h1.attack(h2);
    System.out.println(h2.getHp());
    System.out.println(h2.isAlive());
  }
}
