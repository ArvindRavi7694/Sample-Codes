package practiseJava;

public class Fctorial {

	public static void main(String[] args) {

		int n = 5;
		int fact_i = 1;
		int fact_j = 1;
		
		for (int i = n; i >= 1; i--) {
			fact_i = fact_i * i;
		}
		
		for (int j = 1; j <=n; j++) {
			fact_j = fact_j * j;
		}
		
		System.out.println("Factorail(i) of " + n + " is " + fact_i);
		System.out.println("Factorail(j) of " + n + " is " + fact_j);
	}

}
