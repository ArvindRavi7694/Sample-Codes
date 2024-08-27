package practiseJava;

import java.util.Arrays;

public class WordSortInSentence {

	public static void main(String[] args) {

		String str = "today is a bright sunny day";
		String words[] = str.split(" ");
		
		System.out.println("Before Sorting -> ");
		System.out.println(Arrays.toString(words));
				
		String temp = "";
		
		boolean flag = true;
		
		while (flag) {
			flag = false;

			for (int i = 0; i < words.length - 1; i++) {
				if (words[i].length() > words[i+1].length()) {
//				if (words[i].compareToIgnoreCase(words[i+1])>0) {
					temp = words[i];
					words[i] = words[i + 1];
					words[i + 1] = temp;
					flag = true;
				}
			}
		}

		System.out.println("After 1st Sorting -> ");
		System.out.println(Arrays.toString(words));
	}

}
