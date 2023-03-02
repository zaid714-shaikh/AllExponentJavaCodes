//Admin Controller

package com.Exponent.BankApplication.Controller;

import java.util.Scanner;

import com.Exponent.BankApplication.Serivce.RBI;
import com.Exponent.BankApplication.ServiceIMPL.SBI;

public class Admin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		RBI r = new SBI();
		
		System.out.println("********************Welcome To Bank**************************");
		System.out.println("                      |----------MENU------------|");
		System.out.println("                      |$$$$$$$$$$$$$$$$$$$$$$$$$$|");
		System.out.println("                      |$1.RegisterBankAccount   $|");
		System.out.println("                      |$2.showAccountDetails    $|");
		System.out.println("                      |$3.showAccountBalance    $|");
		System.out.println("                      |$4.withdrawMoney         $|");
		System.out.println("                      |$5.depositeMoney         $|");
		System.out.println("                      |$6.UpdateDetails         $|");
		System.out.println("                      |$7.Exite                 $|");
		System.out.println("                      |$$$$$$$$$$$$$$$$$$$$$$$$$$|");
		System.out.println("                      |--------------------------|");
		System.out.println("");

		boolean flag = true;

		while (true) {
			System.out.print("Enter Your Choice :- ");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				r.registerAccount();
				break;
			case 2:
				r.showAccountDetails();
				break;
			case 3:
				r.showAccountBalance();
				break;
			case 4:
				r.withdrawMoney();
				break;
			case 5:
				r.depositeMoney();
				break;
			case 6:
				r.updateAccountDetails();
				break;
			case 7:
				flag = false;
				break;
			default:
				System.out.println("Invalid INput!!!");
				break;
			}
		}

	}
}
