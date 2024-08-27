package practiseJava;

public class SpecifiedAlphabetInAString {

	public static void main (String[] args) {
		
		String str = "Shankar Mahadevan";
		int count = 0;
		for (int i = 0; i< str.length(); i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println(count);
	}
}
