package com.Exponent.Inheritance.Keywords;

public class Static {



	static String name = "mitra mandal";
	int id;

	public static int m1(int a) {
		System.out.println(a);

		return a;
	}

	public static void main(String[] args) {

		Static s = new Static();
		Static.m1(30);
		

	}
}
