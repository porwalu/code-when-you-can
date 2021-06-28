package com.porwau.concepts.concurrency;

class Print{
	int counter = 1;
	int max = 10;
	
	void printOdd() {
		synchronized(this) {
			while(counter < max) {
				if(counter %2 == 0) {
					try{
						wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.print(counter + " ");
				counter++;
				notify();
			}
		}
	}
	
	void printEven() {
		synchronized(this) {
			while(counter < max) {
				if(counter %2 == 1) {
					try{
						wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.print(counter + " ");
				counter++;
				notify();
			}
		}
	}
}

public class OddEvenConcurrency {
	public static void main(String[] args) {
		Print p = new Print();
		Thread oddThread = new Thread(new Runnable() {
			public void run() {
				p.printOdd();
			}
		});		
		Thread evenThread = new Thread(new Runnable() {
			public void run() {
				p.printEven();
			}
		});
		oddThread.start();
		evenThread.start();
	}
}