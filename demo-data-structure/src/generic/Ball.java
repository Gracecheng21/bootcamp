package generic;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ball implements Comparable<Ball> {
  private Color color;
  private int value;

  public Ball(Color color, int value) {
    this.color = color;
    this.value = value;
  }

  public Color getColor() {
    return this.color;
  }

  public int getValue() {
    return this.value;
  }

  // Question 1: BLUE -> RED -> YELLOW
  // Question 2: YELLOW -> RED -> BLUE
  // Question 3: RED -> YELLOW -> BLUE
  // If they are with same color, order by value in descending.

  /*
   * 回傳正數（通常係 1）：代表「前者大過後者」 回傳0：代表「兩者相等」 回傳負數（通常係 -1）：代表「前者細過後者」
   */

  // ! this: -1 , that 1
  // Question 1: BLUE -> RED -> YELLOW
  /*
   * @Override public int compareTo(Ball ball) { if (this.color == Color.BLUE) return -1; if (ball.getColor() == Color.BLUE) return 1; if (this.color == Color.RED) return -1; if (ball.getColor() ==
   * Color.RED) return 1; return -1; // -1 or 1 }
   */

  // Question 2: YELLOW -> RED -> BLUE
  /*
   * @Override public int compareTo(Ball ball) { if (this.color == Color.RED) return -1; if (ball.getColor() == Color.RED) return 1; if (this.color == Color.YELLOW) return -1; if (ball.getColor() ==
   * Color.YELLOW) return 1; return -1; // -1 or 1 }
   */

  // Question 3: RED -> YELLOW -> BLUE
  @Override
  public int compareTo(Ball ball) {
    if (this.color == ball.getColor()) {
      if (this.value > ball.getValue())
        return -1;
      else
        return 1;
    }
    if (this.color == Color.RED)
      return -1;
    if (ball.getColor() == Color.RED)
      return 1;
    if (this.color == Color.YELLOW)
      return -1;
    if (ball.getColor() == Color.YELLOW)
      return 1;
    return -1; // -1 or 1
  }



  @Override
  public String toString() {
    return "Ball(" //
        + "color=" + this.color //
        + ")";
  }

  public static void main(String[] args) {
    // ordering: BLUE -> RED -> YELLOW
    Queue<Ball> q1 = new PriorityQueue<>();
    q1.add(new Ball(Color.RED, 12));
    q1.add(new Ball(Color.YELLOW, 13));
    q1.add(new Ball(Color.RED, 1));
    q1.add(new Ball(Color.BLUE, 100));

    while (!q1.isEmpty()) {
      System.out.println(q1.poll());
    }
    /*
     * Ball(color=RED) Ball(color=RED) Ball(color=YELLOW) Ball(color=BLUE)
     */
  }



}
