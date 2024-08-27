package practiseJava;

public class OddValuesAndElement {

	public static void main(String[] args) {
		int arr[] = {10,21,30,45,55,60,73};
		
		for (int i = 1;i< arr.length;i+=2) {
			System.out.println("Values at Odd position : " + arr[i]);
		}
		
		for(int j=0; j<arr.length;j++) {
			if(arr[j]%2 !=0){
				System.out.println("Odd values are : " + arr[j]);
			}
		}
	}

}
