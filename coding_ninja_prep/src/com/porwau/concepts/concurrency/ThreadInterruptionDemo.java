package com.porwau.concepts.concurrency;


class MyTask implements Runnable{
	@Override
	public void run() {
		System.out.println("inside mytask thread");
		Thread.sleep(10000);
	}
}
public class ThreadInterruptionDemo {

	public static void main(String[] args) {
		MyTask task1 = new MyTask();
		Thread t1 = new Thread(task1);
		t1.start();
		
	}

}
