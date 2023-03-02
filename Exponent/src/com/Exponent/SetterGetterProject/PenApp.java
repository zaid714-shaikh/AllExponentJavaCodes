package com.Exponent.SetterGetterProject;

public class PenApp {

	public static void main(String[] args) {

		SetPen sp = new SetPen();
		PenPouch pp = sp.PenPouch();
		System.out.println();
		System.out.println("penreiffils :: " + pp.p.getpenriffils());
		System.out.println("penCompanyName :: " + pp.p.getPencompany());
		System.out.println("Pen color :: " + pp.p.getColor());

		System.out.println();
		System.out.println("penreiffils :: " + pp.p1.getpenriffils());
		System.out.println("penCompanyName :: " + pp.p1.getPencompany());
		System.out.println("Pen color :: " + pp.p1.getColor());

		System.out.println();
		System.out.println("penreiffils :: " + pp.p2.getpenriffils());
		System.out.println("penCompanyName :: " + pp.p2.getPencompany());
		System.out.println("Pen color :: " + pp.p2.getColor());
	}

}
