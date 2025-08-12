public class DemoOperator {
  public static void main(String[] args) {
    // +,-,*,/
    int x = 3;
    x = 6 + 9;

    int y = 5 + x - 10;
    System.out.println(y); // 10

    int a = y - 9 * 2;
    System.out.println(a); // -8

    int b = (y - 9) * 2;
    System.out.println(b); // 2

    //divided by zero error in java
    // int r = 10 / 0; system error

    int r2 = 0 / 10;
    System.out.println(r2); // 0

    // Java: int / int = int
    int r3 = 10 / 3;
    System.out.println(r3); // around to integer = 3
    // int / int = int
    System.out.println(5 / 2); // 2
    // double / int = double / double = double
    System.out.println(5.0 / 2); // 2.5

    int score1 = 71;
    int score2 = 82;
    // code
    double averageScore = (score1 + score2) / 2.0;
    System.out.println(averageScore);
    // 76.5 have to use double to calculate, double / double = double
  }
}
