package com.Exponent.serializationAggregation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Desrialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {


		FileInputStream in = new FileInputStream("serializeaggregation.txt");
		ObjectInputStream objin  =new ObjectInputStream(in);
		testserialize t = (testserialize) objin.readObject();
		System.out.println(t.getEname());
		System.out.println(t.t.getCid());
		System.out.println(t.t.getCname());
	}

}
