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
	
	public boolean withdrawCash(double cashToWithdraw) {
		
		if(getAmount() >= cashToWithdraw) {
			redueCash(cashToWithdraw) ;
			System.out.println("Successfully withdrawn: " + cashToWithdraw);
			return true;
		} else {
			System.out.println("You don't have enuf money.");
			return false;
		}
	}
}
