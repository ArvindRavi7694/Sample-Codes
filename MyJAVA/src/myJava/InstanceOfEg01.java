package myJava;

public class InstanceOfEg01 {

	public static void main(String[] args) {

		// create a variable of string type
		String name = "Programiz";

		// checks if name is instance of String
		boolean result1 = name instanceof String;
		System.out.println("name is an instance of String: " + result1);

		// create an object of Main
		InstanceOfEg01 obj = new InstanceOfEg01();

		// checks if obj is an instance of Main
		boolean result2 = obj instanceof InstanceOfEg01;
		System.out.println("obj is an instance of Main: " + result2);
	}

}
