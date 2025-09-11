import java.util.Arrays;
public class ArrayClassDemo{
	public static void main(String[] args){
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {91, 92, 93, 94, 95};
		int[] unsortedArr = {9, 6, 10, 8, 7};

		// Convert the array into String
		System.out.println("String representation (toString): " + Arrays.toString(arr1));

		// Fill the array with specified value
		int[] filledArray = new int[5];
		Arrays.fill(filledArray, 10);
		System.out.println("Filled array (fill): " + Arrays.toString(filledArray));

		// Copy an existing array with specified new length
		int[] copiedArr1 = Arrays.copyOf(arr1, 10);
		System.out.println("Copied array (copyOf): " + Arrays.toString(copiedArr1));

		// Check if two provided arrays are equals
		boolean isEquals1 = Arrays.equals(arr1, arr2);
		System.out.println("Is equal array 1 (equals): " + isEquals1);
		boolean isEquals2 = Arrays.equals(arr1, new int[]{1, 2, 3, 4, 5});
		System.out.println("Is equal array 2 (equals): " + isEquals2);
		boolean isEquals3 = Arrays.equals(arr1, new int[]{5, 4, 3, 2, 1});
		System.out.println("Is equal array 3 (equals): " + isEquals3);

		// Sort the provided array itself in ascending order
		int[] copiedArr2 = Arrays.copyOf(unsortedArr, 10);
		Arrays.sort(copiedArr2);
		System.out.println("Sorted array (sort): " + Arrays.toString(copiedArr2));

		// Perform binary search by value and return the index (CAUTION: the array must be sorted before use)
		int searchResult1 = Arrays.binarySearch(arr1, 3);
		System.out.println("Binary search result 1 (binarySearch): " + searchResult1);
		int searchResult2 = Arrays.binarySearch(unsortedArr, 7);
		System.out.println("Binary search result 2 (binarySearch): " + searchResult2); // Incorrect as unsorted 
	}
}