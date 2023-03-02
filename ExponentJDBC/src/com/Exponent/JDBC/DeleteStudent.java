package com.Exponent.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteStudent {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			
			 Statement smt = con.createStatement();
			
			 String sql =  "Delete from test1 where id=105";
			 
			 smt.executeUpdate(sql);
			 
			 con.close();
			
			 System.out.println("Record Deleted Successfully!!");
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
