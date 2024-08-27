package myJava;

// Java program to check if an object of a class is also
//an instance of the interface implemented by the class

//public interface Animal {
//}

class Dog implements Animal {
}

public class InstanceOfEg03 {

	public static void main(String[] args) {

		// create an object of the Dog class
		Dog d1 = new Dog();

		// checks if the object of Dog
		// is also an instance of Animal
		System.out.println(d1 instanceof Animal); // returns true
	}

}
