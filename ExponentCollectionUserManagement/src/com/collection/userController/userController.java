package com.collection.userController;

import java.util.Scanner;

import com.collection.Service.userService;
import com.collection.serviceIMPL.userServiceIMPL;

public class userController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		userService u = new userServiceIMPL();
		while (true) {

			System.out.println("1.AddUser");
			System.out.println("2.ShowUser");
			System.out.println("3.Deleteuser");
			System.out.println("4.updateUser");
			System.out.println("5.Exit");
			System.out.println();
			System.out.println("Enter the choice :- ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				u.addUser();
				break;
			case 2:
				u.showUser();
				break;
			case 3:
				u.deleteUser();
				break;
			case 4:
				u.updateuser();
				break;
			case 5:
				flag = false;
			default:
				System.out.println("Invalid choice!!");
				break;
			}
		}
	}
}
