package com.porwau.concepts.concurrency;

import java.util.Arrays;
import java.util.Optional;

class PrintNum {
	static int counter = 1;
	static final int MAX = 10;

	void printEven() {
//		try {
////			Thread.sleep(1000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		synchronized (this) {

			while (counter < MAX) {
				if (counter % 2 != 0) {

					notify();
				} else {
					System.out.print(counter++ + " ");
					try {
						notify();
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

	void printOdd() {
		synchronized (this) {

			while (counter < MAX) {
				if (counter % 2 != 1) {

					notify();
				} else {
					System.out.print(counter++ + " ");
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

public class OEC {

	public static void main(String[] args) {
		
		
		Integer[] arr = {3,4,1,2,10,7};
		Arrays.sort(arr, (a,b)->Integer.compare(a, b));
		System.out.println(Arrays.toString(arr));

		

		PrintNum print = new PrintNum();

		Thread t1 = new Thread(() -> {
			print.printEven();
		});

		Thread t2 = new Thread(() -> {
			print.printOdd();

		});
		t2.start();

		t1.start();

	}

}
