package practiseJava;

public class PalindromeString {

	public static void isTheStringPalindrome(String str) {
		System.out.print(str);
		String str1 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);
		}

		if (str.equals(str1)) {
			System.out.println(" is Palindrome");
		} else {
			System.out.println(" is not Palendrome");
		}
	}

	public static void main(String[] args) {

		isTheStringPalindrome("mnffnm");
		isTheStringPalindrome("Pranay");
	}

}
