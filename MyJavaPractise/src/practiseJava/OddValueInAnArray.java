package practiseJava;

public class OddValueInAnArray {

	public static void main(String[] args) {
		int arr[] = { 10, 21, 30, 45, 55, 60 };

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
