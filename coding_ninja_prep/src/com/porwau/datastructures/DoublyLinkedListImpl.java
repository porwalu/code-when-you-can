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
	private int data;
	private int length;

	boolean addNode(int data) {// Just after head.
		Node newNode = new Node(data);

		if (head == null) {
			System.out.println("First ever node");
			head = newNode;
			// head.data=data;
			head.next = null;
			head.prev = null;
			tail = head;
			newNode = null;
		}
		// else {if(head == tail){//Only one node
//			newNode.next = head.next;
//			head.next.prev = newNode;
//			head.next=newNode;
//			newNode.prev = head;			
//		}else {//there are many nodes.
//			
//		}

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
	}
}

public class DoublyLinkedListImpl {

	public static void main(String[] args) {

		DoublyLinkedList<Integer> dll = new DoublyLinkedList<Integer>();
		dll.addNode(10);
		dll.printList();
		System.out.println();

		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		System.out.println("Size is " + ll.size());
	}

}
