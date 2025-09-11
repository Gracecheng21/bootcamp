public class DemoWrapper {

  public static void main(String[] args) {
    // 8 Primitves
    // coorsponding Wrapper Classes
    // 8 Primitves + 8 Wrapper Classes + 1 String -> 17 types

    int x = 3;
    Integer x1 = 3;
    Integer i1 = 3; // auto-box
    Integer i2 = new Integer(3);
    Integer i3 = Integer.valueOf(3); // ! most usefull

    byte b = 4;
    Byte b1 = 4;

    short s = 9;
    Short s1 = 9;

    long l = 8l;
    Long l1 = 8L;
    // Long l10 = Integer.valueOf(3); // cannot ! Integer -> int -> long -> long
    // Long l11 = 3; // int -> Integer -> Long
    Long l12 = 3L; // auto-box
    long l13 = 3; // promotion

    char c = 'a';
    Character c1 = 'a';

    boolean n = true;
    Boolean n1 = true;

    float f = 1.03f;
    Float f1 = 1.03F;

    double d = 1.99;
    Double d1 = 1.99;

    String s2 = "hello"; // no primitves
    String s5 = new String("hell0");
    String s6 = String.valueOf("hello"); // also can use charOf[]

    // ! Primitves vs Wrapper Class
    // 1. Primitves for value storage and Math Operatons ONLY.
    // 2. Wrapper Class has methods
    // 3. Wrapper Class NEVER use operators (>, < , >=, <=, != , ==) for comparion

    System.out.println(x1.doubleValue()); // 3.0
    System.out.println(x + x1); // int + Integer -> int + int (java auto cal)
    Integer x2 = 10;
    // System.out.println(x2 > x1); // true but error coding

    // Value Comparsion (CompareTo, equals)
    System.out.println(x2.compareTo(x1)); // 1 means (x2 > x1)
    Integer x3 = 10;
    System.out.println(x2.compareTo(x3)); // 0
    System.out.println(x1.compareTo(x2)); // -1
    System.out.println(x2.equals(x1)); // false

    // Math Operation
    System.out.println(x1 + x2); // 13
    System.out.println(x3 * x2); // 100

    // for comparision
    System.out.println(Long.valueOf(4).compareTo(Long.valueOf(3))); // 1

  }
}
