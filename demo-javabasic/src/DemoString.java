public class DemoString {
  
  public static void main(String[] args) {
    //String is NOT primitive, which consist of a set of char values
    String s = "John";
    String s2 = "Dear Sir";

    // 8 Primitives to store values ONLY
    // String can Store values + functions
    String s3 = "Steven";
    s3 = "Vincent";
    System.out.println(s3); // Vincent

    // Function 1: equals()
    System.out.println(s3.equals("Vincent")); // true
    System.out.println(s3.equals("vincent")); // false, case sensitive

    // Function 2: length() how many charcter in word
    System.out.println(s3.length()); // Vincent 7 lettlers

    // Function 3: charAt() character At which position
    // index starts with 0
    // index range 0-6, length=7 (0,1,2,3,4,5,6)
    System.out.println(s3.charAt(2)); // 'n' char at position 3
    //System.out.println(s3.charAt(7)); out of range
    //System.out.println(s3.charAt(-1)); out of range

    // Question
    // print the last character of s3
    s3 = "Steven";
    // length(), charAt()
    System.out.println(s3.charAt(s3.length()-1)); // n

    // Find the middle character of name
    String name = "Joey";
    System.out.println(name.charAt(name.length()-2));
    // First character of name
    System.out.println(name.charAt(name.length()-4));

  }
}
