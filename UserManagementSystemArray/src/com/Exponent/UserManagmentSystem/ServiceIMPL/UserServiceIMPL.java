package com.Exponent.UserManagmentSystem.ServiceIMPL;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.Exponent.UserManagmentSystem.Controller.UserHandler;
import com.Exponent.UserManagmentSystem.Model.User;
import com.Exponent.UserManagmentSystem.Service.UserService;

public class UserServiceIMPL implements UserService {

	Scanner sc = new Scanner(System.in);
	User u[] = new User[5];

	@Override
	public void AddUser() {

		System.out.println("How Many User You Want Add :- ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			User u1 = new User();
			int id = getValidUserId();

			u1.setUid(id);

			u1.setuName(getValidUserName());

			u1.setuAddress(getValidUserAddress());

			u1.setuMobileNumber(getValidUserNumber());

			u[i] = u1;
		}

	}

	private int getValidUserId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user id:-");
		//boolean flag = true;
		int uid = 0;

		try {
			uid = sc.nextInt();

		} catch (Exception e) {
			//flag = false;
			System.out.	println("Invalid number");
			return getValidUserId();
		}

//		if (!flag) {
//			return getValidUserId();	
//		}
		return uid;
	}

//	private  int gettrycathuserid()
//	{
//		System.out.println("Enter the User ID :- ");
//		int utid =0;
//		try {
//			 utid = sc.nextInt();
//		} catch (Exception e) {
//		System.out.println("Invalid UID reenter it!!");
//		return gettrycathuserid();
//		}
//		return utid;
//	}

	private String getValidUserName() {
		System.out.print("Enter the user name :- ");
		String uname = sc.next();

		int un = uname.length();
		boolean flag = true;
		for (int i = 0; i < un; i++) {
			char ch = uname.charAt(i);
			if (!(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')) {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("Valid Username go ahead");
		} else {
			System.out.println("Invalid Username Try again");
			return getValidUserName();
		}
		return uname;

	}

	private long getValidUserNumber() {
		System.out.print("Enter the User MobileNumber :- ");
		long umobilenumber = sc.nextLong();
		String ums = String.valueOf(umobilenumber);
		int umsl = ums.length();
		if (umobilenumber > 0 && umsl == 10) {
			System.out.println("Valid Mobile Number!!");
		} else {
			System.out.println("Invalid Mobile Number renter pls ");
			return getValidUserNumber();

		}

		return umobilenumber;
	}

	private String getValidUserAddress() {
		System.out.print("Enter the User Address:- ");
		String uadd = sc.next();
//		boolean flag = true;
//		int un = uadd.length();
//		for (int i = 0; i < u.length; i++) {
//			char ch =uadd.charAt(i);
//			if (!(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')) {
//				flag = false;
//			}
//		}
//		if (flag) {
//			System.out.println("Valid Username go ahead");
//		} else {
//			System.out.println("Invalid Username Try again");
//			return getValidUserAddress();
//		}

		return uadd;
	}

	@Override
	public void DisplayUserInformation() {

		boolean flag = true;
		while (flag) {
			System.out.println("                      |$$$$$$$$$$$$$$$$$$$$$$$$$$|");
			System.out.println("                      |$1.Show AllINfo          $|");
			System.out.println("                      |$2.Show SingleINfo       $|");
			System.out.println("                      |$3.Exite                 $|");
			System.out.println("                      |$$$$$$$$$$$$$$$$$$$$$$$$$$|");
			System.out.println("                      |--------------------------|");
			System.out.println("Enter Your choice:-");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				for (User user : u) {
					if (user != null) {
						System.out.println(
								"********************************************************************************");
						System.out.println(
								"                      |$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$|");
						System.out.println(
								"                      |$1.UserID         :                " + user.getUid() + "|");
						System.out.println(
								"                      |$2.UserName       :               " + user.getuName() + "|");
						System.out.println(
								"                      |$3.UserNumber     :      " + user.getuMobileNumber() + "|");
						System.out.println(
								"                      |$4.UserAddress    :           " + user.getuAddress() + "|");
						System.out.println(
								"                      |$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$|");
						System.out.println("");
					}

				}

				break;
			case 2:
				System.out.println("Enter the Name whos data wants to show :- ");
				String uname = sc.next();
				for (int i = 0; i < u.length; i++) {
					if (u[i] != null && uname.equalsIgnoreCase(u[i].getuName())) {
						System.out.println(
								"********************************************************************************");
						System.out.println(
								"                      |$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$|");
						System.out.println(
								"                      |$1.UserID         :                " + u[i].getUid() + "|");
						System.out.println(
								"                      |$2.UserName       :               " + u[i].getuName() + "|");
						System.out.println(
								"                      |$3.UserNumber     :      " + u[i].getuMobileNumber() + "|");
						System.out.println(
								"                      |$4.UserAddress    :           " + u[i].getuAddress() + "|");
						System.out.println(
								"                      |$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$|");
						System.out.println("");
					}
				}
				break;
			case 3:
				flag = false;
				break;
			default:
				System.out.println("Invalid Choice!!!");
				break;
			}
		}

	}

	private int getDeleteUID() {
		System.out.println("Enter the id you want to delete :- ");
		int suid1 = sc.nextInt();
		boolean flag = false;

		for (User user : u) {
			if (user != null && user.getUid() == suid1) {

				flag = true;
			}

		}
		if (!flag) {
			System.out.println("ID not Exist");
			return getDeleteUID();
		}
		return suid1;

	}

	@Override
	public void DeleteUser() {

		int count = 0;
		int suid = getDeleteUID();
		for (User user : u) {
			if (user != null && user.getUid() == suid) {
				break;
			} else {
				count++;
			}

		}
		u[count] = null;
		System.out.println("sucessfully Deleted!!!");
	}

	private int getValidUserUpdate() {
		System.out.println("Enter the id you want to update :- ");
		int update = sc.nextInt();
		

		boolean flag = false;
		for (User user : u) {
			if (user != null && user.getUid() == update) {
				flag = true;
				break;
			}

		}
		if (!flag) {
			System.out.println("Id Not Exist");
			return getValidUserUpdate();
		}

		return update;
	}

	@Override
	public void UpdateUserInformation() {
		boolean flag = true;

		int suid = getValidUserUpdate();
		for (User user : u) {
			if (user != null) {
				if (user.getUid() == suid) {
					while (flag) {
						System.out.println("                      |$$$$$$$$$$$$$$$$$$$$$$$$$$|");
						System.out.println("                      |$1.Update UserName       $|");
						System.out.println("                      |$2.Update UserNumber     $|");
						System.out.println("                      |$3.Update UserAddress    $|");
						System.out.println("                      |$4.Exite                 $|");
						System.out.println("                      |$$$$$$$$$$$$$$$$$$$$$$$$$$|");
						System.out.println("                      |--------------------------|");
						System.out.println("Enter the field you want to update:-");
						int ch = sc.nextInt();
						switch (ch) {
						case 1:
							System.out.println("Enter the New UserName:- ");
							user.setuName(sc.next());
							break;
						case 2:
							System.out.println("Enter the New UserNumber:- ");
							user.setuMobileNumber(sc.nextLong());
							break;
						case 3:
							System.out.println("Enter the New UserAddress:- ");
							user.setuAddress(sc.next());
							break;
						case 4:
							flag = false;
							break;
						default:
							System.out.println("INvalid choice!!");
							break;
						}

					}

				}

			}

		}

	}

}
