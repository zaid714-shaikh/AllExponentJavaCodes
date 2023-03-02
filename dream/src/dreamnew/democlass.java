package dreamnew;

import java.util.Scanner;

public class democlass {
	
	String name;
	
	
	
	public static void display(String n)
	{
		System.out.println(n);
	}

	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		
		 
		 democlass c1  = new democlass();
		 System.out.println("Enter the name:=");
		 String name = sc.next();
		 display(name);
		 
		 

	}

}
