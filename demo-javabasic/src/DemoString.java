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
    System.out.println(name.charAt(name.length()/2));
    // Joey char length with 0,1,2,3 , length 4/2 = 2 = e
    name = "Verna";
    System.out.println(name.charAt(name.length()/2));
    // Verna char length with 0,1,2,3,4 , length 5/2 = 2.5 round to 2 = r
    // First character of name, it should be 0 ,thats why no need to use lenght
    System.out.println(name.charAt(0));

    // String
    String s4 = "Hello";
    System.out.println(s4.length()); // 5

    if (s4.length() > 3) { 
      System.out.println("s4 is longer than 3 characters"); // true
    } else if (s4.length() == 3) { // false
      System.out.println("s4 is exactly 3 characters long");
    } else {
      System.out.println("s4 is shorter than or equal to 3 characters"); // false
    }


    







  }
}
