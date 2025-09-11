public class DemoASCII {
  
  public static void main(String[] args) {
    char c = 'a'; // 97 in ascii
    int x = c; // safe, char: 0-60_xxx small value into large value
    System.out.println(x); // 97

    int y = 65;// during compile time, variable y is int range.
    // char c2 = y; convert from int to char is un-safe
    char c2 = (char) y; 
    System.out.println(c2); // 'A'

    System.out.println((char)48); // '0'

    // ! char 0-65535
    System.out.println((char)65610); // J (ASCII: 74)

    int x1 = 128;
    byte b1 = (byte) x1; 
    System.out.println(b1); // -128

    // byte -> short -> int -> long -> float -> double (safe)
    // char -> int (safe)
    float f1 = 10L; // long to float
    System.out.println(f1); // 10.0
    double d1 = 100.25f; // float to double not all value is safe
    System.out.println(d1); // 100.25

    // long l2 = 10.9f; unsafe
    long l2 = (long)10.9f;
    System.out.println(l2); // 10

    // short s3 = (short)33000; overflow, the presentation is meaningless
    int x8 = 33000;
    short s3 = (short)x8;
    System.out.println(s3); // -32536 
  }
}
