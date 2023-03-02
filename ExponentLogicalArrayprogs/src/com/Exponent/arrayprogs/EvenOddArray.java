package com.Exponent.arrayprogs;

public class EvenOddArray {
	
	public static void main(String[] args) {
		int a[] = {3,4,2,3,2,4,2};
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0)
			{
				System.out.println("Even Number" + a[i]);
			}else
			{
				System.out.println("Odd Number " + a[i]);
			}
			
		}
	}

}
