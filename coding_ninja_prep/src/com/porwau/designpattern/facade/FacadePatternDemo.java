package com.porwau.designpattern.facade;

public class FacadePatternDemo {

	public static void main(String[] args) {
	 BankingFacade bf = new BankingFacade(12345,"utkarsh","password");
	 bf.depositMoney(100.00);
	 bf.withdrawMoney(2000.00);
	 bf.checkBalance();
	 
	}

}
