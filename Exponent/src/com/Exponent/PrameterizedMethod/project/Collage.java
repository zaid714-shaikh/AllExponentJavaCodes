
//Collage Class

package com.Exponent.PrameterizedMethod.project;

public class Collage {

	public void SingleStudentDetails() {
		Student sd = new Student();
		sd.strollno = 21;
		sd.stname = "Krishna";
		sd.stadd = "Mathura";

		University u = new University();
		u.Singlestudisplay(sd);
	}

	public void MultipleStudentDetails() {
		AllStudent a = new AllStudent();
		a.s.stadd = "pune";
		a.s.stname = "zaid";
		a.s.strollno = 23;

		a.s1.stadd = "Delhi";
		a.s1.stname = "akash";
		a.s1.strollno = 24;

		a.s2.stadd = "Nigdi";
		a.s2.stname = "Ramesh";
		a.s2.strollno = 26;

		University u = new University();
		u.Multiplestdisplay(a);
	}
}
