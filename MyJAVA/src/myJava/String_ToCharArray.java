package myJava;

public class String_ToCharArray {

	public static void main(String[] args) {
		String str = "Java Programming";

		// creating a char array
		char[] result;

		result = str.toCharArray();
		System.out.println(result); // Java Programming
		// the length of the char array result will be equal to the length of the string str.
	}
}
