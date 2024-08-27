package myJava;

public class MultidimensionalArraysEg01 {
	
	public static void main(String[] args) {
	
		int[][] a = {
				{1,2,3},
				{4,5,6,7},
				{8,9,10,11,12}
		};
		System.out.println("Length of 1st Row : "+a[0].length);
		System.out.println("Length of 2nd Row : "+a[1].length);
		System.out.println("Length of 3rd Row : "+a[2].length);
	}
}
