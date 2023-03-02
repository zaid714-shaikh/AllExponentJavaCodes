package com.Exponent.CollectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listgeneric {

	public static List<Integer> IntegerList() {
		List<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);

		return li;
	}

	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();
		l.add("zaid");
		l.add("pawan");
		l.add("nayan");
		l.add(2, "shaikh");
		
	

		Iterator<String> itr = l.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			System.out.print(s + "\t");
		}

		System.out.println();

		for (String s : l) {
			System.out.print(s + "\t");
		}
		System.out.println();

		List<Integer> ltr = IntegerList();
		for (Integer i : ltr) {
			System.out.println(i);
			
		}

	}
}
