// ! Unchecked Exception -> Compile time -> allow exists
// ! Checked Exception -> Compile time -> handle/fix

public class DemoCheckedException {
  public static void main(String[] args) {
    try {
    System.out.println(total(new int[0])); // 0
    total(null); // java.lang.NullPointerException: Cannot read the array length because "arr" is null
    } catch (InvalidParameterException e) { // handle exception

    }

  }

  // RuntimeException (IllegalArgumentException):
  // 1. method caller can ignore RuntimeException. (By try-catch)
  // 2. method author don't need to add Exception into method signature(throws) 

  // Exception (InvalidParameterException):
  // 1. method caller has try-catch
  // 2. method author need to add Exception into method signature(throws) 

  public static int total(int[] arr) throws InvalidParameterException { 
    if (arr == null)
      throw new InvalidParameterException("array is null."); // RuntimeException (Unchecked Exception)
    int total = 0;
    for (int x : arr) {
      total += x;
    }
    return total;
  }
}
