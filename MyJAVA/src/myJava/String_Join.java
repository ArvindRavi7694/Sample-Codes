package myJava;

import java.util.ArrayList;

public class String_Join {

	public static void main(String[] args) {

		String str1 = "I";
		String str2 = "love";
		String str3 = "Java";

		// join strings with space between them
		String joinedStr = String.join(" ", str1, str2, str3);

		System.out.println(joinedStr);
		
//------Java String join() With CharSequence()------------------------------------------------------------------------

		String result;

		result = String.join("-", "Java", "is", "fun");
		System.out.println(result); // Java-is-fun

//------Java String join() With Iterable(ArrayList, HashSet, etc...)--------------------------------------------------

		ArrayList<String> text = new ArrayList<>();

		// adding elements to the arraylist
		text.add("Java");
		text.add("is");
		text.add("fun");

		result = String.join("-", text);
		System.out.println(result); // Java-is-fun

	}

}
