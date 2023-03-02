package com.Exponent.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class updateStudent {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			Statement smt = con.createStatement();

			String sql = "update student set name='satish' where id=102 ";

			smt.executeUpdate(sql);

			con.close();

			System.out.println("Record Updated Successfully!!");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
