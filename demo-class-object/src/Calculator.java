public class Calculator {
  private int x;
  private int y;

  // constructor, getters
  public Calculator(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  // sum() , presentation
  public int sum() {
    return this.x + this.y;
  }

  public static int sum(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    System.out.println(new Calculator(10, 7).sum()); // 17 , from object

    // call by static method
    System.out.println(Calculator.sum(10, 7)); // 17 , method straight forward to do calculation
  }

}
