package com.Exponent.serializationAggregation;

import java.io.Serializable;

public class test implements Serializable{

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
