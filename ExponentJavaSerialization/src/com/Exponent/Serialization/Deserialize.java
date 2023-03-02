package com.Exponent.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Deserialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {


		FileInputStream in  = new FileInputStream("test1.txt");
		
		ObjectInputStream objin = new ObjectInputStream(in);
		
		Testfile t2 = (Testfile) objin.readObject();
		
		System.out.println(t2.eid+" "+t2.ename);
		
		Testfile t3 =(Testfile)objin.readObject();
		
		System.out.println(t3.eid+" "+t3.ename);

	}

}
