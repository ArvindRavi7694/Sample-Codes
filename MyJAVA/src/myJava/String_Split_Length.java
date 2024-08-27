package myJava;

import java.util.Arrays;

public class String_Split_Length {

	public static void main(String[] args) {
		
		String vowels = "a::e::i::o::u/z";
		
		// splitting the string at "::"
	    // storing the result in an array of strings
		String[] result = vowels.split("::");
		
		// converting array to string and printing it
		System.out.println("Result = " + Arrays.toString(result));
		
//---------------------------------------------------------------------------------
		
		//length() Method
		String str = "string length() method returns in int"; //37 including space
		System.out.println(str.length());
	}
}
