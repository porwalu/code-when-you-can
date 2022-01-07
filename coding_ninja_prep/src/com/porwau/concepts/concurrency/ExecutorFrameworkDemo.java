package com.porwau.concepts.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

class Task2 implements Runnable{
static int i = 1;
	@Override
	public void run() {
		
		System.out.println("Thread name in Task2 is " + Thread.currentThread().getName() + ", thread total - " + i++);
		
	}
	
}

class Task3 implements Callable<Integer>{
static int i = 1;
	@Override
	public Integer call() {
		System.out.println("Inside callable's call ");
//		System.out.println("Thread name in Task2 is " + Thread.currentThread().getName() + ", thread total - " + i++);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Random().nextInt();
		
	}
	
}
public class ExecutorFrameworkDemo {

	public static void main(String[] args) {
		
		int cpuCores = Runtime.getRuntime().availableProcessors();
		System.out.println("Number of cpu cores are " + cpuCores);
	//	ExecutorService service = Executors.newFixedThreadPool(cpuCores);
		Executor executorA = Executors.newFixedThreadPool(cpuCores);
//		for(int i = 0; i <=100; i++) {			
//		executorA.execute(new Task2());
//		}
		ScheduledExecutorService executorB = Executors.newScheduledThreadPool(cpuCores);
		//executorB.schedule(new Task2(), 5, SECONDS);//Calls after 5 seconds.
	//	executorB.scheduleAtFixedRate(new Task2(), 5, 2, SECONDS);
//		executorB.scheduleWithFixedDelay(new Task2(), 5, 2, SECONDS);
		System.out.println("Thread name in main is " + Thread.currentThread().getName());
		
		ExecutorService serviceC = Executors.newFixedThreadPool(5);
		List<Future<Integer>> listF = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			Future<Integer> future = serviceC.submit(new Task3());
			//serviceC.submit(new Task2());
			listF.add(future);
		}
		int i = 1;
		for( Future<Integer> f : listF) {
			System.out.println("Checking from main");
			try {
				System.out.println("Returned via get : " + f.get());
				System.out.println("future # :" +i );
	
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
			serviceC.shutdown();
			serviceC.shutdownNow();
		//	System.out.println("future final  :" +i );

	
	}

}
