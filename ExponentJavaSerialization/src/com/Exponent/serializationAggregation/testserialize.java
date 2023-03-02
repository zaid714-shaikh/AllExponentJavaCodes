package com.Exponent.serializationAggregation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class testserialize implements Serializable{

	String ename;
	test t;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public test getT() {
		return t;
	}

	public void setT(test t) {
		this.t = t;
	}
	
	
	
	

	public static void main(String[] args) throws IOException {
		
		testserialize t =  new  testserialize();
		test t1 = new test();
		t.setEname("zaid");
		t.setT(t1);
		t1.setCid(1);
		t1.setCname("persi");
		
		
		
		FileOutputStream out = new FileOutputStream("serializeaggregation.txt");
		ObjectOutputStream obj = new ObjectOutputStream(out);
		obj.writeObject(t);
		obj.close();
		System.out.println("success!!");
		
		
	}
}
