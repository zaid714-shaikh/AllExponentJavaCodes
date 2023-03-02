package Exponent.Polymorphisam.MethodOverloading;

public class Demo1 extends Demo {

	public static void m1() {
		System.out.println("HI");
	}

	public static void m1(int s) {
		System.out.println("Hi from Integer Class");
	}

	public static void m1(String s1) {
		System.out.println("Hi from String Class");
	}

	public static void main(String[] args) {

		m1(Demo.i);
		m1();

	}
}
