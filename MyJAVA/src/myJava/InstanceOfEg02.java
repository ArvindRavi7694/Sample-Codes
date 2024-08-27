package myJava;

//Java Program to check if an object of the subclass
// is also an instance of the superclass

// superclass
//class Animal {
//}

// subclass
class Dogs extends Animals {
}

public class InstanceOfEg02 {

	public static void main(String[] args) {

		// create an object of the subclass
		Dogs d1 = new Dogs();

		// checks if d1 is an instance of the subclass
		boolean result1 = d1 instanceof Dogs;
		System.out.println("d1 instanceof Dog : " + result1); // prints true

		// checks if d1 is an instance of the superclass
		boolean result2 = d1 instanceof Animals;
		System.out.println("d1 instanceof Animal : " + result2); // prints true
	}

}
