package com.Exponent.Inheritance.TypeCast;

public class Test {

	public static void main(String[] args) {

		int i = 10;
		float j = 5.0f;
		
		long l = i;
		double d = l;
		
		int g = (int) d;
		System.out.println(l);
		System.out.println(d);
		System.out.println(g);
		

	}
}
