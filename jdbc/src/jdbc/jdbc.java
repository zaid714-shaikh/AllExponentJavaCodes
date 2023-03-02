package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

public class jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		ResultSet rs;
		Statement s;
		
		Class.forName("org.postgresql.Driver");
		
		con  = DriverManager.getConnection("jdbc:postgresql:database-2.chmm7dlr7jmu.ap-south-1.rds.amazonaws.com","postgres","postgres");
		
		if(con==null)
		{
			System.out.println("not connected");
		}
		else
		{
			System.out.println("sucessfully connectes!!");
		}
	}

}
