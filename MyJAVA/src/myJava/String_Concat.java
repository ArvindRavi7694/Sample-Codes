package myJava;

public class String_Concat {

	public static void main(String[] args) {
		String str1 = "Learn ";
		String str2 = "Java ";
		String str3 = "Programming";

		// concatenate str1 and str2
		System.out.println(str1.concat(str2)); // "Learn Java"

		// concatenate str2 and str11
		System.out.println(str2.concat(str1)); // "Java Learn "

		System.out.println(str1.concat(str2.concat(str3))); // "Learn Java Programming"
		System.out.println(str1.concat(str2).concat(str3)); // "Learn Java Programming"
	}

}
