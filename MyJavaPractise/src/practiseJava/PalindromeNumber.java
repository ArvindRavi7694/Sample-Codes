/**
 * 
 */
package practiseJava;

public class PalindromeNumber {

	public static void isPalindromeOrNot(int num) {
		
		System.out.print("Given "+num);
		
		int r;
		int sum=0;
		int t = 0;
		
		t = num;
		while(num<0) {
			r = num%10;
			sum = sum*10 + r;
			num = num/10;
		}
		
		if(num == t) {
			System.out.println(" is Palindrome");
		}else {
			System.out.println("is not Palindrome");
		}
	}
	
	
	
	public static void main(String[] args) {

		isPalindromeOrNot(852258);
		isPalindromeOrNot(9);
	}

}
