//IMPLEMENTED INTERFACE SBI

package com.Exponent.BankApplication.ServiceIMPL;

import java.util.Scanner;

import com.Exponent.BankApplication.Model.Account;
import com.Exponent.BankApplication.Serivce.RBI;

public class SBI implements RBI {

	Scanner sc = new Scanner(System.in);
	Account a[] = new Account[5];

	@Override
	public void registerAccount() {
		System.out.println("            |--------------------------------|");
		System.out.println("Enter How many accountuser you want :- ");
		int u = sc.nextInt();
		for (int i = 0; i < u; i++) {

			Account a1 = new Account();

			a1.setAccountNo(getValidAccountNo());

			a1.setAccountName(getValidName());

			a1.setAdharNo(getValidAdharNo());

			a1.setPanCardNo(getValidPancardNo());

			a1.setMobileNo(getValidMobileNo());

			a1.setAccountBalance(getValidDepositeamount());

			a[i] = a1;
		}

		System.out.println("            |--------------------------------|");

	}

	private int getValidAccountNo() {
		System.out.print("            |Enter the Account No :-         |");
		int accno = sc.nextInt();
		if (accno > 0) {
			System.out.println("Valid Account number");
		} else {
			System.out.println("Invalid account number");
			return getValidAccountNo();

		}
		return accno;
	}

	private String getValidName() {
		System.out.print("            |Enter the Account holders Name:-|");
		String name = sc.next();

		return name;
	}

	private long getValidAdharNo() {
		System.out.print("            |Enter the Adharcard number :-   |");
		long adharno = sc.nextLong();
		String an = String.valueOf(adharno);
		int anl = an.length();
		if (adharno > 0 && anl == 10) {
			System.out.println("Valid Adhar NO");
		} else {
			System.out.println("Invalid account no");
			return getValidAdharNo();

		}
		return adharno;
	}

	private long getValidPancardNo() {
		System.out.print("            |Enter the PanCard number :-     |");
		long pan = sc.nextLong();
		if (pan > 0) {
			System.out.println("Valid Pancard NO");
		} else {
			System.out.println("Invalid Pancard no");
			return getValidPancardNo();

		}
		return pan;
	}

	private long getValidMobileNo() {
		System.out.print("            |Enter the Mobile number :-      |");
		long mob = sc.nextLong();
		if (mob > 1000000000 && mob <= 9999999999l) {
			System.out.println("Valid mobile NO");
		} else {
			System.out.println("Invalid mobile no");
			return getValidMobileNo();

		}
		return mob;
	}

	private double getValidDepositeamount() {
		System.out.print("            |Enter the Dposite amount:-      |");
		long deposite = sc.nextLong();
		if (deposite > 0) {
			System.out.println("Valid Deposite Amount");
		} else {
			System.out.println("Invalid Deposite ammount");
			return getValidDepositeamount();

		}
		return deposite;
	}

	@Override
	public void showAccountDetails() {

		long ac = getValidUserAccountNumber();

		for (Account a1 : a) {

			if (a1 != null) {

				System.out.println("**********************" + a1.getAccountName() + "**************************");
				System.out.println("                      |$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$|");
				System.out.println("                      |$1.Account         :      " + a1.getAccountNo() + "|");
				System.out.println("                      |$2.AccountName     :      " + a1.getAccountName() + "|");
				System.out.println("                      |$3.AdharNumber     :      " + a1.getAdharNo() + "|");
				System.out.println("                      |$4.PanCardNumber   :      " + a1.getPanCardNo() + "|");
				System.out.println("                      |$5.MobileNumber    :      " + a1.getMobileNo() + "|");
				System.out.println("                      |$6.DepositeAmmount :   " + a1.getAccountBalance() + "|");
				System.out.println("                      |$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$|");
				System.out.println("");
			}
		}
	}

	private long getValidUserAccountNumber() {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		System.out.print("Enter the Account Number for Verification:-");
		long ac = sc.nextLong();
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && a[i].getAccountNo() == ac) {
				flag = true;
			}
		}

		if (!flag) {
			System.out.println("Account no Does not exist!!!!");
			return getValidUserAccountNumber();
		}
		return ac;
	}

	@Override
	public void showAccountBalance() {

		long ac = getValidUserAccountNumber();
		for (int i = 0; i < a.length; i++) {

			if (a[i] != null && a[i].getAccountNo() == ac) {
				System.out.println("Your Tota Account Balance is :- " + a[i].getAccountBalance());
			}
		}

	}

	@Override
	public void withdrawMoney() {

		long ac = getValidUserAccountNumber();

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.println("Enter Amount of Withdraw");
				int wa = sc.nextInt();
				if (wa < a[i].getAccountBalance()) {
					double ab = a[i].getAccountBalance();
					ab = ab - wa;
					a[i].setAccountBalance(ab);
					System.out.println("!!!!Withdraw Successfull!!!!");
					System.out.println("YOur total balance after withdraw is " + a[i].getAccountBalance());
				} else {
					System.out.println("Your amount exceed the limit!!");
				}
			}
		}
	}

	@Override
	public void depositeMoney() {

		long ac = getValidUserAccountNumber();

		for (int i = 0; i < a.length; i++) {

			if (a[i] != null) {
				System.out.println("Enter Amount of deposite");
				int wa = sc.nextInt();

				double ab = a[i].getAccountBalance();
				ab = ab + wa;
				a[i].setAccountBalance(ab);
				System.out.println("Deposite Successfull@#@@@@");
				System.out.println("Total Amount after deposite is " + a[i].getAccountBalance());

			}
		}

	}

	@Override
	public void updateAccountDetails() {

		long ac = getValidUserAccountNumber();
		int cnt = 0;

		for (Account a : a) {
			if (a != null && a.getAccountNo()==ac) {
				break;
			}
			else
			{
				cnt++;
			}
			
		}

		boolean flag = true;

		while (flag) {
			System.out.println("                      |$$$$$$$$$$$$$$$$$$$$$$$$$$|");
			System.out.println("                      |$1.Update MobileNumber   $|");
			System.out.println("                      |$2.Update AdharNumber    $|");
			System.out.println("                      |$3.Update PanCard        $|");
			System.out.println("                      |$4.Exite                 $|");
			System.out.println("                      |$$$$$$$$$$$$$$$$$$$$$$$$$$|");
			System.out.println("                      |--------------------------|");
			System.out.println("");

			System.out.println("Enter the Choice For Update the Details :- ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the updated Mobilenumber :- ");
				a[cnt].setMobileNo(sc.nextLong());
				System.out.println("Updated Succefully!!!");
				break;
			case 2:
				System.out.println("Enter the Updated AdharNumber :- ");
				a[cnt].setAdharNo(sc.nextLong());
				System.out.println("Updated Succefully!!!");
				break;
			case 3:
				System.out.println("Enter the updated Pancard number :-");
				a[cnt].setPanCardNo(sc.nextLong());
				System.out.println("Updated Succefully!!!");
				break;
			case 4:
				flag = false;
				System.out.println("Exite");
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
		}

	}

}
