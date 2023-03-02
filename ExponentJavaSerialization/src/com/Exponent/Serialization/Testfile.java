package com.Exponent.Serialization;

import java.io.Serializable;

public class Testfile implements Serializable{

	int eid;
	String ename;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

}
