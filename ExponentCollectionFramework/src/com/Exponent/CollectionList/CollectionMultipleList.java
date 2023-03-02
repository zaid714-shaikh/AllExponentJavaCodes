package com.Exponent.CollectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionMultipleList {

	public static List<List<List<String>>> ListDetails() {
		List<String> maharashtra = new ArrayList<String>();
		maharashtra.add("pune");
		maharashtra.add("mumbai");

		List<List<String>> india = new ArrayList<List<String>>();
		india.add(maharashtra);

		List<String> California = new ArrayList<String>();
		California.add("Sanfransisco");
		California.add("LosAngels");

		List<List<String>> USA = new ArrayList<List<String>>();
		USA.add(California);

		List<List<List<String>>> World = new ArrayList<List<List<String>>>();
		World.add(USA);
		World.add(india);

		return World;
	}

	public static void main(String[] args) {

		System.out.println("----------- Using Iterator Interface -------------");
		List<List<List<String>>> world = ListDetails();
		Iterator<List<List<String>>> country = world.iterator();

		while (country.hasNext()) {
			List<List<String>> countrynames = country.next();
			System.out.println(countrynames);

			Iterator<List<String>> states = countrynames.iterator();
			while (states.hasNext()) {
				List<String> statenames = states.next();

				Iterator<String> city = statenames.iterator();
				while (city.hasNext()) {
					String citynames = city.next();
					System.out.println(citynames);
				}

			}
		}

		System.out.println();
		System.out.println("---------------Using ForEach Loop-------------");
		for (List<List<String>> states : world) {
			for (List<String> city : states) {
				for (String citynames : city) {
					System.out.println(citynames);
				}
			}
		}

	}

}
