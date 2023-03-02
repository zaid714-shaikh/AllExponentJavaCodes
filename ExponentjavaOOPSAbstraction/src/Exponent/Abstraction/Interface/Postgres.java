package Exponent.Abstraction.Interface;

public class Postgres implements DataBase {

	@Override
	public void commit() {

		System.out.println("Commit for Postgres Database");

	}

	@Override
	public void rollback() {
		System.out.println("RollBack for postgres Database");

	}

	public static void main(String[] args) {

		DataBase db = new Mysql();

		db.commit();
		db.rollback();
		System.out.println("Age is + " + db.age);
	}
}
