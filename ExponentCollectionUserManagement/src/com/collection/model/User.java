package com.collection.model;

import java.util.Collection;

public class User {

	int uid;
	String uname;
	String uaddress;
	long uphonumber;
	String pancardno;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public long getUphonumber() {
		return uphonumber;
	}

	public void setUphonumber(long uphonumber) {
		this.uphonumber = uphonumber;
	}

	public String getPancardno() {
		return pancardno;
	}

	public void setPancardno(String pancardno) {
		this.pancardno = pancardno;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return uid + " " + uname + " " + uaddress + " " + uphonumber + " " + pancardno;
	}
}
