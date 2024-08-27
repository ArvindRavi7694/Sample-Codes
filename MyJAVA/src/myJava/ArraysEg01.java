package myJava;

public class ArraysEg01 {

	public static void main(String[] args) {

		int[] numbers = { 2, 42, 54, -71, 63, 06, 59, -26, -11, 38 };
		int sum = 0;
		Double average;
		
		System.out.println(numbers[11]);// will give ArrayIndexOutOfBoundExecption


		//for loop
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			sum += numbers[i];
		}
		
		//for-each loop
		for (int number : numbers) {
			System.out.println(number);
			sum += number;
		}

		int arrayLength = numbers.length;

		average = ((double) sum / (double) arrayLength);

		System.out.println("SUM : " + sum);
		System.out.println("AVERAGE : " + average);
	}
}