package com.Exponent.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class JDBCPreparedStatement {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			Connection con = MyConnection.getConncetion();

			String sql = "insert into student values(?,?)";
			String sql1 = "select * from student";
			String sql2 = "Delete from student where id = ?";
			String sql3="select count(?) from student";
			
			PreparedStatement ps = con.prepareStatement(sql);
			PreparedStatement ps1 = con.prepareStatement(sql1);
			PreparedStatement ps2 = con.prepareStatement(sql2);
			PreparedStatement ps3 = con.prepareStatement(sql3);

			System.out.println("Enter the Student id:-");
			int id = sc.nextInt();
			System.out.println("Enter the Student name:- ");
			String sname = sc.next();
			ps.setInt(1, id);
			ps.setString(2, sname);

			ps.executeUpdate();
			System.out.println("Data added successfully!!");
			
			
			
			
			ps3.setString(1, "name");
			  ResultSet rs1= ps3.executeQuery();
			
			  while(rs1.next())
				 {
					
					 System.out.println( rs1.getString(1));
				 }
				 
			  
			  int n = rs1.getString(1).length();
			  
			  for(int i=0;i<rs1.getString(1).length();i++)
			  {
				
			  }
			
			 ResultSet rs= ps1.executeQuery();
			
			System.out.println("Enter the id you want to delete :- ");
			int deleteid = sc.nextInt();
			
			
			
			
			
		
			 while(rs.next())
			 {
				 System.out.println("Student ID : - " + rs.getInt(1));
				 System.out.println("Student name : - " + rs.getString(2));
			 }
			 
			
			System.out.println("");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
