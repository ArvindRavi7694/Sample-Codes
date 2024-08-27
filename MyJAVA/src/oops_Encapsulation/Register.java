package oops_Encapsulation;

public class Register {

	public static void main(String[] args) {
		
		// create an object of Person
		Person vampire = new Person();
		
		// change age using setter
		vampire.setAge(350);
		
		// access age using getter
		System.out.println("Age of vampire is : " + vampire.getAge()+" years.");
	}
}
