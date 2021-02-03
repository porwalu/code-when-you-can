package com.porwau.playarea;

public class BankAccountThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount(100);
		Thread t1 = new Thread(ba);
		t1.setName("AC1");
		Thread t2 = new Thread(ba);
		t2.setName("AC2");
		t1.start();
		t2.start();
	}
}

class BankAccount implements Runnable{
	private int balance;
	
	BankAccount(int balance){
		this.balance=balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	synchronized int getBalance() {
		return balance;
	}
	synchronized int makeWithdrawal(int amount) {
		System.out.println("Current Balance " + balance);
		if(amount > balance) {
			System.out.println("Account balance insufficient for withdrawl");
			return 0;
		}
		System.out.println(Thread.currentThread().getName() + " is about to withdraw " + amount + " bucks.");

		balance-=amount;
		System.out.println(Thread.currentThread().getName() + " has withdrawn " + amount + " bucks.");
		return getBalance();
	}
	@Override
	public void run() {
		//System.out.println("Inside Run using thread - " + Thread.currentThread().getName());	
		makeWithdrawal(75);
		System.out.println("Final amount is " + balance);
		if(balance<0) {
			System.out.println("Money overdrawn");
		}
	}
}