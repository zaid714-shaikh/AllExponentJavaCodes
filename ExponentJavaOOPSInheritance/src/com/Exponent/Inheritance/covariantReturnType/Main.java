package com.Exponent.Inheritance.covariantReturnType;

public class Main {

	public B test() {
		
		C c = new C();

		return c;
	}

	public static void main(String[] args) {

		Main m = new Main();

		C c = (C) m.test();
	

	}
}
