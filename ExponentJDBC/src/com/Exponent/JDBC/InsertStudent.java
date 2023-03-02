package com.Exponent.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class InsertStudent {

	public static void main(String[] args) {
		
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			
			
			Statement stmt = con.createStatement();
			
			
			String sql = "insert into student values(105,'pranay')";
			
			
			stmt.execute(sql);
			
			con.close();
			
			System.out.println("Data Recorded Successfullyu!!!!");
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
