public class DemoRuntimeException {
  public static void main(String[] args) {

    // ! avoidable exception (BUG) Fixed by yourself
    // 1. NPE (null pointer exception)
     String s = null;
    // System.out.println(s.length());

    // 2. ArrayOutBoundOfIndex
     int[] arr = new int[3];
    // System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

    // 3. ArithmeticException
     int count = 0;
    // int average = 10 / count;
    // System.out.println(average); // java.lang.ArithmeticException: / by zero

    // 4. StringIndexOutOfBoundsException
    // System.out.println("hello".charAt(5)); // java.lang.StringIndexOutOfBoundsException: Index 5 out of bounds for length 5

    // ! unavoidable exception
    // 5. Method throw exception
    String input = null; 
    // getLength(input); // IllegalArgumentException
    // ! Solution for method caller:
    // ! 1. try-catch IllegalArgumentException
    // ! 2. if input != null

    // 6. Type Converison (i.e. String to Integer)
    String number = "3";
    System.out.println(Integer.valueOf(number)); // java.lang.NumberFormatException
    // ! Solution for method caller:
    // ! 1. try-catch NumberFormatException

    // 7. Login (i.e. database)
    // username or password is wrong -> IOException

    // 8. Find a specific file name in a folder.
    // FileNotFoundException

    }

    public static int getLength(String s) {
      if (s != null)
      return s.length();
      throw new IllegalArgumentException("s should not be null");
    }
}

