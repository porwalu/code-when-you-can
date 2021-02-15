package com.porwau.concepts.concurrency;

class MyTask implements Runnable {
	@Override
	public void run() {
		System.out.println("inside mytask thread");
		try {
			Thread.sleep(5000);
			System.out.println("MyTask Thread finishes");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class ThreadInterruptionDemo {

	public static void main(String[] args) {
		MyTask task1 = new MyTask();
		Thread t1 = new Thread(task1);
		t1.start();
		System.out.println("Is interrupted? " + t1.isInterrupted());
		t1.interrupt();
		System.out.println("Is interrupted? " + t1.isInterrupted());

		System.out.println("Main Thread finishes");

	}

}
