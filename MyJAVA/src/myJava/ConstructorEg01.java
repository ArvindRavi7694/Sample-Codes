package myJava;

public class ConstructorEg01 {

	private String name;

	// user defined constructor
	ConstructorEg01() {
		System.out.println("The name of");
		name = "ExcelR";
	}

	public static void main(String[] args) {
		// constructor is invoked
		// creating an object of the ConstructorEg01 class
		ConstructorEg01 object = new ConstructorEg01();
		System.out.println("The Constructor is :  " + object.name);
	}
}
