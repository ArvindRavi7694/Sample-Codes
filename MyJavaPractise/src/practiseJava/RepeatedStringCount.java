package practiseJava;

import java.util.Arrays;

public class RepeatedStringCount {

	public static void main(String[] args) {
		String str = "the bird is beautiful and the girl is watching the bird and the boy is watching the birds";

		String arr[] = str.split(" ");

		int count = 0;

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equalsIgnoreCase("the")) {
				count++;
			}
		}
		System.out.println("'the' is repeated " + count + " times");
	}
}
