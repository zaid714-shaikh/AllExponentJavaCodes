package com.Exponent.CollectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudantDetails {

	public static List<Student> StudentDetails() {
		Student s = new Student();
		s.setSid(1);
		s.setSname("zaid");

		Student s1 = new Student();
		s1.setSid(2);
		s1.setSname("zaid2");

		List<Student> st = new ArrayList<Student>();
		st.add(s);
		st.add(s1);

		return st;

	}

	public static void main(String[] args) {

		List<Student> std = StudentDetails();
		Iterator<Student> itr = std.iterator();
		while (itr.hasNext()) {
			Student s = itr.next();
		
			System.out.println(s.getSid()+" "+s.getSname());
			System.out.println();
			
			
		}

	}

}
