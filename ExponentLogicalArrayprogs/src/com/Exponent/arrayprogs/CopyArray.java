package com.Exponent.arrayprogs;

public class CopyArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int a1[] = new int[a.length];
		
//		for(int i=0;i<a.length;i++)
//		{
//			int temp = a[1];
//			a[1] = 0;
//			a[1] = a[2];
//			a[2] = temp;
//			
//			System.out.print(" "+a[i]);
//		}
	
		for (int i = 0; i < a.length; i++) {
			a1[i]  = a[i];
		}
		
		System.out.println("Array of a1");
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
	}
}
