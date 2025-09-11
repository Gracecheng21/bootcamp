import java.util.List;
import java.util.Stack;
public class DemoStack { // use while loop
  public static void main(String[] args) {
    Stack<String> names = new Stack<>();
    names.push("John");
    names.push("Steven");
    names.push("Leo");

    System.out.println(names.size());
    System.out.println(names.contains("Steven"));
    System.out.println(names.peek()); // Leo (Last In first Out)


    while (!names.isEmpty()) {
      System.out.println(names.pop()); // Leo, Steven, John
    }

    List<String> emails = new Stack<>(); // 平時少用，不如用返Vector
    emails.add("abc@gmail.com");
    emails.add("ijk@gmail.com");
    emails.add("xyz@gmail.com");

    // emails.pop(); 冇pop
    // emails.p(); 冇pop
    // 

  }
}
