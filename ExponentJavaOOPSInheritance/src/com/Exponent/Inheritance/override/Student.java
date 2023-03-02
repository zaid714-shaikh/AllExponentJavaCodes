package com.Exponent.Inheritance.override;

public class Student {

	private int sid;
	private String sname;
	private String sadd;

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSadd() {
		return sadd;
	}

	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

	public void m1() {
		System.out.println("From student class");
	}
}
