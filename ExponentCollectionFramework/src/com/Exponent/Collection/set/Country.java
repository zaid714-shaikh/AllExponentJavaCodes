package com.Exponent.Collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Country {

	public static Set<Set<String>> getCountryDetails() {
		Set<String> maharashtra = new HashSet<String>();
		maharashtra.add("pune");
		maharashtra.add("Mumbai");
		maharashtra.add("Delhi");

		Set<String> uttarpradesh = new HashSet<String>();
		uttarpradesh.add("Sikandrabad");
		uttarpradesh.add("patna");
		uttarpradesh.add("xyz");

		Set<Set<String>> states = new HashSet<Set<String>>();
		states.add(uttarpradesh);
		states.add(maharashtra);

		return states;

	}

	public static void main(String[] args) {

		Set<Set<String>> states = getCountryDetails();
		System.out.println(states);

		Iterator<Set<String>> statesnames = states.iterator();
		while (statesnames.hasNext()) {
			Set<String> names = statesnames.next();
			System.out.println(names);

			Iterator<String> citynames = names.iterator();
			while (citynames.hasNext()) {
				String cn = citynames.next();
				System.out.println(cn);
			}
		}
	}

}
