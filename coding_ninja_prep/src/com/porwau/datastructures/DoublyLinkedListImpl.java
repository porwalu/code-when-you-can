package com.porwau.datastructures;

import java.util.LinkedList;

//import java.util.Collections
/**
 * Node has data, prev and next 1st node after Head, will have prev as null Last
 * node will have next as null/
 * 
 * @author Utkarsh Porwal
 *
 */

class DoublyLinkedList<Integer> {

	class Node {
		private int data;
		private Node next;
		private Node prev;

		Node() {
			System.out.println("Welcome to initialization");
		}

		Node(int data) {
			this.data = data;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	/**
	 * @param data - data to be added
	 * @return - boolean if successful
	 */
	boolean addNode(int data) {// Just after head.
		Node newNode = new Node(data);

		if (head == null) {
			System.out.println("First ever node");
			head = newNode;
			head.next = null;
			head.prev = null;
			tail = head;
			newNode = null;
		} else {
			newNode.next = head.next;
			if (head == tail) {
				tail = newNode;
			} else {
				head.next.prev = newNode;
			}
			head.next = newNode;
			newNode.prev = head;
		}
		size++;
		return true;
	}

	boolean removeNode() {
		return true;
	}

	void printList() {
		System.out.print("LinkedList content are - ");
		Node curr = head;
		while (curr != null) {
			System.out.print("[" + curr.data + "]");
			curr = curr.next;
		}
		System.out.println(", size is  - " + this.size);
	}
}

public class DoublyLinkedListImpl {

	public static void main(String[] args) {

		DoublyLinkedList<Integer> dll = new DoublyLinkedList<Integer>();
		dll.addNode(10);

		dll.printList();
		dll.addNode(20);
		dll.printList();

		System.out.println();

		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		System.out.println("Size is " + ll.size());
	}

}
