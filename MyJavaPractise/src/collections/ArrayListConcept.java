package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Non-Generic ArrayList -> can store all types of values in a single array
		ArrayList ar = new ArrayList();
		ar.add(13);
		ar.add("String");
		ar.add('D');
		ar.add(40.22);
		
		System.out.println(ar.size());
		
		for(int i = 0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//Generic ArrayList -> Generic means parameterized types.
		//The idea is to allow type (Integer, String, … etc., and user-defined types)
		//to be a parameter to methods, classes, and interfaces.
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Only");
		ar1.add("String");
		ar1.add("is allowed");
//		ar1.add(11);//compileTime error is displayed.
		
		//Similarly STRING can be replaced by INTEGER, DOUBLE, etc.
		//Only WRAPPER class can be used, it does not accept data types.
		
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(10);
		ar2.add(15);
		ar2.add(20);
		ar2.add(25);
		
		ArrayList<Integer> ar3 = new ArrayList<Integer>();
//		ar3.add(10);
		ar3.add(1555);
//		ar3.add(20);
		ar3.add(2555);
		
		ArrayList<Integer> ar4 = new ArrayList<Integer>();
		ar4.add(10);
		ar4.add(2555);
		
		System.out.println("================Add, Retain & Remove================");
		
		ar2.addAll(ar3);
		System.out.println("AddAll method (ar2+ar3) -> ");
		for(int i = 0; i<ar2.size(); i++) {
			System.out.println(ar2.get(i));
		}
		
		ar2.removeAll(ar3);		
		System.out.println("RemoveAll method (ar2-ar3) -> ");
		for(int j = 0; j<ar2.size(); j++) {
			System.out.println(ar2.get(j));
		}
		
		ar2.retainAll(ar4);
		System.out.println("RetainAll method -> ");
		for(int i = 0; i<ar2.size(); i++) {
			System.out.println(ar2.get(i));
		}
		
		//Create an object for Employees
		Employees emp1 = new Employees("Luffy", 16, "Captain");
		Employees emp2 = new Employees("Zoro", 19, "Swordsman");
		Employees emp3 = new Employees("Nami", 17, "Navigator");
		Employees emp4 = new Employees("Sanji", 19, "Chef");
		Employees emp5 = new Employees("Ussop", 18, "Sniper");
		
		//create arrayList for the employees
		ArrayList<Employees> arEmp = new ArrayList<Employees>();
		arEmp.add(emp1);
		arEmp.add(emp2);
		arEmp.add(emp3);
		arEmp.add(emp4);
		arEmp.add(emp5);
		
		//iterator to traverse the values -> converting the already present values for looping -> store in a reference variable.
		//iterator is not like arrayList to create a storage in JDK, that means not to create a object for iterator.
		Iterator<Employees> it = arEmp.iterator();
		while(it.hasNext()) {
			Employees emp = it.next();
			System.out.println("Name - " + emp.name +
					"; Age - " + emp.age +
					"; Role - " + emp.role);
		}
		
	}

}
