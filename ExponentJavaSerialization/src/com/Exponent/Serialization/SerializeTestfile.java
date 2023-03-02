package com.Exponent.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeTestfile {
	
	
	public static void main(String[] args) throws IOException {
		Testfile t = new Testfile();
		t.setEid(2);
		t.setEname("zaid");
		
		Testfile t1  =new Testfile();
		t1.setEid(3);
		t1.setEname("ajas");
		
		
		
		
		FileOutputStream out = new FileOutputStream("test1.txt");
		
		ObjectOutputStream obj = new ObjectOutputStream(out);
		
		obj.writeObject(t);
		obj.writeObject(t1);
		
		System.out.println("success!!");
	}
	

}
