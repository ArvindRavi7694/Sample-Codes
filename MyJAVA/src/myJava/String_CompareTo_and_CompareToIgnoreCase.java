package myJava;

public class String_CompareTo_and_CompareToIgnoreCase {

	public static void main(String[] args) {

		String one = "ExcelR";
		String two = "Excelr";
		String three = "Solution";
		String four = "ExcelR";

		int result12 = one.compareTo(two);
		System.out.println(result12);

		int result13 = one.compareTo(three);
		System.out.println(result13);

		int result14 = one.compareTo(four);
		System.out.println(result14);
		
		int result23 = two.compareTo(three);
		System.out.println(result23);
		
		int result24 = two.compareToIgnoreCase(four); //similar to 12 but ignoring case difference
		System.out.println(result24);
		
		int result34 = three.compareTo(four);
		System.out.println(result34);
	}
}
