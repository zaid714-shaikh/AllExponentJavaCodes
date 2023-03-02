package com.Exponent.Inheritanceoverrideproject;

public class Car {

	private int NoOfTires;
	private String Enginetype;
	private int noofSeats;

	public int getNoOfTires() {
		return NoOfTires;
	}

	public void setNoOfTires(int noOfTires) {
		NoOfTires = noOfTires;
	}

	public String getEnginetype() {
		return Enginetype;
	}

	public void setEnginetype(String enginetype) {
		Enginetype = enginetype;
	}

	public int getNoofSeats() {
		return noofSeats;
	}

	public void setNoofSeats(int noofSeats) {
		this.noofSeats = noofSeats;
	}

	public void carType() {
		System.out.println("depends on Company");
	}

	
	@Override
	public String toString() {
		return NoOfTires+" "+Enginetype+" "+noofSeats;
	}
}
