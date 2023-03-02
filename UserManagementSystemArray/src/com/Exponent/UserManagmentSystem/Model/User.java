package com.Exponent.UserManagmentSystem.Model;

public class User {

	private int uid;
	private String uName;
	private String uAddress;
	private double uAalary;
	private long uMobileNumber;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuAddress() {
		return uAddress;
	}

	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}

	public double getuAalary() {
		return uAalary;
	}

	public void setuAalary(double uAalary) {
		this.uAalary = uAalary;
	}

	public long getuMobileNumber() {
		return uMobileNumber;
	}

	public void setuMobileNumber(long uMobileNumber) {
		this.uMobileNumber = uMobileNumber;
	}

}
