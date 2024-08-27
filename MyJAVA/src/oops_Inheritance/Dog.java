package oops_Inheritance;

//inherit from Animal
public class Dog extends Animal {

	// new method in subclass
//	public void display() {
//		System.out.println("My name is " + name);
//	}
//---------------------------------------------------------------------------
	// overriding the eat() method
//	@Override
//	public void eat() {
//		String food = "Drools";
//		// call method of superclass
//		System.out.println("I eat " + super.food);
//		System.out.println("I eat dog food " + food);
//	}
//---------------------------------------------------------------------------
	// new method in subclass
//	public void bark() {
//		System.out.println("I can bark");
//	}
//---------------------------------------------------------------------------
//	public void getInfo() {
//		System.out.println("My name is " + name);
//	}
//---------------------------------------------------------------------------
	// default or no-arg constructor of class Dog
	//super() can be used only inside the subclass constructor and must be the first statement.	
	
	Dog() {
		
		// calling parameterized constructor of the superclass
	    super("Animal");
	    
//		// calling default constructor of the superclass
//		super();

		System.out.println("I am a dog");
	}
}
