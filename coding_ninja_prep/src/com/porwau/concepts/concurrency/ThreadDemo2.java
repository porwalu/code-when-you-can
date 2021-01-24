package com.porwau.concepts.concurrency;

public class ThreadDemo2 {

	public static void main(String[] args) {
		System.out.println("Inside Main");
		MyThread mt = new MyThread();
		mt.start();
		
	}

}

class MyThread extends Thread{// here i will define tasks. Thread has run method as it implements runnable. but nothing on it. So i will override run.
	
	@Override 

	public void run() {
		System.out.println("Inside run");
		work();
		workMore();
	}

	private void work() {
		System.out.println("Inside work");
	}

	private void workMore() {
		System.out.println("Inside work more");
	}
	
	
}