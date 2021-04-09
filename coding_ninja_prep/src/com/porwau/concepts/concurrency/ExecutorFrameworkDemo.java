package com.porwau.concepts.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task2 implements Runnable{
static int i = 1;
	@Override
	public void run() {
		
		System.out.println("Thread name in Task2 is " + Thread.currentThread().getName() + ", thread total - " + i++);
		
	}
	
}
public class ExecutorFrameworkDemo {

	public static void main(String[] args) {
		
		int cpuCores = Runtime.getRuntime().availableProcessors();
		System.out.println("Number of cpu cores are " + cpuCores);
		ExecutorService service = Executors.newFixedThreadPool(cpuCores);
		for(int i = 0; i <=100; i++) {			
			service.execute(new Task2());
		}
		System.out.println("Thread name in main is " + Thread.currentThread().getName());
	}

}
