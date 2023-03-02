package com.Exponent.JavaAggregationConstructor;

public class Student {

	int sid;
	String sname;
	Faculty faculty;

	public Student(int sid, String sname, Faculty faculty) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.faculty = faculty;
	}

}
