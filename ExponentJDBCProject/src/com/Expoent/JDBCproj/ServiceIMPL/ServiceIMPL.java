package com.Expoent.JDBCproj.ServiceIMPL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.Expoent.JDBCproj.Service.Service;
import com.Expoent.JDBCproj.model.Course;

public class ServiceIMPL implements Service {
	Scanner sc = new Scanner(System.in);

	@Override
	public void addCourse() {
		Connection con = Myconnection.getConnection();
		System.out.println("how mant course you want:-");
		int n = sc.nextInt();
		try {
			for (int i = 0; i < n; i++) {

				String sql = "insert into course values(?,?)";

				PreparedStatement psmt = con.prepareStatement(sql);
				System.out.print("Enter the Course-ID :- ");
				int cid = sc.nextInt();
				psmt.setInt(1, cid);
				System.out.print("Enter the Course Name:-");
				String cname = sc.next();
				psmt.setString(2, cname);

				System.out.println("Course  Inserted successfully!!!!");

				psmt.executeUpdate();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void displayCourse() {
		Connection con = Myconnection.getConnection();

		try {

			String sql = "select * from course";

			PreparedStatement psmt = con.prepareStatement(sql);

			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				System.out.println("-----------------------------------|");
				System.out.println("Course ID = " + rs.getInt(1));
				System.out.println("-----------------------------------|");
				System.out.println("Course Name  = " + rs.getString(2));
				System.out.println("-----------------------------------|");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void addFaculty() {

		Connection con = Myconnection.getConnection();
		System.out.println("how many faculty you want:-");
		int n = sc.nextInt();
		try {
			for (int i = 0; i < n; i++) {

				String sql = "insert into faculty values(?,?,?)";

				PreparedStatement psmt = con.prepareStatement(sql);
				System.out.print("Enter the Faculty-ID :- ");
				int fid = sc.nextInt();
				psmt.setInt(1, fid);
				System.out.print("Enter the Faculty Name:-");
				String fname = sc.next();
				psmt.setString(2, fname);
				System.out.println("Enter the Course You want to add to this Faculty");
				int cid = sc.nextInt();
				psmt.setInt(3, cid);
				System.out.println("Faculty  Inserted successfully!!!!");

				psmt.executeUpdate();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void displayFaculty() {
		Connection con = Myconnection.getConnection();

		try {

			String sql = "select course.cid,course.cname ,faculty.fid, faculty.fname from faculty inner join course on faculty.cid=course.cid inner join course.cid=faculty.fid";

			PreparedStatement psmt = con.prepareStatement(sql);

			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				System.out.println("-----------------------------------|");
				System.out.println("Course ID = " + rs.getInt(1));
				System.out.println("-----------------------------------|");
				System.out.println("Course Name  = " + rs.getString(2));
				System.out.println("-----------------------------------|");
				System.out.println("Faculty ID  = " + rs.getInt(3));
				System.out.println("-----------------------------------|");
				System.out.println("Faculty Name  = " + rs.getString(4));
				System.out.println("-----------------------------------|");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void addBatch() {
		Connection con = Myconnection.getConnection();
		System.out.println("how many Batch you want:-");
		int n = sc.nextInt();
		try {
			for (int i = 0; i < n; i++) {

				String sql = "insert into batch values(?,?,?)";

				PreparedStatement psmt = con.prepareStatement(sql);
				System.out.print("Enter the batch-ID :- ");
				int bid = sc.nextInt();
				psmt.setInt(1, bid);
				System.out.print("Enter the batch Name:-");
				String bname = sc.next();
				psmt.setString(2, bname);
				System.out.println("Enter the faculty You want to add to this batch");
				int fid = sc.nextInt();
				psmt.setInt(3, fid);
				System.out.println("batch  Inserted successfully!!!!");

				psmt.executeUpdate();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displayBatch() {
		Connection con = Myconnection.getConnection();

		try {

			String sql = "select course.cid,course.cname,faculty.fname ,batch.bid, batch.bname from batch inner join faculty on batch.fid=faculty.fid inner join course on course.cid = faculty.cid;";

			PreparedStatement psmt = con.prepareStatement(sql);

			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {
				System.out.println("-----------------------------------|");
				System.out.println("Course ID = " + rs.getInt(1));
				System.out.println("-----------------------------------|");
				System.out.println("Course Name  = " + rs.getString(2));
				System.out.println("-----------------------------------|");
				System.out.println("Faculty fname = " + rs.getString(3));
				System.out.println("-----------------------------------|");
				System.out.println("Batch ID  = " + rs.getInt(4));
				System.out.println("-----------------------------------|");
				System.out.println("Batch Name  = " + rs.getString(5));
				System.out.println("-----------------------------------|");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void addStudent() {
		Connection con = Myconnection.getConnection();
		System.out.println("how many Students you want:-");
		int n = sc.nextInt();
		try {
			for (int i = 0; i < n; i++) {

				String sql = "insert into student values(?,?,?)";

				PreparedStatement psmt = con.prepareStatement(sql);
				System.out.print("Enter the Student-ID :- ");
				int sid = sc.nextInt();
				psmt.setInt(1, sid);
				System.out.print("Enter the Student Name:-");
				String sname = sc.next();
				psmt.setString(2, sname);
				displayBatch();
				System.out.println("Enter the batch You want to add to this student");
				int bid = sc.nextInt();
				psmt.setInt(3, bid);
				System.out.println("student  Inserted successfully!!!!");

				psmt.executeUpdate();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void displayStudent() {
		Connection con = Myconnection.getConnection();

		try {

			String sql = "select course.cid,course.cname,faculty.fname ,batch.bid, batch.bname,student.sname from student inner join batch on student.bid=batch.bid inner join faculty on faculty.fid=batch.fid inner join course on course.cid=faculty.cid";

			PreparedStatement psmt = con.prepareStatement(sql);

			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				System.out.println("-----------------------------------|");
				System.out.println("Course ID = " + rs.getInt(1));
				System.out.println("-----------------------------------|");
				System.out.println("Course Name  = " + rs.getString(2));
				System.out.println("-----------------------------------|");
				System.out.println("Faculty fname = " + rs.getString(3));
				System.out.println("-----------------------------------|");
				System.out.println("Batch ID  = " + rs.getInt(4));
				System.out.println("-----------------------------------|");
				System.out.println("Batch Name  = " + rs.getString(5));
				System.out.println("-----------------------------------|");
				System.out.println("Student Name  = " + rs.getString(6));
				System.out.println("-----------------------------------|");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
