package com.porwau.designpatterns;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

interface ATMState {
	void insertCard();

	void withdrawMoney(int money);

	void removeCard();

	void enterPin(int pin);
}

class HasCard implements ATMState {
	ATM atmMachine;

	public HasCard(ATM atm) {
		this.atmMachine = atm;
	}

	@Override
	public void insertCard() {
		System.out.println("Card Already inserted!!");
	}

	@Override
	public void withdrawMoney(int money) {
		System.out.println("Enter Pin first");
	}

	@Override
	public void removeCard() {
		System.out.println("Card removed!!");
		atmMachine.setCurrState(atmMachine.getNoCard());

	}

	@Override
	public void enterPin(int pin) {
		System.out.println("Pin Entered!!");
		atmMachine.setCorrectPinEntered();
		atmMachine.setCurrState(atmMachine.getHasPin());
	}

}

class NoCard implements ATMState {
	ATM atmMachine;

	public NoCard(ATM atm) {
		this.atmMachine = atm;
	}

	@Override
	public void insertCard() {
		atmMachine.setCurrState(atmMachine.getHasCard());
		System.out.println("Card Entered!! Please enter Pin to continue:");

	}

	@Override
	public void withdrawMoney(int money) {
		System.out.println("Enter Card and Pin First!!");

	}

	@Override
	public void removeCard() {
		System.out.println("Card Not Entered!!");

	}

	@Override
	public void enterPin(int pin) {
		System.out.println("Enter Card First!!");

	}

}

class HasPin implements ATMState {
	ATM atmMachine;

	public HasPin(ATM atm) {
		atmMachine = atm;
	}

	@Override
	public void insertCard() {
		System.out.println("Card already inserted!!");
	}

	@Override
	public void withdrawMoney(int money) {
		if (atmMachine.getCashInMachine() >= money) {
			atmMachine.setCashInMachine(atmMachine.getCashInMachine() - money);
			System.out.println("Withdrawn : " + money + ". Current Balance : " + atmMachine.getCashInMachine() );
			
			if(atmMachine.getCashInMachine() <=0) {
				atmMachine.setCurrState(atmMachine.getNoCash());
			}
			return;
		}
		System.out.println("Insufficient Cash!! Current Balance : " + atmMachine.getCashInMachine() + ".\nTrying to withdraw " + money);
		//atmMachine.setCurrState(atmMachine.getNoCash());
	}

	@Override
	public void removeCard() {
		System.out.println("Card Removed!!");
		atmMachine.setCurrState(atmMachine.getNoCard());

	}

	@Override
	public void enterPin(int pin) {
		System.out.println("Pin Already Entered!!");

	}

}

class NoCash implements ATMState {
	ATM atmMachine;
	public NoCash(ATM atm) {
		this.atmMachine = atm;
	}

	@Override
	public void insertCard() {
		System.out.println("Card Already inserted!!");

	}

	@Override
	public void withdrawMoney(int money) {
		System.out.println("No Cash Available, Removing Card. Please deposit more to wihtdraw.!!");
		atmMachine.setCurrState(atmMachine.getNoCard());

	}

	@Override
	public void removeCard() {
		System.out.println("Removing Card!!");
		atmMachine.setCurrState(atmMachine.getNoCard());
	}

	@Override
	public void enterPin(int pin) {
		System.out.println("Pin Already inserted!!");

	}

}

class ATM {
	ATMState noCard;
	ATMState hasCard;
	ATMState noCash;
	ATMState hasPin;
	ATMState currState;
	int cashInMachine = 10000;

	boolean correctPinEntered = false;

	public ATM() {
		super();
		noCard = new NoCard(this);
		hasCard = new HasCard(this);
		noCash = new NoCash(this);
		hasPin = new HasPin(this);
		currState = noCard;
		// this.correctPinEntered = correctPinEntered;
		if (cashInMachine < 0)
			currState = noCash;
	}

	public ATMState getCurrState() {
		return currState;
	}

	public void setCurrState(ATMState atmState) {
		this.currState = atmState;
	}

	public void setCorrectPinEntered() {
		this.correctPinEntered = true;
	}

	public int getCashInMachine() {
		return cashInMachine;
	}

	public void setCashInMachine(int cashInMachine) {
		this.cashInMachine = cashInMachine;
	}

	public void insertCard() {
		currState.insertCard();
		setCurrState(hasCard);
	}

	public void enterPin(int pin) {
		// TODO Auto-generated method stub
		currState.enterPin(pin);

	}

	public void withdrawMoney(int money) {
		currState.withdrawMoney(money);
	}

	public void removeCard() {
		// TODO Auto-generated method stub
		currState.removeCard();
	}

	public ATMState getNoCard() {
		return noCard;
	}

	public ATMState getHasCard() {
		return hasCard;
	}

	public ATMState getNoCash() {
		return noCash;
	}

	public ATMState getHasPin() {
		return hasPin;
	}

	public boolean isCorrectPinEntered() {
		return correctPinEntered;
	}
}

public class StateMachinePatternDemo {

	public static void main(String[] args) {
		ATM atm = new ATM();
		atm.insertCard();
		//System.out.println(atm.getCurrState());
		atm.enterPin(1234);
		atm.withdrawMoney(12340);
		atm.withdrawMoney(10000);
		atm.withdrawMoney(1);


	}

}
