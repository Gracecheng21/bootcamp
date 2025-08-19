public class DemoWrapperClass {
  public static void main(String[] args) {
    int x = 3;
    Integer x2 = new Integer(3); // construtor
    System.out.println(x2); // 3

    // x2 -> object
    // x -> value

    x2 = 4;
    long l1 = x2.longValue(); // longValue() is a presentation of 3

    // System.out.println(x2 > 3); // true, if fixed value (Wrong coding)

    Integer another = 10;
    System.out.println(x2.compareTo(another)); // -1
    System.err.println(x2.compareTo(4)); // 0 (int 4 -> Integer 4, auto-box)
    // object 要用行為去表達自己
    System.out.println(x2.equals(another)); // false

    // ! Another Exsample
    Integer x10 = new Integer(100);
    Integer x11 = new Integer(100);
    System.out.println(x10.equals(x11)); // true

    // ! because "==" is checking object address for objects
    System.out.println(x10 == x11); // false

    Integer x12 = x10; // x12 address to x10 address
    System.out.println(x12 == x10); // 要佢變做true 

    // Wrapper Class (Integer Cache)
    // Integer -> -128 to 127 (常用數值：一般加減數)
    Integer x13 = 100;
    Integer x14 = 100;
    System.out.println(x13.equals(x14)); // true
    System.out.println(x13 == x14); // true
    // ! because "= 100" -> internal cache -> java reuse the same object

    Integer x15 = 128;
    Integer x16 = 128;
    System.out.println(x15.equals(x16)); // true
    System.out.println(x15 == x16); // false (128), out of the internal cache (integer range), java create new object

    Integer x17 = new Integer(100);
    Integer x18 = 100;
    System.out.println(x17.equals(x18)); // true, 同一數值
    System.out.println(x17 == x18); // false, 不同地址數值

    // ! The above theory applies to Byte, Short, Long, Interger
    // But not for float, Double
    // ! Character (Cache 0-127 所有英文字母加數字)
    // ! Boolean (true, false)

    Boolean isAdult = true;
    Boolean isElderly = new Boolean(true); // Dont use this in presentation
    System.out.println(isAdult.equals(true)); // true

    // String has no range criteria
    // String -> literial pool
    String s1 = "hello";
    String s2 = "hello";
    System.out.println(s1 == s2); // true
    System.out.println(s1.equals(s2)); // true

    String inputPassword = "abcd1234";
    System.out.println(inputPassword.equals("abcd1234")); // true
    System.out.println(inputPassword.equals(new String("abcd1234"))); //true

    String s3 = new String("hello"); // new object with different address
    String s4 = "hello2";
    System.out.println(s1 == s4); // false
    System.out.println(s1 == s3); // false

    // "+" operation in String
    String str1 = "hello";
    String str2 = str1 + "world";
    System.out.println(str1 == str2); // false

    StringBuilder sb1 = new StringBuilder("hello"); // false
    StringBuilder sb2 = sb1.append("world"); // false
    System.out.println(sb1 == sb2); // true

    "hello".toUpperCase();// -> to create a new string object
    System.out.println("hello".toUpperCase()); // new string "HELLO"
  }
}
