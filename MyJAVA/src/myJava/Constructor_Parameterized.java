package myJava;

public class Constructor_Parameterized {

	String languages;

	Constructor_Parameterized(String lang) {
		languages = lang;
		System.out.println(languages + " Programming Languages");
	}

	public static void main(String[] args) {

		// call constructor by passing a single value
		Constructor_Parameterized java = new Constructor_Parameterized("JAVA");
		Constructor_Parameterized python = new Constructor_Parameterized("PYTHON");
		Constructor_Parameterized c = new Constructor_Parameterized("C");
	}
}
