package com.porwau.designpatterns;


class AccountValidate{
	private String account="12345";
	
	boolean accountValidate(String account) {
		
		return account.equals(account);
	}
	
}

class FundManager{
	private double money = 1000.0;

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money += money;
	}
	
	
}

class UserValidate{
	private String user = "utkarsh";
	private String password = "password";
	
	boolean userValidate(String user, String pass) {
		
		return this.user == user && this.password == pass;
	}
}

class WelcomeMessage{
	public WelcomeMessage() {
		System.out.println("Welcome to XYZ bank of india.");
	}
}
class BankFacade {
	
	private String username;
	private String password;
	private String account;
	AccountValidate accountvalidate;
	UserValidate uservalidate;
	WelcomeMessage wm;
	FundManager fm;

	public BankFacade(String username, String password, String account) {
		this.username = username;
		this.password = password;
		this.account = account;
		accountvalidate = new AccountValidate();
		uservalidate = new UserValidate();
		wm = new WelcomeMessage();
		fm = new FundManager();
	}

	public void checkBalance() {
		if(uservalidate.userValidate(username, password) && accountvalidate.accountValidate(account)) {
			System.out.println("Balance is : " + fm.getMoney());
		}else {
			System.out.println("User or Account Validation failed");
		}
		
	}

	public void deposit(double money) {
		if(uservalidate.userValidate(username, password) && accountvalidate.accountValidate(account)) {
			fm.setMoney(money);
			System.out.println("Successfully deposited " + money + ". New Balance is " + fm.getMoney());
		}else {
			System.out.println("User or Account Validation failed");
		}		
	}

	public void withdraw(double money) {
		
		if(uservalidate.userValidate(username, password) && accountvalidate.accountValidate(account)) {
			if(fm.getMoney() >= money) {
				fm.setMoney(-money);
				System.out.println("Successfully withdrew " + money + ". New Balance is " + fm.getMoney());

			}else {
				System.out.println("Insufficient Balance!!. Current Balance : " + fm.getMoney() + " . Requested : " + money);
			}
		}else {
			System.out.println("User or Account Validation failed");
		}		
	}

}

public class FacadePatternDemo {

	public static void main(String[] args) {
		BankFacade bf = new BankFacade("utkarsh","password","12345");
		bf.checkBalance();
		bf.deposit(200.0);
		bf.withdraw(10000.0);
	}

}
