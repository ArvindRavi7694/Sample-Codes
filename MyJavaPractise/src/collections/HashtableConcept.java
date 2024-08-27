package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashtableConcept {

	public static void main(String[] args) {

		Hashtable h1 = new Hashtable();
		h1.put(1, "Arvind");
		h1.put(2, "is learning");
		h1.put(3, "Java");

		System.out.println(h1);

		// create a clone copy or a shallow copy
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable) h1.clone();

		System.out.println("The values of h1 " + h1);
		System.out.println("The values of h2 " + h2);

		h1.remove(3);
		System.out.println(h1);

		// clear all the values inside a hashtable
		h1.clear();
		System.out.println("The values of h1 " + h1);
		System.out.println("The values of h2 " + h2);

		Hashtable st = new Hashtable();
		st.put("A", "Arvind");
		st.put("B", "finished");
		st.put("C", "Selenium");
		
		if(st.containsValue("Arvind"))
			System.out.println("Value is Found");

		//print all the values from hashtable using -- Enumeration -- by using [elements(); method]
		Enumeration e = st.elements();
		System.out.println("Print values from st :");
		
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
		//get all values from the hashtable using -- entrySet() method -- set of hashtable values:
		
		System.out.println("Print values from st using entrySet method :");
		
		Set s = st.entrySet();
		System.out.println(s);
		
		Hashtable st1 = new Hashtable();
		st1.put("A", "Arvind");
		st1.put("B", "finished");
		st1.put("C", "Selenium");
		st1.put("C", "Selenium");	//only contains unique values
//		st1.put(null, "dsgh");		//does not take null key and values.
//		st1.put("D", null);			//gives NullPointerException
		System.out.println("Values of st1 are :" + st1);
		
		//check if both the hashtable are equal or not
		if(st.equals(st1))
			System.out.println("Both are equal");
		
		//Get the value from a key
		System.out.println(st1.get("C"));
		
		//Get the hashcode or hashtable object:
		System.out.println("The hash code value of st1 : " + st1.hashCode());
		
		
		

		
		
		
		
		
		
	}

}
