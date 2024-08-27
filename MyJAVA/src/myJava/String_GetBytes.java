package myJava;

import java.util.Arrays;
import java.nio.charset.Charset;

public class String_GetBytes {

	public static void main(String[] args) {

		String str = "Java";
		byte[] byteArray;

		//getBytes() With No Parameter
		// convert the string to a byte array
		// using platform's default charset
		byteArray = str.getBytes();
		System.out.println(Arrays.toString(byteArray));

//------getBytes() With CharSet Parameter-----------------------------------------------------------------------------
		
		// using UTF-8 for encoding
		byteArray = str.getBytes(Charset.forName("UTF-8"));
		System.out.println(Arrays.toString(byteArray));

		// using UTF-16 for encoding
		byteArray = str.getBytes(Charset.forName("UTF-16"));
		System.out.println(Arrays.toString(byteArray));

		// using UTF-16BE for encoding
		byteArray = str.getBytes(Charset.forName("UTF-16BE"));
		System.out.println(Arrays.toString(byteArray));

		// using UTF-16LE for encoding
		byteArray = str.getBytes(Charset.forName("UTF-16LE"));
		System.out.println(Arrays.toString(byteArray));

		// using US-ASCII for encoding
		byteArray = str.getBytes(Charset.forName("US-ASCII"));
		System.out.println(Arrays.toString(byteArray));

		// using ISO-8859-1 for encoding
		byteArray = str.getBytes(Charset.forName("ISO-8859-1"));
		System.out.println(Arrays.toString(byteArray));

//------getBytes() With String Parameter------------------------------------------------------------------------------

		try {
			byteArray = str.getBytes("UTF-8");
			System.out.println(Arrays.toString(byteArray));

			byteArray = str.getBytes("UTF-16");
			System.out.println(Arrays.toString(byteArray));

			// wrong encoding
			// throws an exception
			byteArray = str.getBytes("UTF-34");
			System.out.println(Arrays.toString(byteArray));

		} catch (Exception e) {
			System.out.println(e + " encoding is wrong");
		}
	}
}
