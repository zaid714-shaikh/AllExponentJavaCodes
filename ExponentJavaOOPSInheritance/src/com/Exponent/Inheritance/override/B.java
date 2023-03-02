package com.Exponent.Inheritance.override;

public class B extends A {

	@Override
	public void m1() {
		System.out.println("From B class");
	}

	public void m2() {
		System.out.println("hello");

	}

	public static void main(String[] args) {

		B b = new B();// child class object
		b.m1();// b+a
		b.m2();

		A a = new A();// parent Class Object
		a.m1();// a

		A a1 = new B();// parent child mix class
		a1.m1();
		

	}

}
