package myJava;

public class String_ReplaceFirst {

	public static void main(String[] args) {
		String str1 = "aabbaaac";
		String str2 = "Learn223Java55@";

		// regex for sequence of digits
		String regex = "\\d+";

		// the first occurrence of "aa" is replaced with "zz"
		System.out.println(str1.replaceFirst("aa", "zz")); // zzbbaaac

		// replace the first sequence of digits with a whitespace
		System.out.println(str2.replaceFirst(regex, " ")); // Learn Java55@
		
//------Escaping Characters in replaceFirst()-------------------------------------------------------------------------
		
		// Program to the first + character
		String str = "a+a-++b";

	    // replace the first "+" with "#"
	    System.out.println(str.replaceFirst("\\+", "#")); // a#a-++b
	}
}
