package Exponent.Abstraction.Interface;

public class Test implements I1, I2 {

	@Override
	public void m2() {

		System.out.println("Hi from I2 Interface");

	}

	@Override
	public void m1() {
		System.out.println("Hi from I1 Interface");

	}

	public static void main(String[] args) {

		I1 i1 = new Test();

		i1.m1();

		I2 i2 = new Test();
		i2.m2();

		Test t = new Test();
		t.m1();
		t.m2();
	}

}
