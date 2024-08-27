package myJava;

import java.util.ArrayList;

public class String_ValueOf {

	public static void main(String[] args) {
		
		int a = 5;
		long l = -2343834L;
		float f = 23.4f;
		double d = 923.234d;

		// convert numbers to strings
		System.out.println(String.valueOf(a)); // "5"
		System.out.println(String.valueOf(l)); // "-2343834"
		System.out.println(String.valueOf(f)); // "23.4"
		System.out.println(String.valueOf(d)); // "923.234"

//--------------------------------------------------------------------------------------------------	
		
		char c = 'J';
		char ch[] = { 'J', 'a', 'v', 'a' };

		// convert char to string
		System.out.println(String.valueOf(c)); // "J"

		// convert char array to string
		System.out.println(String.valueOf(ch)); // "Java"

//---------------------------------------------------------------------------------------------------		
		
		char chr[] = { 'p', 'r', 'o', 'g', 'r', 'a', 'm' };
		int offset = 2;
		int length = 4;
		String result;

		// subarray {'o', 'g', 'r', 'a'} is converted to string
		result = String.valueOf(chr, offset, length);

		System.out.println(result); // "ogra"
		
//----------------------------------------------------------------------------------------------------		
		
		ArrayList<String> languages = new ArrayList<String>();
	    languages.add("Java");
	    languages.add("Python");
	    languages.add("Kotlin");

	    String result2;

	    // Output: "[Java, Python, Kotlin]"
	    result2 = String.valueOf(languages);
	    System.out.println(result2);
	}

}
