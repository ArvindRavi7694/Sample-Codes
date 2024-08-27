package myJava;

public class Constructor_NoArgument01 {

	int i;

	private Constructor_NoArgument01() {
		i = 5;
		System.out.println("In No Argument Constructor there is NO PARAMETER.");
	}

	public static void main(String[] args) {
		Constructor_NoArgument01 object = new Constructor_NoArgument01();
		System.out.println("Vslue of i : " + object.i);
	}
}
