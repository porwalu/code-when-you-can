package com.porwau.playarea;

public class HeapTester {

	public static void main(String[] args) {
		Heap minHeap = new Heap(5);
		System.out.println(minHeap.getIndex());
		minHeap.insert(12);
		minHeap.insert(5);

		minHeap.insert(4);
		minHeap.insert(3);
		minHeap.insert(1);
		minHeap.traverse();

		System.out.println("Minimum heap value is  " + minHeap.getMin());
		System.out.println("Peeking - " + minHeap.peek());
	}

}
