package com.Exponent.JavaAggregationStterGetter;

public class Main {

	public static void main(String[] args) {

		Course c = new Course();
		c.setCid(3);
		c.setCname("JAVA");

		Batch b = new Batch();
		b.setBid(24);
		b.setBname("Morning-Batch");
		b.setCourse(c);

		Faculty f = new Faculty();
		f.setFid(1);
		f.setFname("Nilesh Sir");
		f.setBatch(b);

		Student s = new Student();
		s.setSid(1);
		s.setSname("zaid");
		s.setFaculty(f);

		System.out.println("---------------Aggregation---------------------------------------");
		System.out.println("-----------Student Details Using Setter And Getter---------------");
		System.out.println();
		System.out.println("Student ID :- " + s.getSid());
		System.out.println("Student Name :- " + s.getSname());
		System.out.println("Faculty ID :- " + s.getFaculty().getFid());
		System.out.println("Faculty Name :- " + s.getFaculty().getFname());
		System.out.println("Batch ID :- " + s.getFaculty().getBatch().getBid());
		System.out.println("Batch Name :- " + s.getFaculty().getBatch().getBname());
		System.out.println("course ID :- " + s.getFaculty().getBatch().getCourse().getCid());
		System.out.println("Course Name :- " + s.getFaculty().getBatch().getCourse().getCname());

	}

}
