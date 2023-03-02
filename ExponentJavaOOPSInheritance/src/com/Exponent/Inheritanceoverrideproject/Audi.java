package com.Exponent.Inheritanceoverrideproject;

public class Audi extends TATA {

	@Override
	public void carType() {
		System.out.println("--Audi is XUV type--");
	}

	@Override
	public Car showDetailstata() {
		Audi c = new Audi();
		c.setNoOfTires(5);
		c.setNoofSeats(5);
		c.setEnginetype("Petrol");
		return c;

	}

}
