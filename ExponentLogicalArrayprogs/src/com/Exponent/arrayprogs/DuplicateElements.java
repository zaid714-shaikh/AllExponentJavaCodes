package com.Exponent.arrayprogs;

public class DuplicateElements {

	public static void main(String[] args) {
		int n[] = new int[]{1,1,2,3,4,4,5,6,6};
		
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]==n[j])
					System.out.println(n[j]);
			}
		}
		

	}

}
