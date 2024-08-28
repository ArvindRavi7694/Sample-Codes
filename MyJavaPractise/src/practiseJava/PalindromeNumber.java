/**
 * 
 */
package practiseJava;

public class PalindromeNumber {

	public static void isPalindromeOrNot(int num) {
		
		int r;
		int sum=0;
		int t = 0;
		
		t = num;
		
		while(num>0) {
			r = num%10;
			sum = sum*10 + r;
			num = num/10;
			System.out.println(" reversal number achived is : " + sum);
		}
		
		if(sum == t) {
			System.out.println("Given "+t+" is Palindrome");
		}else {
			System.out.println("Given "+t+" is not Palindrome");
		}
	}
	
	
	
	public static void main(String[] args) {

		isPalindromeOrNot(85258);
		isPalindromeOrNot(85259);
	}

}
