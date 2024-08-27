/**
 * 
 */
package practiseJava;

/**
 * @author arvind
 *
 */
public class ReverseAString {

	public static void main(String[] args) {
		
		
		String str = "ARVIND";
		String strlc = str.toLowerCase();
		String str1 = "";
		for (int i=strlc.length()-1; i>=0; i--) {
			str1 = str1+ strlc.charAt(i);
		}
		
		String s1 = str1.substring(0,1).toUpperCase();
		String s2 = str1.substring(1);
		System.out.println(s1+s2);
//		System.out.println(str1);
		
		//OR
		
		String str2 = new StringBuffer(str).reverse().toString();
		System.out.println(str2);
	}
}
