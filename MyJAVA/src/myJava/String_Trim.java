package myJava;

public class String_Trim {

	public static void main(String[] args) {
		String str1 = "     Learn   Java Programming ";
		String str2 = "Learn\nJava Programming\n\n   ";

		System.out.println(str1.trim());
		System.out.println(str2.trim());

		String str3 = "Learn\nJava \n\n   ";
		String result;

		// replace all whitespace characters with empty string
		result = str3.replaceAll("\\s", "");

		System.out.println(result); // LearnJava
	}
}
