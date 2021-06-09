package com.porwau.playarea;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;



/**
 * @author porwau
 *
 */
class QueueUsingArray {
	private static final int DEFAULT_CAPACITY = 10;
	private int front;
	private int back;
	private Emp[] queue;
	

	QueueUsingArray() {
		this(DEFAULT_CAPACITY);
	}

	QueueUsingArray(int capacity) {
		queue = new Emp[capacity];
	}

	public int getFront() {
		return front;
	}

	public void add(Emp e) {

		if (size() == queue.length - 1) {// 0 based
			System.out.println("Resize");
			Emp[] newArray = new Emp[2 * queue.length];
			System.arraycopy(queue, front, newArray, 0, queue.length - front);
			System.arraycopy(queue, 0, newArray, queue.length - front, back);
			back = size();
			front = 0;
			queue = newArray;
		}
		queue[back] = e;
		System.out.println("Added employee record at " + back);
		if (back < queue.length - 1) {
			back++;
		} else {// already at the end, reset back.
			System.out.println("Reset back");
			back = 0;
		}
	}

	public Emp remove() {
		if (size() == 0) {
			throw new NoSuchElementException();
		} else {
			Emp emp = queue[front];
			queue[front] = null; // dereference it.
			front++;
			if (size() == 0) {// we had only one element which we removed. reset front and back.
				front = 0;
				back = 0;
			} else if (front == queue.length - 1) {
				front = 0;
			}
			return emp;
		}
	}

	public Emp peek() {// returns front element without removing
		if (size() == 0) {
			throw new NoSuchElementException();
		
		}
		return queue[front];
	}

	int size() {
		if (front <= back) {
			return back - front;
		} else {
			return queue.length - front + back;
		}
	}

	void printQueue() {
		System.out.println("Printing queue");
		if (front <= back) {// not yet wrapped
			for (int i = front; i < back; i++) {
				System.out.println(queue[i]);
			}
		} else {
			for (int i = front; i <= queue.length - 1; i++) {
				System.out.println(queue[i]);
			}
			System.out.println("at the back now");
			for (int i = 0; i < back; i++) {
				System.out.println(queue[i]);
			}
		}

	}

}

public class QDemo {

	public static void main(String[] args) {
		Deque<Integer> lst1 = new LinkedList<>();

		
		
		Stack<Integer> stck = new Stack<Integer>();
		Deque<Integer> que = new ArrayDeque<>();
	
		que.addLast(1);
		que.addLast(5);
		System.out.println(que.peekFirst());

		System.out.println("Stack size is " + stck.size());
		QueueUsingArray queue = new QueueUsingArray(5);
		queue.add(new Emp(6, "Raj", "Kapoor"));
		queue.add(new Emp(7, "Raj", "Kundra"));
		queue.add(new Emp(6, "Ashok", "Kumar"));
		// queue.add(new Emp(8, "Utkarsh", "Kumar"));

		System.out.println(queue.remove());
		System.out.println(queue.remove());
		queue.add(new Emp(6, "Ram", "Kumar"));
		queue.add(new Emp(8, "Ghanshyam", "Kumar"));
		queue.add(new Emp(8, "Shyam", "Kumar"));
		System.out.println(queue.peek());
		queue.printQueue();
		if(1==1) {
			Deque<Integer> lst3 = new LinkedList<>();
		}else {
			Deque<Integer> lst3 = new ArrayDeque<>();

		}
	}
}