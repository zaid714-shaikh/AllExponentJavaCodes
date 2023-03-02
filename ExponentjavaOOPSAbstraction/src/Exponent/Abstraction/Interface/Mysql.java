package Exponent.Abstraction.Interface;

public class Mysql implements DataBase{

	@Override
	public void commit() {
		System.out.println("Commit for Mysql Database");
		
	}

	@Override
	public void rollback() {
		
		System.out.println("Commit for Postgres Database");
		
	}

	

	

	
	
}
