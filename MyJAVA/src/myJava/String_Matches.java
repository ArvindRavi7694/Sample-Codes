package myJava;

public class String_Matches {

	public static void main(String[] args) {

		// a regex pattern for
		// five letter string that starts with 'a' and end with 's'
		String regex = "^a...s$";

//		Here, "^a...s$" is a regex, which means a 5 letter string that starts with "a" and ends with "s"
		System.out.println("abs".matches(regex)); // false
		System.out.println("alias".matches(regex)); // true
		System.out.println("an abacus".matches(regex)); // false
		System.out.println("abyss".matches(regex)); // true

		
		// a search pattern for only numbers
		String regex2 = "^[0-9]+$";

//	    Here, "^[0-9]+$" is a regex, which means only digits.
		System.out.println("123a".matches(regex2)); // false
		System.out.println("98416".matches(regex2)); // true
		System.out.println("98 41".matches(regex2)); // false
	}
}
