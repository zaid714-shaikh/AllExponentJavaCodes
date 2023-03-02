package com.Exponent.MethodPrameter;

public class Calculator {

	public static void main(String[] args) {
		
		Addition a = new Addition();
		a.add(10,50);
		
		Substraction s = new Substraction();
		s.sub(20, 20);
		
		Multiplication m  =new Multiplication();
		int c = m.mul();
		System.out.println("Multiplication is :: " + c);
		
		Division d = new Division();
		Values v = d.div();
		System.out.println("Division is :: " + v.c);
		
		System.out.println(d.div().a);
		
		

	}

}
