package com.Exponent.ExceptionHandling.TryCatch;

public class MultipleCatchBlock {

	public static void main(String[] args) {

		System.out.println("Main method");
		try {
			int i = 10 / 0;
			System.out.println(i);
			System.out.println(args[3]);
			Integer n = new Integer("abc");
		} catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {

			System.out.println(e);
		}
	}

}
