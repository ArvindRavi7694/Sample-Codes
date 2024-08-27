/**
 * 
 */
package practiseJava;

/**
 * @author arvind
 *
 */
public class ReverseANumber {

	static int reverse(int i) {
//		int reverseUsingWhile = 0;
		int reverseUsingFor = 0;

//		while (i > 0) {
//			int remainder = i % 10;
//			reverseUsingWhile = remainder + reverseUsingWhile * 10;
//			i = i / 10;
//		}

		for ( ; i > 0; i = i / 10) {
			int remainder = i % 10;
			reverseUsingFor = remainder + reverseUsingFor * 10;
		}

//		return reverseUsingWhile;
		return reverseUsingFor;
	}

	public static void main(String[] args) {
		// 1st way
		int i = 1234;

		System.out.println(reverse(i));

		// 2nd way
//		int i1 = Integer.parseInt(new StringBuffer(Integer.toString(i)).reverse().toString());
//		System.out.println("int -> string -> stringbuffer -> reverse -> string -> int" + i1);
	}

}
