package com.porwau.concepts.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread name in Tas2 is " + Thread.currentThread().getName());
		
	}
	
}
public class ExecutorIndexerDemo {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		for(int i = 0; i <=100; i++) {			
			service.execute(new Task2());
		}
		System.out.println("Thread name in main is " + Thread.currentThread().getName());
	}

}
