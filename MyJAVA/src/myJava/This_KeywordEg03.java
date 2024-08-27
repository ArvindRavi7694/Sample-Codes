package myJava;

// code for complex number using this keyword

public class This_KeywordEg03 {

	private int a, b;

	// constructor with 2 parameters
	private This_KeywordEg03(int i, int j) {
		this.a = i;
		this.b = j;
	}

	// constructor with single parameter
	private This_KeywordEg03(int i) {
		// invokes the constructor with 2 parameters
		this(i, i);
	}

	// constructor with no parameter
	private This_KeywordEg03() {
		// invokes the constructor with single parameter
		this(0);
	}

	@Override
	public String toString() {
		return this.a + " + " + this.b + "i";
	}

	public static void main(String[] args) {

		// creating object of Complex class
		// calls the constructor with 2 parameters
		This_KeywordEg03 c1 = new This_KeywordEg03(2, 3);

		// calls the constructor with a single parameter
		This_KeywordEg03 c2 = new This_KeywordEg03(3);

		// calls the constructor with no parameters
		This_KeywordEg03 c3 = new This_KeywordEg03();

		// print objects
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
