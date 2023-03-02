package com.Exponent.SerializationinInheritance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Deserialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {


		FileInputStream in = new FileInputStream("serializeinherit.txt");
		ObjectInputStream objin =new ObjectInputStream(in);
		C b  =(C) objin.readObject();
		System.out.println(b.getCid()+" "+b.getCname()+" "+b.getEid()+" "+b.getEname()+""+b.getName());

	}

}
