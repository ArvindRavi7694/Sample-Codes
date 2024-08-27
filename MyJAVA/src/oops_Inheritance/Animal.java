package oops_Inheritance;

public class Animal {

	// field and method of the parent class
//	String name;
//
//	String food = "Royal Canin";
//
//	public void eat() {
//		System.out.println("I can eat");
//	}
//-----------------------------------------------------------------
//	protected String name;
//
//	protected void display() {
//		System.out.println("I am an animal.");
//	}
//-----------------------------------------------------------------
	// default or no-arg constructor of class Animal
	Animal() {
		System.out.println("I am an animal");
	}

	// parameterized constructor
	Animal(String type) {
		System.out.println("Type: " + type);
	}
}
