package com.porwau.designpattern.facade;

public class FundsManage {
	private double amount = 1000.00;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void addCash(double amount) {
		setAmount(getAmount() + amount);
	}

	public void redueCash(double amount) {
		setAmount(getAmount() - amount);
	}
	
	public void withdrawCash(double cashToWithdraw) {
		
		if(getAmount() >= cashToWithdraw) {
			redueCash(cashToWithdraw) ;
			System.out.println("Successfully withdrawn: " + cashToWithdraw);
			System.out.println("New balance is: " + getAmount());
		} else {
			System.out.println("You don't have enuf money to withdraw " + cashToWithdraw);
			System.out.println("Current balance is: " + getAmount());

		}
	}
	
	public void makeDeposit(double cashToDeposit) {
		addCash(cashToDeposit);
		System.out.println("Successfully Added: " + cashToDeposit);
		System.out.println("Current balance is: " + getAmount());
	}
	
}
