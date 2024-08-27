package oopsConcept;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW b = new BMW();	// Static polymorphism aka Compile-Time polymorphism
		b.chasis();			// can use the parent class method even though it is not present in child class.
		b.start();			// overridden from parent class.
		b.stop();			// can use the parent class method even though it is not present in child class.
		b.refuel();			// can use the parent class method even though it is not present in child class.
		b.theftSafety();
		
		System.out.println("===================");
		
		Car c = new BMW(); // Up Casting aka dynamic polymorphism aka Run-Time polymorphism, child object is referred by parent variable.
		c.chasis();
		c.start();
		c.stop();
		c.refuel();
//		c.theftSafety(); as parent can't have access to the child methods.
		
		System.out.println("*******************");
		
		BMW b1 = (BMW)c;
		b1.chasis();
		b1.start();
		b1.stop();
		b1.refuel();
		b1.theftSafety();
		
		
	}

}
