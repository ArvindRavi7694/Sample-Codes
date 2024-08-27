package collections;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;

public class Set01 {

	public static void main(String[] args) {
		// Creating a set using the HashSet class
		Set<Integer> set1 = new HashSet<>();

		// Add elements to the set1
		set1.add(2);
		set1.add(3);
		System.out.println("Set1: " + set1);

		// Creating another set using the HashSet class
		Set<Integer> set2 = new HashSet<>();

		// Add elements
		set2.add(1);
		set2.add(2);
		System.out.println("Set2: " + set2);

		// Union of two sets
		set2.addAll(set1);
		System.out.println("Union is: " + set2);

//----------------------------------------------------------------------------------------

		// Creating a set using the TreeSet class
		Set<Integer> numbers = new TreeSet<>();

		// Add elements to the set
		numbers.add(2);
		numbers.add(3);
		numbers.add(1);
		System.out.println("Set using TreeSet: " + numbers);

		// Access Elements using iterator()
		System.out.print("Accessing elements using iterator(): ");
		Iterator<Integer> iterate = numbers.iterator();
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
	}
}
