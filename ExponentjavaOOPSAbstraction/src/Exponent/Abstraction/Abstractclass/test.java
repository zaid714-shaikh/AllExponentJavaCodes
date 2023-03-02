package Exponent.Abstraction.Abstractclass;

public class test extends demo {

	public static void main(String[] args) {
		
		demo t = new test();
		
		t.m1();
	}

	@Override
	public void m1() {

		System.out.println("Implementation changed in test class ");

	}

}
