package com.Exponent.ExceptionHandling.TryCatch;

public class Example1 {

	public static void main(String[] args) {

		System.out.println("Main method");

		try {
			System.out.println("Outer Try Block");
			int i = 10 / 0;
			System.out.println(i);
		} catch (Exception e) {
			try {
				System.out.println(args[2]);			
			} catch (Exception e2) {
				
				System.out.println("Inner Catch block");
				
			}finally {
				System.out.println("Inner finally block");
			}
			System.out.println("outer catch block");
			
		}finally
		{
			System.out.println("Outer finally block ");
		}

	}

}