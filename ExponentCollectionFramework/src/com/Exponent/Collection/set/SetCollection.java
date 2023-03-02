package com.Exponent.Collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {

	public static void main(String[] args) {

		Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(null);
		s.add(3);
		System.out.println("-------Using By HashSet-------");
		for (Integer i : s) {
			System.out.println(i);
		}
		System.out.println();

		Set<Integer> s1 = new LinkedHashSet<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(null);
		System.out.println("-------Using LinkedHashSet----------");
		for (Integer j : s1) {
			System.out.println(j);
		}

		System.out.println();
		Set<Integer> s2 = new TreeSet<Integer>();
		s2.add(0);
		s2.add(2);
		s2.add(400);
		s2.add(12);

		System.out.println("-----Using By TreeSet-------");
		for (Integer i : s2) {
			System.out.println(i);
		}
	}
}
