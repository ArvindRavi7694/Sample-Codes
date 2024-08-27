package practiseJava;

public class Singleton {

//	- Singleton - A Class that can have only one Object/Instance of Class at a time, it is called a Singleton Class.
//    - How to design a singleton class →
//        1. Always make constructor as private
//        2. Write a public static method that has return of object of this singleton class (aka Lazy Initialization).
	
	private static Singleton singleton_instance = null;
	public String str;
	
	private Singleton() {								//private constructor
		str = "Hey I am using Singleton class pattern";
	}
	
	public static Singleton getInstance() {				//public static method that has return of object of this singleton class
		if(singleton_instance == null)
			singleton_instance = new Singleton();
		return singleton_instance;
	}
	
	public static void main(String[] args) {
		
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		x.str = (x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str = (z.str).toLowerCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}

}
