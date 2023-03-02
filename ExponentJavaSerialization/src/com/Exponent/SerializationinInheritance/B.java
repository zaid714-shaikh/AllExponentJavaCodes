package com.Exponent.SerializationinInheritance;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class B extends A {

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
	
	public static void main(String[] args) throws IOException {
		
	
		C b = new C();//A+B
		b.setCid(2);
		b.setCname("zaid");
		b.setEid(3);
		b.setEname("ajas");
		b.setName("Nilesh");
		
		
		
		
		FileOutputStream out = new FileOutputStream("serializeinherit.txt");
		ObjectOutputStream obj = new ObjectOutputStream(out);
		obj.writeObject(b);
		out.close();
		System.out.println("sucess!!");
		
		
		
		
	}


	
}
