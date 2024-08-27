package myJava;

public class ForEachLoop {

	public static void main(String[] args) {

		int[] numbers = { 3, 5, -7, -51, 84 };
		int sum = 0;

		for (int number : numbers) {
			System.out.println(number);
		}

		for (int num : numbers) {
			sum += num;
			System.out.println("Sum of all numbers is " + sum);
		}
	}
}
