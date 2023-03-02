package com.Exponent.Inheritanceoverrideproject;

public class Maruti extends Car {

	

	@Override
	public void carType() {
		System.out.println("--Maruti is hatchback type--");
	}
	
	public void marutidetails() {
		Maruti mr = new Maruti();
		mr.setNoofSeats(5);
		mr.setNoOfTires(6);
		mr.setEnginetype("CNG");

		RunApp r = new RunApp();
		r.getmarutiDetails(mr);
	}
}
