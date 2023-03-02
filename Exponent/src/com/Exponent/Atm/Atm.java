package com.Exponent.Atm;

public class Atm {

	public static void main(String[] args) {
		
		CheckBalance cb = new CheckBalance();
		cb.chkbl();
		
		Withdraw wd = new Withdraw();
		wd.withd();
	}

}
