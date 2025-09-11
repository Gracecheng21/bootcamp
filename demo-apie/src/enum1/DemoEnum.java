package enum1;

public class DemoEnum {

  // ! Enum : switch case, do not use if

  public static void main(String[] args) {
    System.out.println(Color.RED); // RED
    Book b1 = new Book(1, Color.RED);
    Book b2 = new Book(1, Color.BLUE);
    System.out.println(b1.getColor()); // RED
    System.out.println(b2.getColor()); // BLUE

    b2.setColor(Color.YELLOW);
    System.out.println(b2.getColor()); // YELLOW


    // equals, hashcode, toString


    // ! Primitive and Enum use comparsion opearator
    // enum -> != or ==
    if (b1.getColor() == Color.RED) { // ! checking address (We hava ONLY one Color.RED in memory)
      System.out.println("it is RED"); // it is RED
    } else {
      System.out.println("Not Red");
    }


    OrderStatus o1 = OrderStatus.PRERARING;
    System.out.println(o1.next()); // DELIVERING
    System.out.println(o1.next().next()); // DELIVERED

    Direction d1 = Direction.EAST;
    System.out.println(d1.opposite());
  }
}
