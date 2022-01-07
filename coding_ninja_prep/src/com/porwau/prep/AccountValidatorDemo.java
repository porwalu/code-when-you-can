package com.porwau.prep;

class User {
	private String user;
	private String password;
	private long balance = 1500;

	public User(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}
	

	public long getBalance() {
		return balance;
	}


	public void setBalance(long balance) {
		this.balance = balance;
	}


	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

class AccountValidate {

	public boolean accountValidate(String user, String password) {
		return user == "Utkarsh" && password == "1234";
	}
}

class BankGreeting {

	public BankGreeting() {
		System.out.println("Welcome to ABC bank!!");
	}
}

class FundManager {

	public long getBalance(User user) {
		return user.getBalance();

	}

}

class AccountFacade {

	private AccountValidate av;
	private BankGreeting bg;
	private FundManager fm;

	public AccountFacade() {
		av = new AccountValidate();
		bg = new BankGreeting();
		fm = new FundManager();
	}

	boolean accountValidate(User user) {
		return av.accountValidate(user.getUser(), user.getPassword());
	}

	public void checkBalance(User user) {
		if (accountValidate(user)) {
			
			System.out.println("Account Balance:" + fm.getBalance(user));
		} else {
			System.out.println("Invalid credentials");
		}

	}

}

public class AccountValidatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User("Utkarsh", "1234");
		AccountFacade af = new AccountFacade();
		af.checkBalance(user);
//		System.out.println("Is Account valid : " 
//				+ af.accountValidate(user));

	}

}
