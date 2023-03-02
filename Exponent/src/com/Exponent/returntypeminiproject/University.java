package com.Exponent.returntypeminiproject;

public class University {

	public static void main(String[] args) {
		
		Collage c = new Collage();

		System.out.println("---------------------------------------------");
		Allstudent a1 = c.alls();
		System.out.println(a1.s.name);
		System.out.println(a1.s.Rollno);
		System.out.println(a1.s.Address);

	}

}
