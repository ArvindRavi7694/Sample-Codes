package oops_Inheritance;

public class Child extends Parent{

	int age;
	
	@Override
	void showMessage() {
		System.out.println("Child Method is Called.");
	}
	
	void PrintData() {
		System.out.println("Method of Child Class.");
	}
}
