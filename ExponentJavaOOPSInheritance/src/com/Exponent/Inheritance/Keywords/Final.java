package com.Exponent.Inheritance.Keywords;

public class Final {

	final int i = 20;

	
	public final void m1() {
		System.out.println("From m1");
		
	}

	public static void main(String[] args) {

		Final f = new Final();
		
		System.out.println(f.i);
	}
}
