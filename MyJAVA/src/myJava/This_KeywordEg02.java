package myJava;

public class This_KeywordEg02 {

	String name;

	// setter method
	void setName(String name) {
		this.name = name;
	}

	// getter method
	String getName() {
		return this.name;
	}

	public static void main(String[] args) {
		This_KeywordEg02 obj = new This_KeywordEg02();

		// calling the setter and the getter method
		obj.setName("Toshiba");
		System.out.println("obj.name: " + obj.getName());
	}

}
