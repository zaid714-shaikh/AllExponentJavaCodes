package com.zaid;

import java.util.Scanner;

public class Addition implements Iadd{
	
	int a,c; 
	int b;
	
	public void add()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number:-");
		a = sc.nextInt();
		System.out.println("Enter Second number:-");
		b = sc.nextInt();
		c = a+b;
		
	
	}

}
