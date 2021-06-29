package com.porwau.prep;

class Print {
	final int MAX = 10;
	int start = 1;

	void printEven() throws InterruptedException {
		synchronized (this) {
			while (start < MAX) {
				if (start % 2 == 1) {
					wait();
				}
				System.out.print(start + " ");
				start++;
				notify();
			}
		}
	}

	void printOdd() {
		synchronized (this) {
			while (start < MAX) {
				if (start % 2 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.print(start + " ");
				start++;
				notify();
			}
		}
	}
}


public class OddEvenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Print p = new Print();

		Thread te = new Thread(() -> {
			try {
				p.printEven();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread to = new Thread(() -> {
			p.printOdd();
		});
		
		te.start();
		to.start();


	}
	

}
