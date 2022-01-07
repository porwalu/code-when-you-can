package com.porwau.concepts.concurrency;

import java.util.LinkedList;

enum VehicleType{
	HANDICAPPED,
	FOURWHEELER,
	TWOWHEELER
}
//FIFO
class BlockingQueue<T> {

	private int capacity;
	private static final int DEFAULT_CAPACITY = 2;
	LinkedList<T> queue = new LinkedList<>();

	public BlockingQueue(int capacity) {
		this.capacity = capacity;
	}

	public BlockingQueue() {
		this(DEFAULT_CAPACITY);
	}

	public void put(T data) throws InterruptedException {
		synchronized (this) {
			if (queue.size() == capacity) {
				this.wait();
			}
			System.out.println("Adding " + data);
			queue.add(data);
			if (queue.size() >= 1) {
				this.notify();
			}

		}
	}

	public T get() throws InterruptedException {
		synchronized (this) {
		//	boolean isEmpty = queue.size() == 0;
			if (queue.size() == 0) {
				this.wait();
			}
			System.out.println("remove " + queue.removeLast());
			if (queue.size() < capacity) {
				this.notify();
			}
		}
		return null;
	}

}

public class BlockingQueueDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		BlockingQueue<Integer> bq = new BlockingQueue<>();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					bq.put(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					bq.get();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
	}
}