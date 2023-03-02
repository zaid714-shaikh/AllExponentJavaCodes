package com.Exponent.UserManagmentSystem.Controller;

import java.util.Scanner;

import com.Exponent.UserManagmentSystem.Service.UserService;
import com.Exponent.UserManagmentSystem.ServiceIMPL.UserServiceIMPL;

public class UserHandler {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		UserService u = new UserServiceIMPL();

		while (flag) {
			System.out.println("1.Adduser");
			System.out.println("2.displayusers");
			System.out.println("3.deleteusers");
			System.out.println("4.updateusers");
			System.out.println("5.exite");
			System.out.print("Enter the choice:-");
			int ch = getvalidchoice();

			switch (ch) {
			case 1:
				u.AddUser();
				break;
			case 2:
				u.DisplayUserInformation();
				break;
			case 3:
				u.DeleteUser();
				break;
			case 4:
				u.UpdateUserInformation();
				break;
			case 5:
				flag = false;
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
		}

	}

	public static int getvalidchoice() {
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		try {
			ch = sc.nextInt();
		} catch (Exception e) {
			System.out.println("In valid Choice re-enter it !!");
			return getvalidchoice();
		}

		return ch;

	}

}
