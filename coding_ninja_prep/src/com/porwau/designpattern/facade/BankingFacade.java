package com.porwau.designpattern.facade;

public class BankingFacade {

	private int accountNum;
	private String username;
	private String password;
	UserValidate uservalidate;
	AccountValidate accountValidate;
	WelcomeMessage wm;
	FundsManage funds;

	public BankingFacade(int accountNum, String username, String password) {
		super();
		this.accountNum = accountNum;
		this.username = username;
		this.password = password;
		wm = new WelcomeMessage();
		uservalidate = new UserValidate();
		accountValidate = new AccountValidate();
		funds = new FundsManage();
	}

	public int getAccountNum() {
		return accountNum;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}



	public void depositMoney(double d) {
		if (uservalidate.validateUser(getUsername(), getPassword())
				&& accountValidate.validateAccount(getAccountNum())) {
			funds.makeDeposit(d);
			
		}
	}

	public void withdrawMoney(double d) {
		if (uservalidate.validateUser(getUsername(), getPassword())
				&& accountValidate.validateAccount(getAccountNum())) {
			funds.withdrawCash(d);
		}
	}

	public void checkBalance() {
		System.out.println("Current Balance is: " + funds.getAmount());
	}

}
