package com.Exponent.JavaAggregationStterGetter;

public class Main1 {

	
	public static void main(String[] args) {
		
		Mix m =  new Mix(1,"zaid");
		Mix1 m1 = new Mix1("ajas", 2, m);
		
		System.out.println(m1.m.eid+m1.m.ename+m1.cid+m1.cname);
		
		Mix m2 =  new Mix();
		m2.setEid(1);
		m2.setEname("jaid");
		System.out.println(m2.getEid()+m2.getEname());
		
		
		Mix m3 = new Mix();
		m3.setEid(3);
		m3.setEname("Riyaj");
		Mix1 m4 = new Mix1();
		m4.setM(m3);
		
		
		System.out.println(m4.getM().getEid());
	
	}
}
