package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Arvind");
		hm.put(2, "is");
		hm.put(3, "learning");
		hm.put(4, "Java");
		hm.put(4, "Python");
		hm.put(0, "Python");

		System.out.println(hm.get(1));// here index number refer to the key
		System.out.println(hm.get(0));
		System.out.println(hm.get(5));

		System.out.println(hm);

		for (Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + "  " + m.getValue());
		}

		hm.remove(2);
		System.out.println(hm);

		HashMap<Integer, Employees> emp = new HashMap<Integer, Employees>();
		// Employees because it is a class. you cannot put a random word there.

		Employees e1 = new Employees("Franky", 25, "Shipwright");
		Employees e2 = new Employees("Chopper", 14, "Doctor");
		Employees e3 = new Employees("Robin", 25, "Archeologist");
		Employees e4 = new Employees("Jimbei", 45, "Helmsman");
		Employees e5 = new Employees("Brook", 25, "Musician");

		emp.put(6, e1);
		emp.put(7, e2);
		emp.put(8, e3);
		emp.put(9, e4);
		emp.put(10, e5);

		// traverse the hashmap
		for (Entry<Integer, Employees> m : emp.entrySet()) {

			int key = m.getKey();
			Employees e = m.getValue();

			System.out.println("Member " + key);
			System.out.println(e.name + " " + e.age + " " + e.role);
		}

	}

}
