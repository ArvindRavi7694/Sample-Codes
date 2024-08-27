package myJava;

public class MethodEg02 {

	public static int square(int num) {
		
		// return statement
	    return num * num;
	}

	public static void main(String[] args) {

		int num = 50;
		
		int result;

		result = MethodEg02.square(num); // calling method via class name because method is static
//		result = square(num); 			 // calling method directly because method is static
		System.out.println("The Square is " + result);
	}
}
