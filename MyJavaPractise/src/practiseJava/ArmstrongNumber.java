package practiseJava;

public class ArmstrongNumber {
	
	public static void isArmstrongOrNot(int num) {
		
		System.out.print("The "+num);
		
		int r=0;
		int t=0;
		int cube = 0;
		
		t=num;
		
		while (num>0) {
			r = num%10;
			cube = cube+(r*r*r);
			num = num/10;
		}
		
		if(t==cube) {
			System.out.println(" is Armstrong Number.");
		}else {
			System.out.println(" is not Armstrong Number.");
		}
	}

	public static void main(String[] args) {

		isArmstrongOrNot(153);
		isArmstrongOrNot(154);
	}

}
