package com.Exponent.CollectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UniversityCollectionList {

	public static List<List<String>> Alluniversities()
	{
		List<String> puneUni  = new ArrayList<String>();
		puneUni.add("BCA");
		puneUni.add("Diploma");
		puneUni.add("Btech");
		
		List<String> mumbaiUni = new ArrayList<String>();
		mumbaiUni.add("BSC");
		mumbaiUni.add("B.E");
		mumbaiUni.add("B.com");
		
		
		List<List<String>> maharashtraUniversities = new ArrayList<List<String>>();
		maharashtraUniversities.add(puneUni);
		maharashtraUniversities.add(mumbaiUni);
		
		
		return maharashtraUniversities;
	}
	public static void main(String[] args) {
		
		System.out.println("-----using Iterator Interface---------");
		List<List<String>> stateuni= Alluniversities();
		
		
		Iterator<List<String>> stateuninames = stateuni.iterator();
		while(stateuninames.hasNext())
		{
			List<String> cityuni= stateuninames.next();
			System.out.println(cityuni);
			Iterator<String> universitesnames= cityuni.iterator();
			while(universitesnames.hasNext())
			{
			 String Uninames= universitesnames.next();
			 System.out.println(Uninames);
			}
		}
		
		
		System.out.println("--------Using Foreach LOOP------------");
		for(List<String> statesuninames :stateuni)
		{
			System.out.println(statesuninames);
			for(String uninames :statesuninames)
			{
				System.out.println(uninames);
			}
		}
	}
}
