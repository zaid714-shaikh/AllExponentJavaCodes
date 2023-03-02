package InheritanceProjects;

public final class runapp extends EmpDetails {

	private void m1()
	{
		super.ShowMultipleEmpDetails();
	}
	
	public static void main(String[] args) {

		Employee e = new Employee();
		e.main();
		
	
		ShowFirstEmpDetails();
		
		runapp r2 = new runapp();
		r2.m1();
	
	}
}
