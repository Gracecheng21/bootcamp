import java.util.Arrays;
public class StringClassDemo{
	public static void main(String[] args){
		String hello = "Hello";
		String world = "World";

		// Get the length
		int length = hello.length();
		System.out.println("\"Hello\" length (length): " + length);

		// Concatenate two strings
		String helloWorld = hello.concat(world); // exact same as: String helloWorld = hello + world;
		System.out.println("Concatenated string (concat): " + helloWorld);

		// Format string (use System.out.printf() directly if you just want to print out a formatted string ==> very useful at toString)
		String formatString = String.format("%s! This is a formatted string.", hello);
		System.out.println("Formatted string (format): " + formatString);

		// Get the character at a specific index
		char h = hello.charAt(0); // character of "Hello" at index 0 = 'H'
		System.out.println("First character (charAt): " + h);

		// Get the index of the provided character or string (FIRST appearance of the string)
		int firstFoundLIndex = "HelloHello".indexOf('l'); // Find the index of 'l' in "Hello"
		System.out.println("First index of 'l' (indexOf): " + firstFoundLIndex);
		int firstFoundLloIndex = "HelloHello".indexOf("llo"); // Find the start index (index of the first 'l') of "llo" in "Hello"
		System.out.println("First index of \"llo\" (indexOf): " + firstFoundLloIndex);

		// Get the index of the provided character or string (LAST appearance of the string)
		int lastFoundLIndex = "HelloHello".lastIndexOf('l');
		System.out.println("Last index of 'l' (lastIndexOf): " + lastFoundLIndex);
		int lastFoundLloIndex = "HelloHello".lastIndexOf("llo"); // Find the start index (index of the first 'l') of "llo" in "Hello"
		System.out.println("Last index of \"llo\" (lastIndexOf): " + lastFoundLloIndex);

		// Replace a character in a string
		String hallo = "Hello".replace('e', 'a');
		System.out.println("Replaced string (replace): " + hallo);

		// Replace all matched patterns into another string
		String happy = "Hello".replaceAll("ello", "appy");
		System.out.println("Replaced string (replaceAll): " + happy);

		// Check if the string is an empty string
		boolean isEmpty = "".isEmpty();
		System.out.println("Is empty string (isEmpty): " + isEmpty);

		// Check if the string is start with the provided string
		boolean isStartsWith = hello.startsWith("He");
		System.out.println("Is Starts with 'H' (startsWith): " + isStartsWith);

		// Check if the string contains the provided string
		boolean isContains = hello.contains("ll");
		System.out.println("Is contains \"ll\" (contains): " + isContains);

		// Split the string with the provided string
		String[] substrings = "Hello, World, My, Friend".split(", ");
		System.out.println("Splitted strings (split): " + Arrays.toString(substrings));

		// Transform the string into char array
		char[] charArr = hello.toCharArray();
		System.out.println("Character array (toCharArray): " + Arrays.toString(charArr));

		// Transform all characters in the string to lower case
		String lowerCased = hello.toLowerCase();
		System.out.println("Lower cased (toLowerCase): " + lowerCased);

		// Transform all characters in the string to upper case
		String upperCased = hello.toUpperCase();
		System.out.println("Upper cased (toUpperCase): " + upperCased);

		// Trim (Remove all spaces in front and end)
		String trimmed = "    Hello World!   ".trim();
		System.out.println("Trimmed string (trim): " + trimmed);

		// Formatted String Method 1
		String formatString1 = String.format("%d. %s and %s", 1, "you", "me");
		System.out.println("Formatted string (formatted): " + formatString1);

		// Formatted String Method 2
		String formatString2 = "%d. %s and %s".formatted(1, "you", "me");
		System.out.println("Formatted string (formatted): " + formatString2);


	}
}