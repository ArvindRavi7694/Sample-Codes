package myJava;

public class MultidimensionalArraysEg02 {
	
	public static void main(String[] args) {
		
		int[][] a = {
				{1, -2, 3},
				{-4, -5, 6, 9},
				{7, 10, -8,}
		};
		
		// for loop
		for(int i=0; i< a.length; ++i) {
			for(int j=0; j<a[i].length; ++j) {
				System.out.println(a[i][j]);
			}
		}
		
		//for-each loop
		for (int[] innerArray: a) {
			for(int data : innerArray) {
				System.out.println(data);
			}
		}
		
	}
}
