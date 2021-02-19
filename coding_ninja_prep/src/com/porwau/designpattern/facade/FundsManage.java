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
	
	public boolean haveEnoughCash(double cashToWithdraw) {
		
		if(getAmount() >= cashToWithdraw) {
			
			return getAmount() >= cashToWithdraw;
		} else {
			System.out.println("You don't have enuf money.");
			return false;
		}
	}
}
