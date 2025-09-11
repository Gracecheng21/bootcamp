public class DemoLoop {
  public static void main(String[] args) {

    // ! For Loop
    // for (initialzation; continue condition; modifier)
    // for (int i = 0; i </= times; i++)
    // (由邊到開始，重覆幾多次，重覆下一次)
    // for (initialization expr; test expr; update expr); {
    // body of the loop (需要重覆運行的內容); {
    // } statements we want to execute （Sysout)
    // }


    // 2^3
    int x = 2;
    x = x * 2;
    x = x * 2;

    // Step 1 : i = 0
    // Step 2 : check if i < 3 (i = 0)
    // Step 3 : if yes, print hello
    // Step 4 : i + 1 = i++
    // Step 5 : check if i < 3 (i = 1)
    // Step 6 : if yes, print hello
    // Step 7 : i + 1 = i++
    // Step 8 : check if i < 3 (i = 2)
    // Step 9 : if yes, print hello
    // Step 10 : i + 1 = i++
    // Step 11 : check if i < 3 no (i = 3)
    // Step 12 : stop the loop

    for (int i = 0; i < 3; i++) { // i=0,1,2
      System.out.println("hello"); // print 3 times
    }

    // 2^10
    int y = 2;
    for (int i = 0; i < 9; i++) { // i = 0 to 9, 10 times
      y = y * 2;
    }
    System.out.println(y); // 1024

    int base = 2;
    int result = base;
    for (int i = 0; i < 9; i++) {
      result *= base;
    }
    System.out.println(result); // 1024

    // for if
    // print even numbers between 0 - 10
    // even number -> x % 2 == 0
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) { // % 2 = even number
        System.out.println(i);
      }
    }
    // use for loop to print 1 3 5 7 9
    for (int i = 0; i < 10; i++) { // 0-9
      if (i % 2 == 1) {
        System.out.println(i);
      }
    }

    // Print the char index of 'm', if found, print the index; if not found, print -1
    String s2 = "bootcamp";
    // boolean isFound = false;
    int index = -1; // same as boolean, set it is -1 means false
    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == 'm') {
        index = i; // if true, will replace the i to a new index value
        // isFound = true;
      }
    }
    // if (isFound == true) {
    System.out.println(index);

    // break
    // Find the character of 'a' in a given String, print the index of the character,
    String str = "character";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'a') {
        System.out.println(i); // 2
        break; // break the whole loop (stop the loop, exit the loop)
        // if not break will print 2 & 4
      }
    }

    // Find the first 3 character of 'a' in a given String
    String ss = "abcdeabcdeabcdeabcde";
    int counter = 0; // for java to counting times
    for (int i = 0; i < ss.length(); i++) {
      if (ss.charAt(i) == 'a') { // 0,1,2 ; or adding (&& counter < 3) also print 0,5,10 but it run slow
        if (counter >= 3) { // 0,5,10;
          break;
        }
        System.out.println(i);
        counter++; // if counter found once, counter the next
      }
    }

    // ! contiune + Loop
    // Print all index of charcater 'a' in a given String
    String ss2 = "abcabcabc";
    for (int i = 0; i < ss2.length(); i++) {
      if (ss2.charAt(i) == 'a') {
        System.out.println(i); // 0,3,6
      }
    }
    for (int i = 0; i < ss2.length(); i++) {
      if (ss2.charAt(i) != 'a') { // (!=) 觸發使用continue, 直接跳過回到上面條件再繼續loop
        continue; // skip the rest of code line, and then goes to (i++) next iteration
      } // 跳過所有不符合條件的loop, 只run符合條件的loop
      System.out.println(i); // 0,3,6 // same as above but more readable
    }

    String s = "hello";
    // for (int i = 0; )

    // for-each loop
    for (char ch : s.toCharArray()) {
      System.out.println(ch);
    }

    

  }
}
