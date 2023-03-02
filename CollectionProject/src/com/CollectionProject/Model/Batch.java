package com.CollectionProject.Model;

public class Batch {

	private int bid;
	private String bname;
	Faculty faculty;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	@Override
	public String toString() {
		return "Batch bid=" + bid + ", bname=" + bname + ", faculty=" + faculty + "";
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

}
