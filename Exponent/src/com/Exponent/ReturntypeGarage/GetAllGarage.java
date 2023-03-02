package com.Exponent.ReturntypeGarage;

public class GetAllGarage {
	
	
	public static void main(String[] args) {
		
		Garage g = new Garage();
		System.out.println("--First Grage Details--");
		
		System.out.println(g.a1.allcar().c.cname);
		System.out.println(g.a1.allcar().c.ccolor);
		System.out.println(g.a1.allcar().c.cnumber);
		System.out.println(g.a1.allcar().c.cregion);
		
		System.out.println();
		System.out.println(g.a1.allcar().c1.cname);
		System.out.println(g.a1.allcar().c1.ccolor);
		System.out.println(g.a1.allcar().c1.cnumber);
		System.out.println(g.a1.allcar().c1.cregion);
		System.out.println();
		System.out.println(g.a1.allcar().c2.cname);
		System.out.println(g.a1.allcar().c2.ccolor);
		System.out.println(g.a1.allcar().c2.cnumber);
		System.out.println(g.a1.allcar().c2.cregion);
		
		
		System.out.println("--Second Grage Details--");
		
		System.out.println(g.a2.allcar().c.cname);
		System.out.println(g.a2.allcar().c.ccolor);
		System.out.println(g.a2.allcar().c.cnumber);
		System.out.println(g.a2.allcar().c.cregion);
		
		System.out.println();
		System.out.println(g.a2.allcar().c1.cname);
		System.out.println(g.a2.allcar().c1.ccolor);
		System.out.println(g.a2.allcar().c1.cnumber);
		System.out.println(g.a2.allcar().c1.cregion);
		System.out.println();
		System.out.println(g.a2.allcar().c2.cname);
		System.out.println(g.a2.allcar().c2.ccolor);
		System.out.println(g.a2.allcar().c2.cnumber);
		System.out.println(g.a2.allcar().c2.cregion);
	}
	

}
