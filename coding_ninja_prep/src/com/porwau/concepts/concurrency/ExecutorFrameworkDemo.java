package com.porwau.concepts.concurrency;

import static java.util.concurrent.TimeUnit.SECONDS;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

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
	//	ExecutorService service = Executors.newFixedThreadPool(cpuCores);
		Executor executorA = Executors.newFixedThreadPool(cpuCores);
//		for(int i = 0; i <=100; i++) {			
//			executorA.execute(new Task2());
//		}
		ScheduledExecutorService executorB = Executors.newScheduledThreadPool(cpuCores);
		executorB.schedule(new Task2(), 5, SECONDS);//Calls after 5 seconds.
		executorB.scheduleAtFixedRate(new Task2(), 5, 2, SECONDS);
		executorB.scheduleWithFixedDelay(new Task2(), 5, 2, SECONDS);
		System.out.println("Thread name in main is " + Thread.currentThread().getName());
	}

}
