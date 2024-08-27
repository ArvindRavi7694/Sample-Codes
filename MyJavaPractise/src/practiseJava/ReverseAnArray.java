/**
 * 
 */
package practiseJava;

/**
 * @author arvind
 *
 */
public class ReverseAnArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60 };
		int startIndex = 0;
		int endIndex = arr.length - 1;
		int temp = 0;

		for (int i = 0; i <= 2; i++) {
			temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;

			startIndex++;
			endIndex--;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
