package myJava;

import java.util.Arrays;

public class ArraysEg03 {

	public static void main(String[] args) {

		int[][] array = { { 1, 5, 9 }, { 2, 4, 8, 6 }, { 3, 7 } };

//		System.out.println(Arrays.deepToString(array));
		
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				System.out.println(array[row][col]);
			}
		}
	}
}
