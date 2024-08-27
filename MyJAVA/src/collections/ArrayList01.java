package collections;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		// create ArrayList
		ArrayList<String> languages = new ArrayList<>();

		// add() method without the index parameter
		languages.add("Java");
		languages.add("C");
		languages.add("Python");
		System.out.println("ArrayList: " + languages);
//-----------------------------------------------------------------------------------------------
		// add JavaScript at index 1
		languages.add(1, "JavaScript");

		// add C++ at index 3
		languages.add(3, "C++");
		
		System.out.println("New ArrayList: " + languages);
//-----------------------------------------------------------------------------------------------
		 // get the element from the arraylist
	    String str = languages.get(1);
	    System.out.print("Element at index 1: " + str);
	    
	    // change the element of the array list
	    languages.set(2, "Kotlin");
	    System.out.println("Modified ArrayList: " + languages);
	    
	    // remove element from index 2
	    String delete = languages.remove(3);
	    System.out.println("Updated ArrayList: " + languages);
	    System.out.println("Removed Element: " + delete);
	    

	}
}
