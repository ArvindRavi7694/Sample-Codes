package oops_Polymorphism;

public class Polymorphic_Variables {

	public static void main(String[] args) {

		// declare an object variable
		ProgrammingLanguage pl;

		// create object of ProgrammingLanguage
		pl = new ProgrammingLanguage();
		pl.display();

		// create object of Java class
		pl = new Java_extends_ProgrammingLanguage();
		pl.display();
	}
}

//In the above example, we have created an object variable pl of the ProgrammingLanguage class.
//Here, pl is a polymorphic variable. This is because,

//In statement pl=new ProgrammingLanguage(),pl refer to the object of the ProgrammingLanguage class.And,
//In statement pl=new Java(),pl refer to the object of the Java class.