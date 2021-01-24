package com.porwau.concepts.concurrency;

class Email implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getState());

		System.out.println("I am inside Email");
		System.out.println("Thread name " + Thread.currentThread().getName());

	}
}

class Data implements Runnable {
	@Override
	public void run() {
		System.out.println("I am inside Aggregation");
		System.out.println("Thread name " + Thread.currentThread().getName());
	}

}

class BankAccount implements Runnable {
	private int balance = 100;

	public void makeWithdrawal(int amount) {
	synchronized(this) {
		if(balance >=amount) {
			System.out.println(amount + " bucks to be withdrawn by "+ Thread.currentThread().getName());
			balance -= amount;
		}else {
			System.out.println("Money cant be withdrawn due to less balance. Please try later - " + Thread.currentThread().getName());
		}
	}
	}
	@Override
	public void run() {
		makeWithdrawal(75);
		if(balance < 0) {
			System.out.println("Money Overdrawn");
		}
	}
}
public class ThreadDemo3 {
	public static void main(String[] args) throws InterruptedException {
		BankAccount account = new BankAccount();
		Thread vasu = new Thread(account);
		vasu.setName("Vasu");
		Thread aru = new Thread(account);
		aru.setName("Aru");
		vasu.start();
		aru.start();
		
		Email email = new Email();
		Data data = new Data();
		Thread t1 = new Thread(email);
		t1.setName("email");
		Thread t2 = new Thread(data);
		t2.setName("data");
		System.out.println(t1.getPriority());
		System.out.println(t1.getStackTrace() + "  " + t1.getState());
		// t1.start();
		Thread.currentThread().sleep(10);
		System.out.println(t1.getStackTrace() + "  " + t1.getState());
		t2.start();
		try {
			//
			t2.join(1);
			t2.sleep(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Thread name " + Thread.currentThread().getName());


	}

}
