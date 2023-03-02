package com.Exponent.JavaString;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		String s = "hello hello hello my my ";

		// It will print Length of the String
		int i = s.length();
		System.out.println("The Length of the String is " + i);

		// It will Print All Uppercase (capital characters).
		System.out.println(s.toUpperCase());

		// It will Print All Lowercase (Small characters).
		System.out.println(s.toLowerCase());

		// It will give you the index of character .
		System.out.println(s.indexOf('s'));

		// posmotom the String in Character

		// Spliting on the basis of notations.
		String[] str = s.split("&");
		for (String string : str) {
			System.out.println(string);
		}
		// total count of character in string

		int count = 0;
		char[] strarray = s.toCharArray();
		for (int j = 0; j < strarray.length; j++) {
			if (strarray[j] == 'o')
				count++;
		}

		s.trim();
		int cnt = s.indexOf("my");
		int counter = 0;
		System.out.println(cnt);
		String[] strspace = s.split(" ");
		System.out.println();
		String d = "my";
		for (int j = 0; j < strspace.length; j++) {
			int c = strspace[j].compareTo("my");

		}
		System.out.println("my is ocuure " + counter + " times");

//		format , valueof, substring, join , subsequence , replace ,
		// replaceAll,
		// split with double parameter , charAt

		// Substring print the starting string starts from 0 and ending string starts
		// from 1

		String strsub = s.replace("my", "hi");

		System.out.println(strsub);

		String str1[] = { "Pravin kumar", "Nilesh kumar", "zaid shaikh", "prathamesh kumar", "akshay kumar",
				"ajay jadhav", "ajas shaikh" };

		String SurnameForShaikh = "shaikh";
		int ShaikhLength = SurnameForShaikh.length();

		String SurnameForKumar = "kumar";
		int KumarLenghth = SurnameForKumar.length();

		for (int j = 0; j < str1.length; j++) {
			int SizeOfArray = str1[j].length();

			// Extracting Shaikh
			String Shaikhnames = str1[j].substring(SizeOfArray - ShaikhLength);

			// Extracting Kumar

			if (SurnameForShaikh.equals(Shaikhnames))
				System.out.println(str1[j]);

		}

		for (int j = 0; j < str1.length; j++) {
			int SizeOfArray = str1[j].length();

			String Kumarnames = str1[j].substring(SizeOfArray - KumarLenghth);
			if (SurnameForKumar.equals(Kumarnames))
				System.out.println(str1[j]);
			 
			}
		
		
		//It will print the meanigfull things just provide delimeter.
		
//		String afterjoin = s.join("-", "2","20","30");
//		System.out.println(afterjoin);
//
//		FileOutputStream out = new FileOutputStream("demo.txt");
//		ObjectOutputStream ob = new ObjectOutputStream(out);
//		ob.writeObject(strsub);
//		out.close();
//		
//		FileInputStream in = new FileInputStream("demo.txt");
//		ObjectInputStream obj = new ObjectInputStream(in);
//		String demostring = (String) obj.readObject();
//		
//		System.out.println(demostring);
//		
//		StringBuilder db = new StringBuilder(demostring);
//		System.out.println(db.reverse());
//		
		
		
		
		
		
		}

	

	
}
