package com.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream f = new FileInputStream("demo.txt");
		ObjectInputStream obj = new ObjectInputStream(f);
		Student st = (Student) obj.readObject();

		System.out.println(st);
	}
}
