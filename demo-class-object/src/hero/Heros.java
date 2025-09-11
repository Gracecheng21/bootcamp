package hero;

// For Max HP, Warrior > Mage > Archer (Health Point)
// For Max MP, Mage > Archer > Warrior (Mana Point)
// For AG, Archer >> Warrior > Mage (Agility)
// For PA & PD, Warrior > Archer > Mage (Physical Attack, Physical Defense)
// For MA & MD, Mage > Archer > Warrior (Magical Attack, Magical Defense)
// For CC, Archer > Mage >> Warrior (Critical Damage Chance)
// For CD, Warrior >> Mage > Archer (Critical Damage)

// ! final class -> cannot be extended
// Attribute with variable value
// static final: running program cannot change value（已定義數值)
// ! level, role (each role setup each maxhp,maxmp,pa,pd,ma,md,cdc)
public final class Heros {

  // For Max HP, Warrior > Mage > Archer
  public static final int[] WARRIOR_MAX_HP =
      new int[] {60, 80, 100, 120, 140, 160, 180, 200, 220, 240};
  public static final int[] MAGE_MAX_HP =
      new int[] {40, 60, 80, 100, 120, 140, 160, 180, 200, 220};
  public static final int[] ARCHAR_MAX_HP =
      new int[] {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};
  // For Max MP, Mage > Archer > Warrior
  public static final int[] WARRIOR_MAX_MP =
      new int[] {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};
  public static final int[] MAGE_MAX_MP =
      new int[] {60, 80, 100, 120, 140, 160, 180, 200, 220, 240};
  public static final int[] ARCHER_MAX_MP =
      new int[] {40, 60, 80, 100, 120, 140, 160, 180, 200, 220};
  // For AG, Archer >> Warrior > Mage
  public static final int[] WARRIOR_AG =
      new int[] {10, 12, 14, 16, 18, 20, 22, 24, 26, 28};
  public static final int[] MAGE_AG =
      new int[] {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
  public static final int[] ARCHER_AG =
      new int[] {15, 18, 21, 24, 27, 30, 33, 36, 39, 42};
  // For PA , Warrior > Archer > Mage
  public static final int[] WARRIOR_PA =
      new int[] {15, 18, 21, 24, 27, 30, 33, 36, 39, 42};
  public static final int[] ARCHER_PA =
      new int[] {10, 12, 14, 16, 18, 20, 22, 24, 26, 28};
  public static final int[] MAGE_PA =
      new int[] {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
  // For PD, Warrior > Archer > Mage
  public static final int[] PHY_DEFENSE =
      new int[] {3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
  public static final int[] MAGICAL_ATTACK =
      new int[] {12, 18, 24, 30, 36, 42, 48, 52, 60, 66};
  public static final int[] MAGICAL_DEFENSE =
      new int[] {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
  public static final double[] CRITICAL_DAMAGE_CHANCE =
      new double[] {0.10, 0.15, 0.20, 0.25, 0.30, 0.35, 0.40, 0.45, 0.50, 0.55};
  public static final double[] MAX_EXP =
      new double[] {3.0, 5.0, 7.0, 9.0, 11.0, 13.0, 15.0, 17.0, 19.0, 21.0};
  public static final double[] EXP_GAINED =
      new double[] {1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5};
  // final [] = [] {basic value}

  public static int getMaxHp(int level) {
    if (level < 1 || level > Heros.MAX_HP.length)
      return -1;
    return Heros.MAX_HP[level - 1];
  }

  public static double calcAddedExp(int killedHeroLevel) {
    return Heros.EXP_GAINED[killedHeroLevel - 1];
  }


}
