package practiseJava;

public class FinalizeConcept {

	public void finalize() {
		System.out.println("This is a finalize method");
	}

	public static void main(String[] args) {

		FinalizeConcept f1 = new FinalizeConcept();
		f1 = null;

		System.gc();
	}

}
