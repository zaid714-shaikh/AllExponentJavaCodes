package com.Exponent.ExceptionHandling.TryCatch;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("Main method");
		try {
			System.out.println("Inner Try");
			int i = 10 / 0;
		} catch (Exception e) {
			System.out.println("Outer Catch Block");
			try {
				String s = null;
				System.out.println(s);
			} catch (Exception e2) {
				System.out.println("Inner Catch Block");
			} finally {
				System.out.println("InnerFinally Block");
			}
		} finally {
			System.out.println("Outer Finally Block");
			try {
				String name = null;
				System.out.println(name.length());
			} catch (Exception e2) {
				System.out.println(" Catch block from outer finally");
			}
		}
	}
}
