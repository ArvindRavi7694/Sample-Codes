package myJava;

public class This_KeywordEg01 {

	int age;

	This_KeywordEg01(int age){
	        this.age = age;
	    }

	public static void main(String[] args) {
		This_KeywordEg01 obj = new This_KeywordEg01(8);
		System.out.println("obj.age = " + obj.age);
	}

}
