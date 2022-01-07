package com.porwau.solid;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class OE{
	
	static final int MAX_VALUE = 10;
	static int counter = 1;
	public void printEven() {
		synchronized(this) {
			while(counter < 10 ) {
				if(counter % 2 == 0) {
					System.out.print(counter++ + " ");
				}else {
					notify();
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	public void printOdd() {
		synchronized(this) {
			while(counter < 10 ) {
				if(counter % 2 == 1) {
					System.out.print(counter++ + " ");
				}else {
					notify();
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}

class Task1 implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		System.out.println("hi from callable");
		return 1111;
	}
	
}

class Task2 implements Runnable{

	@Override
	public void run()  {
		System.out.println("hi from runnable");
	}
	
}
public class OED {

	public static void main(String[] args) {

		OE oe = new OE();
		
		Thread t1 = new Thread(()->{
			oe.printOdd();
		});

		Thread t2 = new Thread(()->{
			oe.printEven();
		});
		//t1.start();
		//t2.start();
		
		Executor e  = Executors.newFixedThreadPool(10);
		
		ExecutorService e1  = Executors.newFixedThreadPool(10);
		Future<Integer> f = e1.submit(new Task1());
		try {
			System.out.println(f.get());
		} catch (InterruptedException | ExecutionException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		Future f2 = e1.submit(new Task2());
		try {
			System.out.println(f2.get());
		} catch (InterruptedException | ExecutionException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		e1.shutdown();

	}

}
