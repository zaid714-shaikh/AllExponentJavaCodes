package com.CollectionProject.Controller;

import java.util.Scanner;

import com.CollectionProject.Service.Service;
import com.CollectionProject.ServiceIMPL.ServiceIMPL;

public class Admin {

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
			System.out.println("9.Update-Functions");
			System.out.println("10.Delete-Fucntions");
			System.out.println("11.Exit");
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
				s.updateFunctions();
				break;
			case 10:
				s.deleteFunctions();
				break;
			case 11:
				flag = false;
				break;
			default:
				System.out.println("Choice out of Range");
				break;
			}

		}

	}

	public static int getchoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice :-");
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
