package InheritanceProjects;

public class EmpDetails extends Employee {

	protected static Employee empdetail() {
		EmpDetails e = new EmpDetails();
		e.setEid(53660);
		e.setEname("Zaid");
		e.setEdept("Developement");
		return e;
	}

	static void ShowFirstEmpDetails() {

		m2();
		System.out.println(" ");
		EmpDetails emp = (EmpDetails) empdetail();
		System.out.println("Employee ID :- " + emp.getEid());
		System.out.println("Employee Name :- " + emp.getEname());
		System.out.println("Employee department  :- " + emp.getEdept());
		System.out.println("Employee Company :- " + ecname);
		System.out.println("Employee Gender :- " + emp.egender);
	}

	protected static Multipleemployee multempdetails() {
		Multipleemployee me = new Multipleemployee();
		me.e1.setEid(54889);
		me.e1.setEname("pawan");
		me.e1.setEdept("It Support");

		me.e2.setEid(56698);
		me.e2.setEname("pawan");
		me.e2.setEdept("It Security");

		me.e3.setEid(56648);
		me.e3.setEname("Ajas");
		me.e3.setEdept("java developer");
		return me;
	}

	static void  ShowMultipleEmpDetails() {
		System.out.println("");
		m3();
		System.out.println(" ");
		Multipleemployee emp = multempdetails();
		System.out.println("Employee ID :- " + emp.e1.getEid());
		System.out.println("Employee Name :- " + emp.e1.getEname());
		System.out.println("Employee department  :- " + emp.e1.getEdept());
		System.out.println("Employee Company :- " + ecname);
		System.out.println("Employee Gender :- " + emp.e1.egender);

		System.out.println("  ");
		System.out.println("Employee ID :- " + emp.e2.getEid());
		System.out.println("Employee Name :- " + emp.e2.getEname());
		System.out.println("Employee department  :- " + emp.e2.getEdept());
		System.out.println("Employee Company :- " + ecname);
		System.out.println("Employee Gender :- " + emp.e2.egender);

		System.out.println("  ");
		System.out.println("Employee ID :- " + emp.e3.getEid());
		System.out.println("Employee Name :- " + emp.e3.getEname());
		System.out.println("Employee department  :- " + emp.e3.getEdept());
		System.out.println("Employee Company :- " + ecname);
		System.out.println("Employee Gender :- " + emp.e3.egender);
	}
	
}
