package myJava;

public class String_IndexOf {

	// Java String indexOf() with only one parameter
	public static void main(String[] args) {
		String str1 = "Learn Java";
		int result;

		// getting index of character 'J'
		result = str1.indexOf('J');
		System.out.println(result); // 6

		// the first occurrence of 'a' is returned
		result = str1.indexOf('a');
		System.out.println(result); // 2

		// character not in the string
		result = str1.indexOf('j');
		System.out.println(result); // -1

		// getting the index of "ava"
		result = str1.indexOf("ava");
		System.out.println(result); // 7

		// substring not in the string
		result = str1.indexOf("java");
		System.out.println(result); // -1

		// index of empty string in the string
		result = str1.indexOf("");
		System.out.println(result); // 0
		
		
		
		String str2 = "Learn Java programming";

	    // getting the index of character 'a'
	    // search starts at index 4
	    result = str2.indexOf('a', 4);
	    System.out.println(result);  // 7

	    // getting the index of "Java"
	    // search starts at index 8
	    result = str2.indexOf("Java", 8);
	    System.out.println(result);  // -1
		
		
	}

}
