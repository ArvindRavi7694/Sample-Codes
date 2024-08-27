/**
 * 
 */
package practiseJava;

/**
 * @author arvind
 *
 */
public class Array2D {

	public static void main(String[] args) {

		int[][] array = { { 1, 5, 9, 0 }, { 2, 4, 8, 6 }, { 3, 7, 5, 1 } };

//		System.out.println(Arrays.deepToString(array));
		
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				System.out.println(array[row][col]);
			}
		}
	}
}
