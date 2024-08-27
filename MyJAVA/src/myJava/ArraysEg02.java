package myJava;

import java.util.Arrays;

public class ArraysEg02 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6 };

		System.out.println(Arrays.toString(array));  //printing array without using for or for-each loop
		
		//Array can only store similar datatype value. So to overcome this problem we use Object Array.
		//Object Array (Object is a class) - Object Array is used to store different datatypes values
		Object ob[]= new Object[6];
		ob[0] ="TOM";
		ob[1]=25;
		ob[2]=12.33;
		ob[3]="1/1/1990";
		ob[4]='M';
		ob[5]="London";
		
		System.out.println(Arrays.toString(ob));
	}
}
