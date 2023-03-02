package com.Exponent.Inheritanceoverrideproject;

public class RunApp {

	public void getmarutiDetails(Maruti m) {
		System.out.println("--Maruti Car Details--");
		System.out.println(m.toString());
		m.carType();
	}

	public static void main(String[] args) {

		System.out.println("--TATA Car Details--");
		TATA t = new TATA();

		TATA t2 = (TATA) t.showDetailstata();
		System.out.println(t2.toString());
		t.carType();

		System.out.println();
		System.out.println();

		System.out.println("--Audi Car Details--");
		Audi a = new Audi();
		Audi au = (Audi) a.showDetailstata();
		System.out.println(au.toString());
		a.carType();

		System.out.println();
		System.out.println();

		Maruti m = new Maruti();
		m.marutidetails();

	}
}