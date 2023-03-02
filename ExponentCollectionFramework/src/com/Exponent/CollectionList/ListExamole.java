package com.Exponent.CollectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamole {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(1);
		l.add("zaid");
		l.add("pune");
		
		System.out.println(l);
		
		
		 Iterator itr = l.iterator();
		 
		 while(itr.hasNext())
		 {
			 Object o = itr.next();
			 System.out.println(o);
		 }
	}
}
