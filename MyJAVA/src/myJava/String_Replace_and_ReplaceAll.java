package myJava;

public class String_Replace_and_ReplaceAll {

	public static void main(String[] args) {
		
		String str1 = "ARVIND";
		
		System.out.println(str1.replace("A", "D"));
		System.out.println(str1.replace("R", "r. "));
		System.out.println(str1.replace("4", "L"));
		
		String str2 = "Learning C++ in ExcelR";
		
		System.out.println(str2.replace("Learning C++", "Practising JAVA"));
		System.out.println("SOl".replace("SOl", "Solutions"));
		
		String str3 = "aabbccddaa";
		String str4 = "Practise123Java456Regularly";
		
		String regex = "\\d+"; //regex for sequence of digits
		
		System.out.println(str3.replaceAll("aa", "zz"));
		System.out.println(str4.replaceAll(regex, " "));
		
	}
}
