package com.porwau.problemsolving;

public class MultiT {

	public static void main(String[] args) {
		PC pc = new PC();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				pc.produceOdd();
			}	
		});
		t1.start();	
		
		Even taskEven = new Even(pc);
//		Thread t = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				pc.produceEven();
//			}	
//		});	
		
		Thread t = new Thread(taskEven);
		t.start();
	}
}

class Even implements Runnable{
	
	private PC pc;
	public Even(PC pc) {
		this.pc = pc;
	}

	@Override
	public void run() {
		pc.produceEven();
	}
}


class PC{
	
	public void produceOdd() {
		synchronized (this) {
			try{
				this.wait();
				wait(1);
			}catch(InterruptedException e) {
				System.out.println("Interrupted");
				e.printStackTrace();
			}
			System.out.println("Inside produceOdd");
			for (int i = 1; i < 11; i += 2) {
				System.out.print(i + ",");
			}
			
		}
	}
	
	public void produceEven() {
		synchronized (this) {
			System.out.println("Inside produceEven");
			for (int i = 2; i < 12; i += 2) {
				System.out.print(i + ",");
			}
			System.out.println("");
			notify();//this wakes up the thread waiting on this objects monitor. In case multiple objects are waiting
			//a random thread will pick up the lock.
			//Also note tht the waiting thread will take lock only once this thread has completed 
			//and hence releases the lock
			notifyAll();
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}