package com.DatatypesTraverse;

public class Class2 {
	
	public Class1 s1()
	{
		Class1 c1 = new Class1();
		c1.id = 1;
		c1.address = "pune";
		c1.name="zaid";
		return c1;
	}
	public static void main(String[] args) {
	
		Class2 c = new Class2();
		Class1 c2 = c.s1();
		System.out.println(c2.name);
		System.out.println(c2.id);
		System.out.println(c2.address);
		
		System.out.println("--------------------");
		
		System.out.println("*****DataType-ReturnType*****");
		Class1 c3 = new Class1();
		String h = c3.s();
		System.out.println(h);
		int n = c3.i();
		System.out.println(n);
		boolean b1 = c3.b();
		System.out.println(b1);
		double d1 = c3.d();
		System.out.println(d1);
		System.out.println(c3.s1());

		
		
		
		
		
		
	}

}
