package com.porwau.designpattern.facade;

public class BankingFacade {

	private int accountNum;
	private String username;
	private String password;
	public BankingFacade(int accountNum, String username, String password) {
		super();
		this.accountNum = accountNum;
		this.username = username;
		this.password = password;
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
	public void depositMoney(int i) {
		// TODO Auto-generated method stub
		
	}
	public void withdrawMoney(int i) {
		// TODO Auto-generated method stub
		
	}
	public void checkBalance() {
		// TODO Auto-generated method stub
		
	}

}
