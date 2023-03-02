package com.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialClass {

	public static void main(String[] args) throws IOException {

		Student s = new Student();

		s.setSid(1);
		s.setSname("zaid");

		FileOutputStream f = new FileOutputStream("demo.txt");
		ObjectOutputStream obj = new ObjectOutputStream(f);
		obj.writeObject(s);
		System.out.println("value Insterted!!!");

	}
}
