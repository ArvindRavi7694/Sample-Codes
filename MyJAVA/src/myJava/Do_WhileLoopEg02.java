package myJava;

import java.util.Scanner;

public class Do_WhileLoopEg02 {

	public static void main(String[] args) {

		int sum = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number = ");
		int number = input.nextInt();

		do {
			sum += number;
			System.out.print("Enter a number : ");
			number = input.nextInt();
		} while (number >= 0);				//any +ve number is TRUE and any -ve number is FALSE

		System.out.println("Sum = " + sum);
		input.close();
	}
}
