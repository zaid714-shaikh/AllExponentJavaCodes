package dreamnew;

import java.util.Scanner;

public class demo {
	int id = 1;                                                  //Instance variable. 
	String name = "zaid";

	public void addition(int a,int b)                           //Object intitalization by Method Declaration
	{
		int c  = a+b;
		System.out.println("Additon is :- "+c);
	}
	public void sub(int a,int b)
	{
		int c  = a-b;
		System.out.println("Substraction is :- "+c);
	}
	public void mul(int a,int b)
	{
		int c  = a*b;
		System.out.println("Multiplication is :- "+c);
	}
	
	
	
	void club(int i,String n)
	{
		id  = i;                                                   //Object intialization by Constructor
		name  = n;
		
		System.out.println("id is:-" +id+ "name is:-" +name);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		demo d1 = new demo();                                   //Object creation of class demo
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a :- ");
		int a = sc.nextInt();
		System.out.println("Enter the b :- ");
		int b = sc.nextInt();
		d1.addition(a, b);                                       // Method Calling.
		d1.sub(a, b);
		d1.mul(a, b);
		
		
		d1.id=1;
		d1.name = "zaid";                                        //object intialization by Reference varaible.
		System.out.println("name -" +d1.id+"id -"+d1.name);
		
		
		
		
		
		
		d1.club(300,"simran");
		
		
		
	}

}
