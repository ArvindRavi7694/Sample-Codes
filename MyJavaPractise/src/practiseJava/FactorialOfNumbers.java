package practiseJava;

public class FactorialOfNumbers {

	public static int notRecursiveFactorial(int num) { // non recursive method

		if (num == 0)
			return 1;

		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}
	
	public static int recursiveFactorial(int num) {
		
		if (num == 0)
			return 1;
		
		else
			return (num * recursiveFactorial(num-1));
	}

	public static void main(String[] args) {
		
		System.out.println(notRecursiveFactorial(0));
		System.out.println(notRecursiveFactorial(1));
		System.out.println(notRecursiveFactorial(6));
		
		System.out.println(recursiveFactorial(6));
		System.out.println(recursiveFactorial(1));
		System.out.println(recursiveFactorial(0));
		
	}

}
