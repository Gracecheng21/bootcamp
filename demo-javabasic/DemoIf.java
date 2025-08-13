public class DemoIf {
  public static void main(String[] args) {
    int x = 3; // you can change this value to test different conditions
    if (x < 4) {
      System.out.println("hello"); // condition is true , so it prints this line
      // System.out.println("x is less than 4"); // action if condition is true
    }
    if (x < 10) {
      System.out.println("goodbye"); // x=3 condition is true, so it prints this line
      // System.out.println("x is less than 10"); // action if nested condition is true
    } else {
      System.out.println("welcome"); // nested condition is false , so it prints this line
      // Since the nested condition is true, this line will execute
      // change x to a value greater than or equal to 10 to see this in action
    }
    if (x < 2) {
      System.out.println("x is less than 2");
    } else if (x < 4) { // this condition is true since x is 3
      System.out.println("x is less than 4 but greater than or equal to 2");
    } else if (x < 6) { // this condition is false since x is 3
      System.out.println("x is less than 6 but greater than or equal to 4");
    } else { // this condition is false since x is 3
      System.out.println("x is greater than or equal to 6");
    }
    // Note: The above code will print "x is less than 4 but greater than or equal to 2" since x is 3.
    // You can change the value of x to see different outputs.

    // if + else if + else example
    int y = 100;
    if (y < 90) { // false, so it won't print this line
      System.out.println("y is less than 90");
    } else if (y >= 90 && y < 100) {
      System.out.println("y is 90 < y 99"); // condition is false, so it won't print this line
    } else {
      System.out.println("y >= 100"); // condition is true, so it prints this line
    } // Note: The above code will print "y >= 100" since y is 100.

    // double if example
    int z = 5;
    if (z < 10) {
      System.out.println("z is less than 10"); // condition is true, so it prints this line
      if (z < 6) {
        System.out.println("z is less than 6"); // nested condition is true, so it prints this line
      } else {
        System.out.println("z is greater than or equal to 6"); // nested condition is false, so it won't print this line
      }
    } else {
      System.out.println("z is greater than or equal to 10"); // outer condition is false, so it won't print this line
    }
    // Note: The above code will print "z is less than 10" and "z is less than 6" since z is 5.
    // You can change the value of z to see different outputs.

    // double w
    // if w < 100 , print "ABC / "w is less than 100"
    // w between 103 and 110, print "DEF / "w is between 103 and 110" (else if)
    // for other values, print "GHI / "w is not between 103 and 110" (else)
    double w = 105.5; // you can change this value to test different conditions
    if (w < 100) { // condition is false, so it won't print this line
      System.out.println("ABC / w is less than 100");
    } else if (w >= 103 && w <= 110) { // condition is true that w is not between 103 and 110(inclusive包含), so it prints this line
      System.out.println("DEF / w is between 103 and 110");
    } else {
      System.out.println("GHI / w is not between 103 and 110"); // condition is false, so it won't print this line
    }
    // Note: The above code will print "DEF / w is between 103 and 110" since w is 105.5.
    // You can change the value of w to see different outputs.

    double v = 95.5; // you can change this value to test different conditions
    if (v < 100) { // condition is true, so it prints this line
      System.out.println("ABC / v is less than 100");
    } else if (v >= 103 && v <= 110) { // condition is false, so it won't print this line
      System.out.println("DEF / v is between 103 and 110");
    } else {
      System.out.println("GHI / v is not between 103 and 110"); // condition is false, so it won't print this line
    }
    // Note: The above code will print "ABC / v is less than 100" since v is 95.5.
    // You can change the value of v to see different outputs.

    double u = 111.1; // you can change this value to test different conditions
    if (u < 100) { // condition is false, so it won't print this line
      System.out.println("ABC / u is less than 100");
    } else if (u >= 103 && u <= 110) { // condition is true, so it prints this line
      System.out.println("DEF / u is between 103 and 110");
    } else {
      System.out.println("GHI / u is not between 103 and 110"); // condition is false, so it won't print this line
    }
    // Note: The above code will print "GHI / u is not between 103 and 110" since u is 120.


    // if + else if + else example with boolean
    boolean isTrue = true; // you can change this value to test different conditions
    if (isTrue) {
      System.out.println("The condition is true"); // condition is true, so it prints this line
    } else {
      System.out.println("The condition is false"); // condition is false, so it won't print this line
    }
    // Note: The above code will print "The condition is true" since isTrue is true.
    // You can change the value of isTrue to see different outputs.

    // AND &&
    // OR ||
    // NOT !
    boolean isSunny = true; // you can change this value to test different conditions
    boolean isWeekend = false; // you can change this value to test different conditions
    if (isSunny && isWeekend) {
      System.out.println("It's a sunny weekend!"); // condition is true, so it prints this line
    } else if (isSunny || isWeekend) {
      System.out.println("It's either sunny or a weekend, but not both."); // condition is false, so it won't print this line
    } else {
      System.out.println("It's neither sunny nor a weekend."); // condition is false, so it won't print this line
    }
    // Note: The above code will print "It's a sunny weekend!" since isSunny is true and isWeekend is false.
    // You can change the values of isSunny and isWeekend to see different outputs.

    // AND && example
    // OR ||
    int a = 10;
    int b = 20;
    if (a < 15 && b > 15) {
      System.out.println(
          "Both conditions are true: a is less than 15 and b is greater than 15"); // condition is true, so it prints this line
    } else {
      System.out.println("At least one condition is false"); // condition is false, so it won't print this line
    }

    if (a > 3 || b < 15) {
        System.out.println("a > 3 OR b < 15 is true"); // condition is true, so it prints this line
      } else {
        System.out.println("Both conditions are false"); // condition is false, so it won't print this line
      } // Note: The above code will print "Both conditions are true: a is less than 15 and b is greater than 15" since a is 10 and b is 20.

      // be careful with the order of operations
      // AND && has higher precedence than OR ||
      if (a < 15 || b > 15 && a > 5) {
        System.out.println("This condition is true"); // condition is true, so it prints this line
      } else {
        System.out.println("This condition is false"); // condition is false, so it won't print this line
      } // Note: The above code will print "This condition is true" since a is 10 and b is 20.

      // NOT !
      boolean isRaining = false; // you can change this value to test different conditions
      if (!isRaining) {
        System.out.println("It's not raining!"); // condition is true, so it prints this line
      } else {
        System.out.println("It's raining!"); // condition is false, so it won't print this line
      }
      // Note: The above code will print "It's not raining!" since isRaining is false.
      // You can change the value of isRaining to see different outputs.

      // equals() + if
      String s2 = "Javascript";
      int score = 0;
      if (s2.equals("Java")) {
        score += 1;
      } else {
        score += 2;
      }
      System.out.println(score); // prints 2, since s2 is "Javascript" and not "Java"

      // if + else if + else example with String
      String color = "red"; // you can change this value to test different conditions
      if (color.equals("blue")) {
        System.out.println("The color is blue"); // condition is false, so it won't print this line
      } else if (color.equals("green")) {
        System.out.println("The color is green"); // condition is false, so it won't print this line
      } else {
        System.out.println("The color is not blue or green"); // condition is true, so it prints this line
      }

      // charAt
      // Check if the first character of a string is 'c', if yes, print "Yes", if not, print "No"
      String s3 = "chain";
      



      // Nested if example
      int score1 = 85; // you can change this value to test different conditions
      if (score1 >= 90) {
        System.out.println("Grade: A"); // condition is true, so it prints this line
      } else if (score1 >= 80) {
        System.out.println("Grade: B"); // condition is true, so it prints this line
        if (score1 >= 85) {
          System.out.println("Excellent work!"); // nested condition is true, so it prints this line
        }
      } else if (score1 >= 70) {
        System.out.println("Grade: C"); // condition is false, so it won't print this line
      } else {
        System.out.println("Grade: D or F"); // condition is false, so it won't print this line
      }
      // Note: The above code will print "Grade: B" and "Excellent work!" since score is 85.
      // You can change the value of score to see different outputs.

      // Ternary operator example
      int age = 18; // you can change this value to test different conditions
      String result = (age >= 18) ? "You are an adult." : "You are a minor."; // condition is true, so it assigns the first value
      System.out.println(result); // prints "You are an adult."
      // Note: The above code will print "You are an adult." since age is 18.
      // You can change the value of age to see different outputs.

      // Switch case example
      int day = 3; // you can change this value to test different conditions
      switch (day) {
        case 1:
          System.out.println("Monday");
          break; // exits the switch block
        case 2:
          System.out.println("Tuesday");
          break; // exits the switch block
        case 3:
          System.out.println("Wednesday"); // condition is true, so it prints this line
          break; // exits the switch block
        case 4:
          System.out.println("Thursday");
          break; // exits the switch block
        case 5:
          System.out.println("Friday");
          break; // exits the switch block
        case 6:
          System.out.println("Saturday");
          break; // exits the switch block
        case 7:
          System.out.println("Sunday");
          break; // exits the switch block
        default:
          System.out.println("Invalid day"); // condition is false, so it won't print this line
      }
      // Note: The above code will print "Wednesday" since day is 3.
      // You can change the value of day to see different outputs.

      // Switch case with String example
      String fruit = "apple"; // you can change this value to test different conditions
      switch (fruit) {
        case "apple":
          System.out.println("You selected an apple."); // condition is true, so it prints this line
          break; // exits the switch block
        case "banana":
          System.out.println("You selected a banana.");
          break; // exits the switch block
        case "orange":
          System.out.println("You selected an orange.");
          break; // exits the switch block
        default:
          System.out.println("Unknown fruit"); // condition is false, so it won't print this line
      }
      // Note: The above code will print "You selected an apple." since fruit is "apple".
      // You can change the value of fruit to see different outputs.















  }
}
