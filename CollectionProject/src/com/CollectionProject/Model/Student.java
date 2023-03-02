package com.CollectionProject.Model;

public class Student {

	private int sid;
	private String sname;
	Batch batch;

	public int getSid() {
		return sid;
	}

	@Override
	public String toString() {
		return "Student sid=" + sid + ", sname=" + sname + ", batch=" + batch + "";
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

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

}
