package com.WebForm;

import java.util.Scanner;

public class RunApp extends From {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		From f = new RunApp();
		f.FormFirstPage();
		
		System.out.println("Enter HOw mAny Forms You Want :- ");
		int formamount = sc.nextInt();
		int c = 1;
	
		while(c<=formamount)
		{
			f.FormInput();
			c++;
		}
		
		FeildsForForm f1 = f.FormInput();
		
		
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$The Form Number is " +FeildsForForm.Formno);
		System.out.println("_________________Verify Your Form Details____________________");
		System.out.println("Your Name is : - "+f1.getName());
		System.out.println("Your age is :- "+f1.getAge());
		System.out.println("Your Address :- "+f1.getAddress());
		System.out.println("Your Adhar Number :- " +f1.getAdharno());
		System.out.println("Your Pincode is :- "+f1.getPincode());
		System.out.println("_________________End__________________");
		
	}

}
