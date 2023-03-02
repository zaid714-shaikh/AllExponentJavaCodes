package com.studentinfo.main;

public class Controller {

	static
	{
		System.out.println("Student Detaisl");
	}
	public void getStudentDetails(POJOStudent sd) {
		System.out.println("------------------------");
		System.out.println(sd.toString());
		System.out.println("------------------------");
		Controller c = new Controller();
	}
	
	{
		System.out.println("end student details");
	}

	public static void main(String[] args) {
		
		
		StudentDetails s  =new StudentDetails();
		s.studentDetail();
		
	}
}
