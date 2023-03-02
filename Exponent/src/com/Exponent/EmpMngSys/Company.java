package com.Exponent.EmpMngSys;

public class Company {

	

	public static void main(String[] args) {
		
		Dept d = new Dept();
		Emp e = d.Employee();
		System.out.println("--------------------Employee Detatils------------------");
		System.out.println("Employee name :: " + e.empname);
		System.out.println("Employee ID :: " + e.empid);
		System.out.println("Employee Address :: " + e.empadd);
		
		System.out.println(" ");
		
		System.out.println("------------------Multiple Employees Details----------------");
		AllEmp a = d.alemp();
		System.out.println("Employee name :: " + a.e.empname);
		System.out.println("EMployee Id :: " + a.e.empid);
		System.out.println("EMployee Asdress :: " + a.e.empadd);

		System.out.println(" ");
		
		System.out.println("Employee name :: " + a.e1.empname);
		System.out.println("EMployee Id :: " + a.e1.empid);
		System.out.println("EMployee Asdress :: " + a.e1.empadd);
		
		System.out.println(" ");
		
		System.out.println("Employee name :: " + a.e2.empname);
		System.out.println("EMployee Id :: " + a.e2.empid);
		System.out.println("EMployee Asdress :: " + a.e2.empadd);
	}

}
