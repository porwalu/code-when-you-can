package com.porwau.concepts.concurrency;

/**
 * Approach 1 - implement runnable.
 * 
 * @author Utkarsh
 *
 */
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Task task = new Task();
		Thread t = new Thread(task);

		t.setName("Hello");
		t.start();// run method is called first.
		//t.start();// run method is called first.

		//Thread.sleep(3000);
//		System.out.println("Main thread is " + Thread.currentThread().getName());
//		System.out.println("Inside Main");

	}

}

class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Inside run");
//		System.out.println("Sub thread - " + Thread.currentThread().getName());
//		Thread.currentThread().setName("Hi");
//		System.out.println("Sub thread - " + Thread.currentThread().getName());
//
//		work();
//		workMore();

	}

	private void work() {
		System.out.println("Inside work");
	}

	private void workMore() {
		System.out.println("Inside work more");
	}

}
