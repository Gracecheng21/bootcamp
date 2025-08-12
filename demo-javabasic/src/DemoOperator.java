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

    

  }
}
