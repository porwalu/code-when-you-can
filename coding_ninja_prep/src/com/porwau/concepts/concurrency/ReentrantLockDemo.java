package com.porwau.concepts.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Task1 implements Runnable{
	
	@Override
	public void run() {
		Lock lock = new ReentrantLock();
		try {
			lock.lockInterruptibly();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
		
	}
	
	
}
public class ReentrantLockDemo {

	
	public static void main(String[] args) {
		Task1 task = new Task1();
		Thread t1 = new Thread(task);
		t1.start();

	}

}
