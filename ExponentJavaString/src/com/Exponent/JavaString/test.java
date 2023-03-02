package com.Exponent.JavaString;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		String s[] = { "boB", "Bob", "peter", "peter" };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to search:-");
		String test = sc.next();
		boolean flag = false;
		int position = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(test)) {
				flag = true;
				position = i;
				break;
			}

		}

		if (flag) {
			System.out.println("It is present at index " + position);
		}

	}
}
