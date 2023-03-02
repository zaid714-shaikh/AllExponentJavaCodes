package com.Exponent.JavaAggregationConstructor;

public class Main {


	public static void main(String[] args) {
		
		Course c  = new Course(1, "SpringBoot");
		Batch b = new Batch(24, "Evening-Batch", c);
		Faculty f = new Faculty(2,"AjasSir", b);
		Student s = new Student(1, "zaid" , f);
		
		
		
		System.out.println("---------------Aggregation---------------------------------------");
		System.out.println("-----------Student Details Using Constructor---------------");
		System.out.println();
		System.out.println("Student ID :- " + s.sid);
		System.out.println("Student Name :- " + s.sname);
		System.out.println("Faculty ID :- " + s.faculty.fid);
		System.out.println("Faculty Name :- " + s.faculty.fname);
		System.out.println("Batch ID :- " + s.faculty.batch.bid);
		System.out.println("Batch Name :- " + s.faculty.batch.bname);
		System.out.println("course ID :- " + s.faculty.batch.course.cid);
		System.out.println("Course Name :- " + s.faculty.batch.course.cname);

	}
	
	
}
