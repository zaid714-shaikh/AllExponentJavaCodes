package com.WebForm;

import java.util.Scanner;

public class From implements FormInterface {

	@Override
	public FeildsForForm FormInput() {
		FeildsForForm f = new FeildsForForm();
		FeildsForForm.Formno++;
		Scanner sc = new Scanner(System.in);
		System.out.println("Restrication **under 18 Prohabitated**");
		System.out.println("Whats Your age : - ");
		int age = sc.nextInt();
		if (age >= 18) {

			f.setAge(age);
			System.out.println("Whats Your name :- ");
			f.setName(sc.next());

			System.out.println("Whata Your Address :- ");
			f.setAddress(sc.next());

			System.out.println("Whats your Pincode :- ");
			f.setPincode(sc.nextInt());

			System.out.println("Whats Your Adhara No :- ");
			f.setAdharno(sc.nextLong());

		} else {
			System.out
					.println("***********************************Your are NOt Eligible for this**********************");
		}

		return f;

	}

	@Override
	public void FormFirstPage() {

		System.out.println(
				"------------------------------------------------------------------------------------------------");
		System.out.println(
				"------------------------JAVA WEB FORM--------------------------------------------------------------");

	}

}
