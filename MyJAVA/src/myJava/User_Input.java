package myJava;

import java.util.Scanner;

public class User_Input {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an Integer : ");
		int number = input.nextInt();
		System.out.println("You have Entered : " + number);
		
		
		System.out.print("Enter a Double : ");
		double myDouble = input.nextDouble();
		System.out.println("You have Entered : " + myDouble);
		
		System.out.print("Enter a Float : ");
		float myFloat = input.nextFloat();
		System.out.println("You have Entered : " + myFloat);
		
		System.out.print("Enter a String : ");
		String myString = input.next();
		System.out.println("You have Entered : " + myString);

		input.close();
	}
}
