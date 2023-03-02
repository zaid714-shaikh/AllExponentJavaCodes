package com.Exponent.Collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class University {

	public static Set<Set<Set<String>>> getuniversitydetail() {
		Set<String> Stateuniversity = new LinkedHashSet<String>();
		Stateuniversity.add("Pune");
		Stateuniversity.add("mumbai");

		Set<String> Pune = new LinkedHashSet<String>();
		Pune.add("BSC");
		Pune.add("Btech");
		Pune.add("BE");

		Set<String> Mumbai = new LinkedHashSet<String>();
		Mumbai.add("Bcom");
		Mumbai.add("BA");

		Set<Set<String>> states = new LinkedHashSet<Set<String>>();
		states.add(Pune);
		states.add(Mumbai);
		

		Set<Set<Set<String>>> india = new LinkedHashSet<Set<Set<String>>>();
		india.add(states);

		return india;

	}

	public static void main(String[] args) {

		Set<Set<Set<String>>> universities = getuniversitydetail();
		for(Set<Set<String>> u:universities)
		{
			System.out.println(u);
			for(Set<String> pu:u)
			{
				System.out.println(pu);
				for(String p:pu)
				{
					System.out.println(p);
				}
			}
		
		}

	}

}
