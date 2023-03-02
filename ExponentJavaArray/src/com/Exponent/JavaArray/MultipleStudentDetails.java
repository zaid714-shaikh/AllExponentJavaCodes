package com.Exponent.JavaArray;

public class MultipleStudentDetails {

	public MultipleStudentObjects MultipleStudentDetails() {

		MultipleStudentObjects m = new MultipleStudentObjects();

		m.s.setSid(1);
		m.s.setSname("zaid");

		m.s2.setSid(2);
		m.s2.setSname("Ajas");

		m.s3.setSid(2);
		m.s3.setSname("Ajas");

		return m;
	}

	public static void main(String[] args) {

		MultipleStudentDetails m1 = new MultipleStudentDetails();
		MultipleStudentObjects m = m1.MultipleStudentDetails();
		System.out.println(m.s.getSid());
		System.out.println(m.s.getSname());
		System.out.println(m.s.getCollegename());

		System.out.println();
		System.out.println(m.s2.getSid());
		System.out.println(m.s2.getSname());
		System.out.println(m.s2.getCollegename());

	}
}
