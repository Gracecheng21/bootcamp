import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    // problem
    int x = 2;
    int x2 = 8;
    int x3 = 1000;
    System.out.println(x); // 2
    System.out.println(x2); // 8
    System.out.println(x3); // 1000

    // Array，fixed length
    // ! Store a set of same type of values
    // For exmaple, a set of int values
    // 3 -> three place to store int values
    int[] arr = new int[3]; // set 3 arr[]

    // ! write value into array
    // 0 represents the first place of the array
    arr[0] = 2;
    arr[1] = 8;
    arr[2] = 1000;
    // arr[3] = 10; // error, array length 3 doesnot exist

    // ! read value from array
    System.out.println(arr[0]); // 2
    System.out.println(arr[1]); // 8
    System.out.println(arr[2]); // 1000

    // declare double array -> 4 values
    // 1.1, 9.2, -9.8, 77.9
    // print them out
    double[] arr2 = new double[4];
    arr2[0] = 1.1;
    arr2[1] = 9.2;
    arr2[2] = -9.8;
    arr2[3] = 77.9;

    // arr2.length -> array length
    // for (int i = 0; i < 4; i++) {
    for (int i = 0; i < arr2.length; i++) { // arr2.length = 4 [0,1,2,3]
      System.out.println(arr2[i]); // print out the whole array values
    }

    // String[]
    String[] arr3 = new String[3];
    arr3[0] = "abc";
    arr3[1] = "def";
    arr3[2] = "bootcamp";

    String[] arr4 = new String[] {"abc", "def", "bootcamp"};
    // for loop
    for (int i = 0; i < arr4.length; i++) {
      System.out.println(arr4[i]);
    }
    // for loop (all) + if (filtering)
    // Print the strings in the array, which length > 4
    for (int i = 0; i < arr4.length; i++) {
      if (arr4[i].length() > 4) {
        System.out.println(arr4[i]); // bootcamp
      }
    }
    // for loop + if (AND OR)
    // Print the strings in the array, which length > 4 & startsWith 'b'
    for (int i = 0; i < arr4.length; i++) {
      if (arr4[i].length() > 4 && arr4[i].startsWith("b")) {
        System.out.println(arr4[i]); // "bootcamp"
      }
    }

    // Print the strings in the array, which length = 3 or endswith 'p'
    for (int i = 0; i < arr4.length; i++) {
      if (arr4[i].length() == 3 || arr4[i].endsWith("p")) {
        System.out.println(arr4[i]);// "abc", "def", "bootcamp"
      }
    }

    int[] arr5 = new int [] {4, 7, -3, 1500, -100, 1000};
    // Print the max value in the array.
    // for loop + if
    int box = arr5[0];
    for (int i = 0; i < arr5.length; i++) {
      if (arr5[i] > box) {
        box = arr5[i];
      }
    }
    System.out.println(box); // 1500
    // Print the min value in the array
    int min = arr5[0];
    for (int i = 0; i < arr5.length; i++) {
      if (arr5[i] < min) {
        min = arr5[i];
      }
    }
    System.out.println(min); // -100

    // swap
    int a = 6;
    int b = 8;
    int backup = a;
    a = b;
    b = backup;
    System.out.println(a); // 8
    System.out.println(b); // 6

    int[] arr6 = new int[] {9, 7, 10, -3, 8};
    // Move the max value to the tail of the array.
    // for + if + swap
    for (int i = 0; i < arr6.length - 1; i++) { //compare 4 times
      if (arr6[i] > arr6[i + 1]) {
        backup = arr6[i];
        arr6[i] = arr6[i + 1];
        arr6[i + 1] = backup;
      }
    }
    System.out.println(Arrays.toString(arr6)); // [7, 9, -3, 8, 10]

    // Sorting
    // [7, 9, -3, 8, 10]
    // [x, x, -x, 9, 10]
    // ...
    // [-3, 7, 8, 9, 10]
    arr6 = new int[] {9, 7, 10, -3, 8};
    for (int i = 0; i < arr6.length -1; i++) { // step 1 set the loop time
      for (int j = 0; j < arr6.length - 1 - i ; j++) { // step 2 set the criteria for the loop
        if (arr6[j] > arr6[j + 1]) {
          backup = arr6[j];
          arr6[j] = arr6[j + 1];
          arr6[j + 1] = backup;
        }
      }
    }
    System.out.println(Arrays.toString(arr6)); // [-3, 7, 8, 9, 10]

  }

}
