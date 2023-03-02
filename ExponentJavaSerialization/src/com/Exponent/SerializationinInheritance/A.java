package com.Exponent.SerializationinInheritance;

import java.io.Serializable;

public class A  implements Serializable{

	
	int cid;
	String cname;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
}
