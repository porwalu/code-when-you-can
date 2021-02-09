package com.porwau.concepts.concurrency;

//"static void main" must be defined in a public class.

class AccountDetails implements Runnable{
 
 private long accountBalance;
 public void setBalance(long amount){
     this.accountBalance = amount;
 }
 public long getBalance(){
     return accountBalance;
 }
 
 public AccountDetails(){}

 public  void withdraw(long money){
	 synchronized(this) {
	     if(accountBalance < money){
	         System.out.println("Insufficient Amount. Withdrawing " + money +  " with balance " + accountBalance);
	         return;
	     }
	     System.out.println("Withdrawal of " + money + " successful.");
	     setBalance(accountBalance - money);
	 }
 }
 @Override
public void run(){
     System.out.println("Executing "+Thread.currentThread().getName() + "\'s thread. ");
//      withdraw(101);
     withdraw(90);
           
     long newBalance = getBalance();
     System.out.println("Interrupted status of " + Thread.currentThread().getName() + " is " + Thread.currentThread().interrupted());

     if(newBalance < 0){
         System.out.println("Money overdrawn");
     }
     System.out.println("Remaining Balance : " + getBalance());
     
 }
 
}
public class RaceCondition {
 public static void main(String[] args) {
     System.out.println("Hello World!");
     AccountDetails ad = new AccountDetails();
     ad.setBalance(100);

     Thread utkarsh = new Thread(ad);
     Thread aradhana = new Thread(ad);
     utkarsh.setName("vasu");
     aradhana.setName("aru");
     System.out.println("Interrupted status of " + Thread.currentThread().getName() + " is " + Thread.currentThread().interrupted());
     try {
		Thread.currentThread().sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     System.out.println("Interrupted status of " + Thread.currentThread().getName() + " is " + Thread.currentThread().interrupted());

     utkarsh.start();
     aradhana.start();
 }
}