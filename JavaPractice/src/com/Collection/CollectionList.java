package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionList {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();

		names.add("zaid");
		names.add("pawan");
		names.add("kiran");
		names.add(null);
		names.add(null);
		
		System.out.println(names.isEmpty());
		System.out.println(names.indexOf(null));
	}
}
