package practiseJava;

public class PrimeNumber {

	public static boolean isPrimeOrNot(int num) {

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void getPrimeNumbers(int num) {

		for (int j = 2; j <= num; j++) {
			if (isPrimeOrNot(j))
				System.out.print(j + " ");
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {

		System.out.println("is 2 Prime -> " + isPrimeOrNot(2));

		getPrimeNumbers(30);
		getPrimeNumbers(50);
	}
}
