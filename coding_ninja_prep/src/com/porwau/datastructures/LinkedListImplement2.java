package com.porwau.datastructures;

import java.util.List;

/**
 * This implementation adds and removes the element at the end .
 * 
 * @author Utkarsh Porwal
 *
 */
class SinglyLinkedList1 {
	public SinglyLinkedList1() {
		head = new Node();
		//tail = head;
	}

	private Node head;
	//private Node tail;

	/**
	 * Removes the tail node.
	 */
	public void remove() {// this has to traverse since its not double link
		Node n = head.getNext();
		while (n.getNext().getNext() != null) {
			// do nothing
			n = n.getNext();
		}
		n.setNext(null);
	}

	/**
	 * add as a tail
	 * 
	 * @param data - data to be added in linked list
	 */
	public void add(int data) {// constant time
		Node n = new Node(data);
		n.setNext(null);
//		tail.next = n;
//		tail = n;
	}

	/**
	 * printList() method to Override toString to display content of LinkedList.
	 */
	public void printList() {
		Node currNode = head.getNext();
		System.out.println("");

		System.out.print("Linked list is - ");

		while (currNode != null) {
			System.out.print("[" + currNode.getData() + "]");
			currNode = currNode.getNext();
		}
	}

}

/**
 * Head of linkedlist has no data but just a reference to the actual node.
 * 
 * @author Utkarsh Porwal
 *
 */
public class LinkedListImplement2 {
	public static void main(String[] args) {
		SinglyLinkedList1 sll = new SinglyLinkedList1();
		SinglyLinkedList1 sl2 = new SinglyLinkedList1();
		sll.add(5);
		sll.add(4);
		sll.add(6);
		sll.printList();
	//	sll.remove();
		sll.add(2);
		sll.add(3);
		sll.add(4);

		sll.printList();
	}

}