package com.org;

public class Account {

	private int accNo;
	private String accName;
	private long amount;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", amount=" + amount + "]";
	}
	public Account(int accNo, String accName, long amount) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.amount = amount;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
