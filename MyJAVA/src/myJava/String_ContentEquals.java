package myJava;

public class String_ContentEquals {

	public static void main(String[] args) {
		String str = "Java";

		String str1 = "Java";
		StringBuffer sb1 = new StringBuffer("Java");
		CharSequence cs1 = "Java";

		String str2 = "JavA";
		StringBuffer sb2 = new StringBuffer("JavA");
		CharSequence cs2 = "JavA";

		System.out.println(str.contentEquals(str1)); // true
		System.out.println(str.contentEquals(sb1)); // true
		System.out.println(str.contentEquals(cs1)); // true

		System.out.println(str.contentEquals(str2)); // false
		System.out.println(str.contentEquals(sb2)); // false
		System.out.println(str.contentEquals(cs2)); // false
		
		
//------Java String equals() Vs contentEquals()-----------------------------------------------------------------------
		
	    String str3 = "Java";
	    StringBuffer sb3 = new StringBuffer("Java");

	    System.out.println(str3.equals(sb3)); // false
	    System.out.println(str3.contentEquals(sb3)); // true
	}
}
