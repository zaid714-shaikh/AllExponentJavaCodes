package com.Exponent.JavaArray;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenghth of arry:- ");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter the element in array :- ");
			a[i] = sc.nextInt();
			
		}
		
		System.out.print("Your Array is :- ");
		
		for(int i:a)
		{
			System.out.print(" "+i);
		}

	}
}
