package com.Exponent.JavaAggregationStterGetter;

public class Mix1 {

	String cname;
	int cid;
	Mix m;

	public Mix1(String cname, int cid, Mix m) {
		super();
		this.cname = cname;
		this.cid = cid;
		this.m = m;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public Mix getM() {
		return m;
	}

	public void setM(Mix m) {
		this.m = m;
	}

	public Mix1()
	{
		
	}
}
