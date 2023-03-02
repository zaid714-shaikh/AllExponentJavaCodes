package com.Exponent.ExceptionHandling.TryCatch;

import java.util.Scanner;

public class CustomException {
	
	public static void ageValid(int age) throws Validationage
	{			
		if(age>18)
			
		{
			System.out.println("Valid for voting!!");
		}
		else
		{
			throw new Validationage("Invalid input");
		}
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int age  = sc.nextInt();
		try {
			ageValid(age);
		} catch (Validationage e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}
}
