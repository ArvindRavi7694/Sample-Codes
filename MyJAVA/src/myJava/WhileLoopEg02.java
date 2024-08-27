package myJava;

import java.util.Scanner;

public class WhileLoopEg02 {

	public static void main(String[] args) {

		int sum = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number = ");
		int number = input.nextInt();

		while (number <= 0) {       //any -ve number is TRUE and any +ve number is FALSE
			sum += number;

			System.out.print("Enter a number : ");
			number = input.nextInt();
		}
		System.out.println("Sum = " + sum);
		input.close();
	}
}
