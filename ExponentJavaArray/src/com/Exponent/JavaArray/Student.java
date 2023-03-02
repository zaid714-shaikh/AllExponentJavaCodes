package com.Exponent.JavaArray;

public class Student {

	private int sid;
	private String sname;
	private static String collegename = "INdira";

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public static String getCollegename() {
		return collegename;
	}

	public static void setCollegename(String collegename) {
		Student.collegename = collegename;
	}

}
