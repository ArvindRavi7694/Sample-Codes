package myJava;

public class String_Substring_and_SubSequence {

	public static void main(String[] args) {
		String str1 = "program";

//		substring() Without End Index

		// from the first character to the end
		System.out.println(str1.substring(0)); // program

		// from the 4th character to the end
		System.out.println(str1.substring(3)); // gram

//		substring() With End Index

		// from 1st to the 7th character
		System.out.println(str1.substring(0, 7)); // program

		// from 1st to the 5th character
		System.out.println(str1.substring(0, 5)); // progr

		// from 4th to the 5th character
		System.out.println(str1.substring(3, 5)); // gr

//------SubSequence() Method------------------------------------------------------------------------------------------

		String str = "Java Programming";

		System.out.println(str.subSequence(3, 8)); // a Pro (returns as CharSequence not as a string)
	}

}
