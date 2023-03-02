package practicleexam;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ResultSet rs;
		Connection con;
		Statement stmt;
		
		Scanner sc = new Scanner (System.in);
		
		
		
		while(true)
		{
			System.out.println("1.Insert");
			System.out.println("2.view All");
			System.out.println("3.Exit");
			System.out.print("Enter your choice:-");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				 Class.forName("org.postgresql.Driver");  
		          con = DriverManager.getConnection("jdbc:postgresql:demo", "postgres", "root");  
		         
		          stmt = con.createStatement(); 
		          stmt.executeUpdate("insert into student values('4','home')");
		          System.out.println("------------------values are inserted Succefully----------------");
				break;
			case 2:
			 Class.forName("org.postgresql.Driver");  
	          con = DriverManager.getConnection("jdbc:postgresql:demo", "postgres", "root");  
	         
	          stmt = con.createStatement(); 
	          rs = stmt.executeQuery("select * from student");
	         while(rs.next())
	         {
	        	System.out.println(rs.getInt(1)+rs.getString(2));
	         }
	         break;
			case 3:
				System.out.println();
			 }
		
		
		}
		
			
	

	}

}
