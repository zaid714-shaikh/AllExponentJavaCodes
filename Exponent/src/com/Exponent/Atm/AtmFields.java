package com.Exponent.Atm;

public class AtmFields {

	
	double totoalamount;
	double inputamount;
	
	
	public AtmFields setbalance()
	{
		AtmFields a = new AtmFields();
		a.totoalamount = 100.000d;
		a.inputamount = 500.000d;
		return a;
		
	}
	
}
