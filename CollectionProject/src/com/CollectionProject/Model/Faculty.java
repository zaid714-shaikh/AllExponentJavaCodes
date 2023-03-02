package com.CollectionProject.Model;

public class Faculty {

	private int fid;
	private String fname;
	Course course;

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	@Override
	public String toString() {
		return "Faculty fid=" + fid + ", fname=" + fname + ", course=" + course + "";
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
}
