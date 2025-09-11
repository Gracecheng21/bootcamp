import java.util.Scanner;

public class DemoScanner {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // data capture
    System.out.println("Please input a number;");
    int input = scanner.nextInt();

    String s = ""; // EVEN or ODD
    if (input % 2 == 0) {
      s = "EVEN";
    } else {
      s = "ODD";
    }
    System.out.println("The input number is an " + s + " number."); // input value in below TERMINAL


  }
}
