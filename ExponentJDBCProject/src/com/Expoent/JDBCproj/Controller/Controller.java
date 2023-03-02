package com.Expoent.JDBCproj.Controller;

import java.util.Scanner;

import com.Expoent.JDBCproj.Service.Service;
import com.Expoent.JDBCproj.ServiceIMPL.ServiceIMPL;

public class Controller {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		Service s = new ServiceIMPL();

		while (flag) {
			System.out.println("1.Add-Course");
			System.out.println("2.Display-Course");
			System.out.println("3.Add-Faculty");
			System.out.println("4.Display-Faculty");
			System.out.println("5.Add-Batch");
			System.out.println("6.Display-Batch");
			System.out.println("7.Add-Student");
			System.out.println("8.Display-Student");
			System.out.println("9.Exit");
			System.out.println();

			int ch = getchoice();
			switch (ch) {
			case 1:
				s.addCourse();
				break;
			case 2:
				s.displayCourse();
				break;
			case 3:
				s.addFaculty();
				break;
			case 4:
				s.displayFaculty();
				break;
			case 5:
				s.addBatch();
				break;
			case 6:
				s.displayBatch();
				break;
			case 7:
				s.addStudent();
				break;
			case 8:
				s.displayStudent();
				break;
			case 9:
				flag = false;
				break;
			default:
				System.out.println("Choice out of Range");
				break;
			}

		}
	}

	private static int getchoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Choice:-");
		int ch;
		try {
			ch = sc.nextInt();
		} catch (Exception e) {
			System.out.println(e);
			return getchoice();
		}
		return ch;
	}

}
