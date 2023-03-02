
//University Class

package com.Exponent.PrameterizedMethod.project;

public class University extends Collage{

	public void Singlestudisplay(Student s) {
		System.out.println("----Single Student Details-----");
		System.out.println("Rollno : " + s.strollno);
		System.out.println("Name : " + s.stname);
		System.out.println("stadd : " + s.stadd);
		System.out.println();
		
		
	}

	public void Multiplestdisplay(AllStudent a1) {
		System.out.println("-----Multiple Students Details-----");
		System.out.println("Rollno : " + a1.s.strollno);
		System.out.println("Name : " + a1.s.stname);
		System.out.println("stadd : " + a1.s.stadd);

		System.out.println();
		System.out.println("Rollno : " + a1.s1.strollno);
		System.out.println("Name : " + a1.s1.stname);
		System.out.println("stadd : " + a1.s1.stadd);

		System.out.println();
		System.out.println("Rollno : " + a1.s2.strollno);
		System.out.println("Name : " + a1.s2.stname);
		System.out.println("stadd : " + a1.s2.stadd);
	}

	
	public static void main(String[] args) {

		University u =  new University();
		u.SingleStudentDetails();
		u.MultipleStudentDetails();

	}

}
