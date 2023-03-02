package com.Exponent.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateStudent {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			Statement smt = con.createStatement();

			String sql = "create table student (id int primary key,name varchar(50))";

			smt.execute(sql);

			con.close();

			System.out.println("Table Created  Successfully!!");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
