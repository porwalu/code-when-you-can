package com.porwau.concepts.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TaskCall implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello " + Thread.currentThread().getName());
		Thread.sleep(1000);
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += i;
		}
		return sum;
	}

}

public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		Callable<Integer> task = new TaskCall();
		Future[] future = new Future[3];
		for (int j = 0; j < 3; j++) {
			future[j] = threadPool.submit(task);
			System.out.println("Sum is " + future[j].get());
		}
	}

}
