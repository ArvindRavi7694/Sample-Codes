package myJava;

public class NestedIfElse {

	public static void main(String[] args) {

		int age = 12;
		int weight = 45;

		if (age >= 20) {
			if (weight >= 50) {
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("Your weight should be minimum 50 to donate blood");
			}
		} else {
			System.out.println("You are not eligible to donate blood as both of "
					+ "your age and weight does not meet the minimum requirment");
		}
	}
}
