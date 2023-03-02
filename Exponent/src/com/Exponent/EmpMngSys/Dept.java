package com.Exponent.EmpMngSys;

public class Dept {
	
	
	public Emp Employee()
	{
		Emp e = new Emp();
		e.empid = 1;
		e.empname = "zaid";
		e.empadd = "pune";
		return e;
	}
	
	public AllEmp alemp()
	{
		AllEmp a = new AllEmp();
		a.e.empid = 2;
		a.e.empname = "Nilesh";
		a.e.empadd = "pune";
		
		a.e1.empid = 3;
		a.e1.empname = "Ajay";
		a.e1.empadd = "pune";
		
		
		a.e2.empid = 3;
		a.e2.empname = "Ajas";
		a.e2.empadd = "pune";
		
		return a;
	}
	
	
}
