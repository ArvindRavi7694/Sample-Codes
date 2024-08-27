/**
 * 
 */
package practiseJava;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author arvind
 *
 */
public class FetchUniqueValsInArray {

	public static void main (String[] args) {
		int arr[] = {0,0,0,1,2,1,0,3,4,5,5,5,4,6,7,8,};
		
		System.out.println(Arrays.toString(arr));
		
		Set set = new LinkedHashSet<>();
		
		for(int val:arr) {
			set.add(val);
		}
		System.out.println(set);
		System.out.println(set.size());
		
		int arr1[] = new int[set.size()];
		int index = 0;
		for (Object o:set)
		{
			System.out.println(o);
			arr1 [index++] = ((Integer)o).intValue();
		}
		System.out.println(Arrays.toString(arr1));
	}
}
