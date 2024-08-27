package myJava;

import java.util.Arrays;

public class ArraysConcatenate {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6 };
		int[] array3 = { 7, 8, 9 };

		int aLen = array1.length;
		int bLen = array2.length;
		int cLen = array3.length;
		int[] result = new int[aLen + bLen + cLen];

		System.arraycopy(array1, 0, result, 0, aLen);
		System.arraycopy(array2, 0, result, aLen, bLen);
		System.arraycopy(array3, 0, result, aLen + bLen, cLen);

		System.out.println(Arrays.toString(result));
	}
}
