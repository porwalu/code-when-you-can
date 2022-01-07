package com.porwau.concepts.concurrency;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TaskSequential implements Runnable {
	String str = "lock";

	@Override
	public void run() {
//		synchronized (str) {

		try {
			Thread.sleep(2000);
			System.out.println("Finished task for " + Thread.currentThread().getName() + " at " + Calendar.getInstance().getTime());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	}
}

public class ThreadSequential {

	public static void main(String[] args) throws InterruptedException {
		int i = 0;
		Calendar cal = Calendar.getInstance();
		Date d = new Date();
		System.out.println("Start time " + Calendar.getInstance().getTime());
		for (i = 0; i < 10; i++) {
			Thread t = new Thread(new TaskSequential());

			// new Thread(new TaskParallel()).start();
			t.start();
			t.join();
			// System.out.println("Thread complete : " + Thread.);
		}
		// System.out.println(d.getTime());

	}

}
