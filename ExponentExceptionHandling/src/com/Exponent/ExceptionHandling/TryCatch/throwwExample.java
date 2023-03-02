package com.Exponent.ExceptionHandling.TryCatch;

import java.util.Scanner;

public class throwwExample {

	public static void m1(int i) {
		if (i < 18) {
			throw new ArithmeticException("User is not eligible for creating the account");
		} else {
			System.out.println("User Is ready for creating the account");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : - ");
		int age = sc.nextInt();
		try {
			m1(age);
		} catch (Exception e) {
			System.out.println(e);

		}
		System.out.println("statemant 1");
		System.out.println("statement 2");

	}
}
