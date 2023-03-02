package com.Exponent.Atm;

public class CheckBalance {
	
	public void chkbl()
	{
		AtmFields a =new AtmFields();
		AtmFields af = a.setbalance();
		System.out.println("Total Balance is :: " + af.totoalamount);
		
		
	}
//	public static void main(String[] args) {
//		CheckBalance c =new CheckBalance();
//		c.chkbl();
//	}

}
