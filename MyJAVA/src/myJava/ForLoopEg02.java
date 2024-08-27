package myJava;

public class ForLoopEg02 {

	public static void main(String[] args) {

		int sum = 0;
		int n = 1000;

		for (int i = 1; i <= n; i++) {
			sum += i;
//			System.out.println("Sum of 1st " + i + " numbers is = " + sum);
		}
		System.out.println("Sum : " + sum);
	}
}
