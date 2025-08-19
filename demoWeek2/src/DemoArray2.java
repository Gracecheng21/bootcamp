import java.util.Arrays;

public class DemoArray2 {
  public static void main(String[] args) {
    String[] arr = new String [] {"John", "Peter", "Lucas"};
    String[] newArr = Arrays.copyOf(arr, arr.length); 
    System.out.println(Arrays.toString(arr)); // [John, Peter, Lucas]
    System.out.println(Arrays.toString(newArr)); // [John, Peter, Lucas]

    arr[1] = "Vincent";
    System.out.println(Arrays.toString(arr)); // [John, Vincent, Lucas]
    System.out.println(Arrays.toString(newArr)); // [John, Peter, Lucas]

    // Sorting
    int[] ages = new int[] {65, 40, 18, 35, 70};
    Arrays.sort(ages);
    System.out.println(Arrays.toString(ages)); // [18, 35, 40, 65, 70]
  }
}
