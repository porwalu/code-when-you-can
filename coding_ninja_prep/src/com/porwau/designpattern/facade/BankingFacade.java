package com.porwau.designpattern.facade;

public class BankingFacade {

	private int accountNum;
	private String username;
	private String password;
	private double balance;
	public BankingFacade(int accountNum, String username, String password) {
		super();
		this.accountNum = accountNum;
		this.username = username;
		this.password = password;
		this.balance = 100.00;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void depositMoney(double d) {
		// TODO Auto-generated method stub
		
	}
	public void withdrawMoney(double d) {
		// TODO Auto-generated method stub
		
	}
	public void checkBalance() {
		// TODO Auto-generated method stub
		
	}

}
