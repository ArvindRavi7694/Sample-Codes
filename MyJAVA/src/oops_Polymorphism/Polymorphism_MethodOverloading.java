package oops_Polymorphism;

public class Polymorphism_MethodOverloading {

	public static void main(String[] args) {
		Pattern d1 = new Pattern();

		// call method without any argument
		d1.display();
		System.out.println("\n");

		// call method with a single argument
		d1.display('#');
	}
}
