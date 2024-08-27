package collections;

import java.util.TreeMap;

public class TreeMap01 {

	public static void main(String[] args) {

		TreeMap<String, Integer> numbers = new TreeMap<>();

		numbers.put("One", 1);
		numbers.put("Three", 3);
		numbers.put("Four", 4);
		numbers.put("Two", 2);
		System.out.println("TreeMap: " + numbers);

		// Using entrySet()
		System.out.println("Key/Value mappings: " + numbers.entrySet());

		// Using keySet()
		System.out.println("Keys: " + numbers.keySet());

		// Using values()
		System.out.println("Values: " + numbers.values());

		// Using get()
		int value1 = numbers.get("Three");
		System.out.println("Using get(): " + value1);

		// Using getOrDefault()
		int value2 = numbers.getOrDefault("Five", 5);
		System.out.println("Using getOrDefault(): " + value2);

		// remove method with single parameter
		int value = numbers.remove("Two");
		System.out.println("Removed value: " + value);

		// remove method with two parameters
		boolean result = numbers.remove("Three", 3);
		System.out.println("Is the entry {Three=3} removed? " + result);

		// Using replace()
		numbers.replace("Second", 22);
		numbers.replace("Third", 3, 33);
		System.out.println("TreeMap using replace: " + numbers);

		// Using replaceAll()
		numbers.replaceAll((key, oldValue) -> oldValue + 2);
		System.out.println("TreeMap using replaceAll: " + numbers);

		System.out.println("Updated TreeMap: " + numbers);
	}

}
