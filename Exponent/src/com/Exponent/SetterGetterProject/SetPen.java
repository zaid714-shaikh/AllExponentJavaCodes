package com.Exponent.SetterGetterProject;

public class SetPen {

	public PenPouch PenPouch() {

		PenPouch p = new PenPouch();

		p.p.setColor("blue");
		p.p.setPencompany("parker");
		p.p.setPenriffils(5);

		p.p1.setColor("black");
		p.p1.setPencompany("Lexi");
		p.p1.setPenriffils(10);

		p.p2.setColor("red");
		p.p2.setPencompany("Bally");
		p.p2.setPenriffils(8);

		return p;

	}

}
