package com.Exponent.Atm;

public class Withdraw {

	
	public void withd()
	{
		AtmFields a1 = new AtmFields();
		AtmFields af1 = a1.setbalance();
		System.out.println("Your Withdraw Balance is :: " + af1.inputamount);
		af1.totoalamount = af1.totoalamount - af1.inputamount;
		if(af1.inputamount > af1.totoalamount)
		{
			System.out.println("Insufficiant Balance!!!!!");
			
		}
		else
		{
			System.out.println("After Withdraw Total Balance is :: " + af1.totoalamount);
		}
	}
}
