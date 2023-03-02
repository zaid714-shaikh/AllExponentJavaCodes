package com.studentinfo.main;

public class StudentDetails {

	public POJOStudent studentDetail() {
		POJOStudent ps = new POJOStudent();
		ps.setSid(1);
		ps.setSname("zaid");
		ps.setSaddress("pune");
		
		Controller c = new Controller();
		c.getStudentDetails(ps);
		return ps;
	}
}
