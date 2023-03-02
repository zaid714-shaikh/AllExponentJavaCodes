package com.Exponent.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	private static Connection con = null;

	private MyConnection() {

	}

	public static Connection getConncetion() {
		try {
			if (con == null) {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
				return con;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return con;

	}
}
