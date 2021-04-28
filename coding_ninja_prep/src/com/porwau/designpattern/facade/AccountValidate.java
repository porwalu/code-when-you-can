package com.porwau.designpattern.facade;

public class AccountValidate {
	private int accountNumber = 12345;

	public int getAccountNumber() {
		return accountNumber;
	}

	public boolean validateAccount(int accountNumber) {

		return this.accountNumber == accountNumber;
	}

}
