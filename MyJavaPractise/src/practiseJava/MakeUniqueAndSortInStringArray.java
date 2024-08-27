package practiseJava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MakeUniqueAndSortInStringArray {

	public static void main(String[] args) {

		String str[] = { "Google", "Facebook", "Tesla", "Yahoo", "Yahoo", "Google", "Facebook", "Tesla", "eCommerce",
				"mCommerce" };

		// 1st Way
		Set hs1 = new HashSet<>();

		for (String strValue : str) {
			hs1.add(strValue);
		}
		System.out.println("HS1 -> " + hs1);
//		System.out.println(hs1.getClass().getName());

//		Object[] obj = hs1.toArray();
//		System.out.println(Arrays.toString(obj));
//		System.out.println(obj.getClass().getName());

		// 2nd Way
		Set hs2 = new HashSet(Arrays.asList(str));
		System.out.println("HS2 -> " + hs2);

		Object obj[] = hs2.toArray();
		Object temp = "";

		boolean flag = true;

		while (flag) {

			flag = false;

			for (int i = 0; i < obj.length - 1; i++) {
				if (((String) obj[i]).length() > ((String) obj[i + 1]).length()) {
//				if (((String) obj[i]).compareTo((String) obj[i + 1]) > 0) {
					temp = obj[i];
					obj[i] = obj[i + 1];
					obj[i + 1] = temp;
					flag = true;
				}
			}
		}
		System.out.println("OBJ -> " + Arrays.toString(obj));
	}
}
