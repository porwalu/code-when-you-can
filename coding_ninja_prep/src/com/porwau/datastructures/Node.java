package com.porwau.datastructures;

public class Node {
	private Node next;
	private int data;

	public Node(int data) {
		this.setData(data);
	}

	public Node() {
		System.out.println("Hello Head");
	}

	public Node getNext(Node n) {
		return n.next;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
