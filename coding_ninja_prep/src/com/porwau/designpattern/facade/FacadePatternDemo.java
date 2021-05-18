package com.porwau.designpattern.facade;

public class FacadePatternDemo {

	public static void main(String[] args) {
	 BankingFacade bf = new BankingFacade(12345,"utkarsh","password");
	 bf.depositMoney(100);
	 bf.withdrawMoney(200);
	 bf.checkBalance();
	 
	}

}
