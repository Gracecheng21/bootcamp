package hero;

public abstract class Weapon { // top layer as same as Heros
  // arrays PA, MA, CC 
  // Bow PA,MA,CC // set class Bows to store final variable
  // Sword PA,MA,CC // set class Swords to store final variable
  // Stave PA,MA,CC // set class Stave to store final variable

  abstract double getPA()

  abstract double getMA();

  abstract double getCC();
  
// VScode Run -> Java Compile (javac) 句式錯會error + Java Run (java)
  public static void main(String[] args) {
    // new int[3 type of role][10 of levels]
    int[][] heroPaMap = new int[3][10];
    int[][] heroMaMap = new int[3][10];
    int[][] heroCcMap = new int[3][10];
    // Warrior = 0
    heroPaMap[0] = new int[] {2,3,4,5,6,7,8,9,10,11};
    // Archar = 1
    heroPaMap[1] = new int[] {2,3,4,5,6,7,8,9,10,11};
    // Mage = 2
    heroPaMap[2]= new int[] {2,3,4,5,6,7,8,9,10,11};
  }
}
