package myJava;

public class String_StartsWith_and_EndsWith {

	public static void main(String[] args) {

		String str = "Java Programming";

		//startsWith() Method
		System.out.println(str.startsWith("Java")); // true
		System.out.println(str.startsWith("J")); // true
		System.out.println(str.startsWith("Java Program")); // true
		System.out.println(str.startsWith("java")); // false
		System.out.println(str.startsWith("ava")); // false

//		Here, we have passed 3 as an offset. Hence, in the above program, startsWith()
//		checks whether "a Programming" begins with the specified string.
		System.out.println(str.startsWith("Java", 3)); // false
		System.out.println(str.startsWith("a Pr", 3)); // true
		
//----------------------------------------------------------------------------------------
		
		//endsWith() Method
		System.out.println(str.endsWith("mming")); // true
	    System.out.println(str.endsWith("g")); // true
	    System.out.println(str.endsWith("a Programming")); // true

	    System.out.println(str.endsWith("programming")); // false
	    System.out.println(str.endsWith("Java")); // false
	}

}
