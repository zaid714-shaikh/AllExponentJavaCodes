//POJO-MODEL Account
package com.Exponent.BankApplication.Model;

public class Account {

	private long accountNo;
	private String accountName;
	private long adharNo;
	private long PanCardNo;
	private long MobileNo;
	private double accountBalance;

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public long getPanCardNo() {
		return PanCardNo;
	}

	public void setPanCardNo(long panCardNo) {
		PanCardNo = panCardNo;
	}

	public long getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

}
