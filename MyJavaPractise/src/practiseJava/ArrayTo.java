package practiseJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayTo {

	public static void main(String[] args) {

		//===========================Array To List===========================
		
		Integer arrI[] = {40,50,60,70,80};
		int arr[] = { 4, 5, 6, 7, 8 };

		// Soln 1 -> if the array is not a primitive array. For Eg: Integer, Double, etc
		List arrlst1 = Arrays.asList(arr);
		List arrIlst1 = Arrays.asList(arrI);
		
		System.out.println("First Array List of int -> " + arrlst1);
		System.out.println("First Array List of Integer-> " + arrIlst1);

		// Soln 2 -> if the array is not a primitive array. For Eg: Integer, Double, etc
		ArrayList arrlst2 = new ArrayList<>(Arrays.asList(arr));
		ArrayList arrIlst2 = new ArrayList<>(Arrays.asList(arrI));
		
		System.out.println("Second Array List of int -> " + arrlst2);
		System.out.println("Second Array List of Integer-> " + arrIlst2);

		// Soln 3 -> if the array is a primitive array. For Eg : int, double, float, etc.
		ArrayList arrlst3 = new ArrayList<>();

		for (int val : arr) {
			arrlst3.add(val);
		}

		System.out.println("Third Array List -> " + arrlst3);
		
		//===========================ArrayList To LinkedList===========================
		
		LinkedList llst = new LinkedList<>(arrlst3);
		System.out.println("Linked List -> " + llst);
		System.out.println(llst.getClass().getName());
		
		//===========================LinkedList To ArrayList===========================
	
		ArrayList arrlstrev = new ArrayList<>(llst);
		System.out.println("Reversed Array List -> " + llst);
		System.out.println(arrlstrev.getClass().getName());
		
		//===========================Count in an integert===========================
		
		int i = 13245;
		int count = 0;
		
		while (i>0) {
			i=i/10;
			count++;
		}
		System.out.println("Count : " + count);
	}

}
