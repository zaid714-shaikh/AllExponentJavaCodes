package com.Exponent.PrameterizedConstructor;

public class demoCons {

	demoCons(int i) {
		System.out.println("---SIngle Constructore------");
		System.out.println(i);

	}

	demoCons(demoConsVar d) {
		d.id = 1;
		d.name = "zaid";
		d.number = 8554982078l;
		System.out.println(d.id + " " + d.name + " " + d.number);

	}

	public void detail(demoConsVar d2) {
		System.out.println(d2.id + d2.name + d2.number);
	}

	public static void main(String[] args) {

		demoCons d = new demoCons(10);
		demoConsVar d1 = new demoConsVar();

		demoCons d2 = new demoCons(d1);

		d2.detail(d1);

	}
}
