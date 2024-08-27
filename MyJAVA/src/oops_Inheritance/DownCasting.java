/**
 * 
 */
package oops_Inheritance;

/**
 * @author arvind
 *
 */
public class DownCasting {

	public static void main(String[] args) {
		
		Parent p = new Child();
		p.name = "Arvind";
		
//		Performing Downcasting Implicitly   
//      Child c = new Parent(); // it gives compile-time error   
		
//      Performing Downcasting Explicitly   
		Child c = (Child)p;
		c.age = 22;
		
		System.out.println(c.name);
		System.out.println(p.name);
		System.out.println(c.age);
		c.showMessage();
		p.showMessage();
	}
}
