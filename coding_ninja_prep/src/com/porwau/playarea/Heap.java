package com.porwau.playarea;

public class Heap {

	private int[] heap;
	private int index;

	public Heap() {
		this(10);
	}

	public Heap(int capacity) {
		System.out.println("Initializing with capacity of " + capacity);
		heap = new int[capacity];
		index = -1;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void insert(int value) {
		if (!isFull()) {
			this.heap[++index] = value;
		} else {
			throw new IndexOutOfBoundsException("Heap is Full. Can't insert!!!");
		}
		// check if min heap logic is maintained.
		if (index > 0 && heap[getParent(index)] > heap[index]) {
			System.out.println("heap needs to be heapified for " + value);
			heapify(index);
		}
	}

	public void traverse() {
		System.out.println("Printing heap");
		for (int i = 0; i < heap.length; i++) {
			System.out.print(heap[i] + " -> ");
		}
		System.out.println("null");

	}

	private void heapify(int tempIndex) {
		int newVal = heap[tempIndex];// this will bubble up

		while (tempIndex > 0 && heap[getParent(tempIndex)] > newVal) {
			heap[tempIndex] = heap[getParent(tempIndex)];// swap to child
			tempIndex = getParent(tempIndex);// this is where the new value will be assigneds
		}
		heap[tempIndex] = newVal;
	}

	public int getMin() {
		if (index != -1) {
			return heap[0];
		} else {
			System.out.println("Heap is empty");
			return -1;
		}
	}

	public boolean isFull() {
		return index == heap.length - 1;
	}

	public boolean isEmpty() {
		return index == -1 ? true : false;
	}

	private int getParent(int index) {
		return (index - 1) / 2;
	}

	public int peek() {
		if (isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("Heap is empty. Can't peek");
		}
		return heap[0];
	}
}
