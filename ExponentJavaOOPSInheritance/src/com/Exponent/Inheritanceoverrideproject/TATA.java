package com.Exponent.Inheritanceoverrideproject;

public class TATA extends Car {

	@Override
	public void carType() {
		System.out.println("--Tata is Seden type--");
	}

	public Car showDetailstata() {
		TATA ta = new TATA();
		ta.setNoOfTires(4);
		ta.setNoofSeats(4);
		ta.setEnginetype("Dissel");
		return ta;

	}

}
