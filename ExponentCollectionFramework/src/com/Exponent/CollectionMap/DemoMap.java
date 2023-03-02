package com.Exponent.CollectionMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {

		Map<Integer, String> StudentDetails = new HashMap<Integer, String>();

		StudentDetails.put(1, "zaid");
		StudentDetails.put(2, "zaid");
		StudentDetails.put(3, "pranay");
//		
//		System.out.println(StudentDetails);
//		System.out.println(StudentDetails.containsValue("zaid")); //it will give true value cuse zaid is present
//		System.out.println(StudentDetails.isEmpty());
//		System.out.println(StudentDetails.get(9)); //it will give null value cause 9index is not present.
//		System.out.println(StudentDetails.remove(9));
//		System.out.println(StudentDetails);
		System.out.println("-------Using Iterator LOOp--------");
		
		Set<Integer> keys= StudentDetails.keySet();
		Iterator<Integer> itr= keys.iterator();
		while(itr.hasNext())
		{
			Integer key = itr.next();
			System.out.println(key+" "+StudentDetails.get(key));
		}
		System.out.println("-------Using For Each LOOp--------");

		
		for(Integer key:keys)
		{
			System.out.println(key+" "+StudentDetails.get(key));
		}
		

	}
}
