package myJava;

public class Switch {

	public static void main(String[] args) {

		int number = 44;
		String size;

		switch (number) {

		case 36:
			size = "XS";
			break;

		case 38:
			size = "S";
			break;

		case 40:
			size = "M";
			break;

		case 42:
			size = "L";
			break;

		case 44:
			size = "XL";
			break;

		default:
			size = "UNKNOWN";
			break;
		}
		System.out.println("Size = "+size);
	}
}
