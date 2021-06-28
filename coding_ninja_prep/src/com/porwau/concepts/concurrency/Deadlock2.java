package com.porwau.concepts.concurrency;

public class Deadlock2 {

	public static void main(String[] args) {
		String lock1 = "utkarsh";
		String lock2 = "porwal";
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (lock1) {
					System.out.println("T1 with lock1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("T1 waiting for lock2");
				}
				
				synchronized (lock2) {
					System.out.println("T1 has lock1 and lock2");	
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (lock2) {
					System.out.println("T2 with lock2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("T2 waiting for lock1");
				}
				
				synchronized (lock2) {
					System.out.println("T2 has lock1 and lock2");	
				}
			}
		});

		t1.start();
		t2.start();
	}

}
