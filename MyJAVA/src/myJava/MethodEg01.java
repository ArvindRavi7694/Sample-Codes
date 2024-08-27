package myJava;

public class MethodEg01 {

	public int addNumbers(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {

		int num1 = 54;
		int num2 = 32;

		MethodEg01 object = new MethodEg01(); // create an object of MeathodEg01

		int result = object.addNumbers(num1, num2); // calling method via object because method is non-static
		System.out.println("The Total is " + result);
	}
}
