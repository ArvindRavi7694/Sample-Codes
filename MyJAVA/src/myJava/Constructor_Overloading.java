package myJava;

public class Constructor_Overloading {

	String language;
	
	// constructor with no parameter
	Constructor_Overloading() {
		this.language = "Java";
	}
	
	// constructor with a single parameter
	Constructor_Overloading(String language){
		this.language = language;
	}
	
	public void getName() {
		System.out.println("The Programming Language is " + this.language);
	}
	
	public static void main(String[] args) {
		
		Constructor_Overloading object1 = new Constructor_Overloading();
		Constructor_Overloading object2 = new Constructor_Overloading("Python");
		
//		System.out.println("The Programming Language is " + object1.language);
//		System.out.println("The Programming Language is " + object2.language);
//		instead of printing 2 times we can use getName non-static method
		
		object1.getName();
		object2.getName();
	}
	
}
