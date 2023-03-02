package practicleexam;

import java.util.Scanner;

public class pattern {

	
	
	public static void main(String[] args)
	{
		
		int n=2;
		int i,j;
		for( i=0;i<n;i++)
		{
			
			for( j=i;j<=i;j++)
			{
				System.out.print(" ");
			}
			for( j=i;j<=i;j++)
			{
				System.out.print("*");
			}
			
		
			
		}
		System.out.println();
		
		for( j=i;j<=n;j++)
		{
			System.out.print("*");
		}
		for( j=i;j<=i;j++)
		{
			System.out.print(" ");
		}
		for( j=i;j<=n;j++)
		{
			System.out.print("*");
		}
	}
}
