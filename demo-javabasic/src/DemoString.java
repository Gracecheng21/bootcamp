import com.azul.crs.client.sysinfo.SystemInfoProvider;

public class DemoString {
  
  public static void main(String[] args) {
    //String is NOT primitive, which consist of a set of char values
    String s1 = "John";
    String s2 = "Dear Sir";

    // 8 Primitives to store values ONLY
    // String can Store values + functions
    String s3 = "Steven";
    s3 = "Vincent";
    System.out.println(s3); // Vincent

    //String 中 == 比较引用值／地址是否相同，equals() 比较字符串的内容是否相同
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

    // Function 4: indexOf(), LastIndexOf()
    String s5 = "Sally";
    System.out.println(s5.indexOf('a')); // 1
    System.out.println(s5.indexOf('b')); // -1, not found
    System.out.println(s5.indexOf('l')); // 2, first character of l
    System.out.println(s5.lastIndexOf('l')); // 3, last character of l
    System.out.println(s5.indexOf("ll")); // 2
    System.out.println(s5.lastIndexOf("ll")); // 2

    // Function 5: contains() , true of false
    System.out.println(s5.contains("ll")); // true
    System.out.println(s5.contains("lll")); // false

    if (s5.contains("ll")) {
      System.out.println("The name contains \"ll\"");
    }

    // Function 6: startsWith(), endsWith() , true or false
    System.out.println(s5.startsWith("Sa")); // true
    System.out.println(s5.startsWith("Sab")); // false
    System.out.println(s5.endsWith("lly")); // true
    System.out.println(s5.endsWith("llly")); // false

    if (s5.startsWith("sa")) {
      System.out.println("hello");
    } else {
      System.out.println("goodbye"); // false, startsWith "Sa"
    }

    // Function 7: isEmpty() , ture of false
    String s6 = ""; // empty String
    System.out.println(s6.isEmpty()); //true
    System.out.println(s5.isEmpty()); // false

    if (s6.isEmpty()) {
      System.out.print("s6 is really an empty String."); // print
    } else {
      System.out.println("s6 is NOT an empty String.");
    }

    // Function 8: concat()
    String s7 = "abc";
    System.out.println(s7.concat("vincent")); // abcvincent
    System.out.println(s7); // abc

    // Function 9: replace()
    String s9 = "hello";
    System.out.println(s9.replace('l', 'x')); // hexxo
    System.out.println(s9.replace("ll", "abc")); // heabco
    System.out.println(s9); // hello

    // Function 10: substring()
    String s10 = "hello world";
    System.out.println(s10.substring(4, 7)); // "o w"

    // Function 11: toLowerCase() 轉細揩, toUpperCase() 轉大揩
    String s11 = "Hello";
    System.out.println(s11.toLowerCase()); // hello
    System.out.println(s11.toUpperCase()); // HELLO

    // Function 12: valueOf() -> Convertion
    int x = 3;
    String ss = String.valueOf(x);
    //String.valueOf("anykind of varable");
    System.out.println(ss);
    String ss2 = String.valueOf(3.3);

    double d1 = Double.valueOf("3.3");
    System.out.println(d1); // 3.3

    Character.valueOf('a');
  }
}
