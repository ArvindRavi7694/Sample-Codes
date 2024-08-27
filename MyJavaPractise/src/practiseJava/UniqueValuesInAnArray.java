package practiseJava;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueValuesInAnArray {
	
	public static void main(String[] args) {
		
		int arr[] = { 0, 0, 0, 1, 2, 1, 0, 3, 4, 5, 5, 5, 4, 6, 7, 8 };

		Set set = new LinkedHashSet(arr.length);

		for (int val : arr) {
			set.add(val);
		}

		int[] arr1 = new int[set.size()];
		int index = 0;
		for (Object o : set) {
			arr1[index++] = ((Integer) o).intValue();
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1.getClass().getName());
		
		//=====================================Set to List=====================================
//		List list = new LinkedList(setobject);
		
		//=====================================List to Set=====================================
//		Set set = new HashSet(listobject);
		
		//=====================================Object of List=====================================
//		List lst = new ArrayList();
//		List lst = new LinkedList();
		
		//=====================================Object of List=====================================
//		Set set = new HashSet<>();
//		Set set = new TreeSet<>();
		
	}
}
