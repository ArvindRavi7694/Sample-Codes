package myJava;

public class ForLoop_VS_ForEachLoop {

	public static void main(String[] args) {

		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		// for loop
		for (int i = 0; i <= vowels.length; i++) {
			System.out.println(vowels[i] + " - For Loop");
		}

		// for-each loop
		for (char item : vowels) {
			System.out.println(item + " - For-Each Loop");
		}
	}
}
