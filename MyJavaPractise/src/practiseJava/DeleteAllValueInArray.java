package practiseJava;

import java.util.Arrays;

public class DeleteAllValueInArray {

	public static void main(String[] args) {
		
		int arr[] = {4,7,8,12,9};
		
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i<arr.length; i++) {
			arr[i]=0;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
