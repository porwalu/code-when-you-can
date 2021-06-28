package com.porwau.concepts.concurrency;

public class Deadlock {

	public static Object lock1 = new Object();
	public static Object lock2 = new Object();

	public static void main(String[] args) {
		Thread t1 = new Thread(new TaskD1(lock1, lock2));

		Thread t2 = new Thread(new TaskD2(lock1, lock2));

		t1.start();
		t2.start();
	}

}

class TaskD1 implements Runnable {
	Object lock1, lock2;

	public TaskD1(Object lock1, Object lock2) {
		this.lock1 = lock1;
		this.lock2=lock2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("in thread 1 " + lock1 + " : " + lock2);
		synchronized (lock1) {
			System.out.println("Thread 1 with lock1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread 1: waiting for lock2");
		}

		synchronized (lock2) {
			System.out.println("Thread 1 with lock1 and lock2");

		}
		System.out.println("Thread 1 releasing all locks");
	}

}

class TaskD2 implements Runnable {
	Object lock1, lock2;

	public TaskD2(Object lock1, Object lock2) {
		this.lock1 = lock1;
		this.lock2=lock2;	}

	@Override
	public void run() {
		System.out.println("in thread 1 " + lock1 + " : " + lock2);

		synchronized (lock2) {
			System.out.println("Thread 2 with lock2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread 2: waiting for lock1");
		}

		synchronized (lock1) {
			System.out.println("Thread 2 with lock1 and lock2");
		}
		System.out.println("Thread 2 releasing all locks");

	}

}
