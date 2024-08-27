package practiseJava;

public class PrimeNumberSeries {

	public static void main(String[] args) {

		int num1 = 1000000000;
		int num = 2, count = 0;
		
		boolean flag;
		
		while (count <= num1) {

			flag = true;
			
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(count + " -> " + num);
				count++;
			}
			num++;
		}
	}
}