package com.Exponent.Inheritance.override;

public class Main extends Another{
	
	public void m3()
	{
		System.out.println("hi");
	}

	public static void main(String[] args) {
	
		
		Main m = new Main();
		m.m1();
		m.m2();
		
		Student a = new Main();
		a.m1();

	
		
	}
		
		
}
