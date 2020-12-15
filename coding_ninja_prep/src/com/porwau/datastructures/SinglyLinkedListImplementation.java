package com.porwau.datastructures;

import java.util.LinkedList;
import java.util.List;

/**
 * Typical Node class for a linkedlist
 * 
 * @author Utkarsh Porwal
 *
 */
class Node {
	Node next;
	int data;

	Node(int data) {
		this.data = data;
	}

	public Node() {
		System.out.println("Hello Head");
	}
	public Node getNext(Node n) {
		return n.next;
	}
}

/**
 * This implementation adds and removes  the first element after head .
 * @author Utkarsh Porwal
 *
 */
class SinglyLinkedList {
	public SinglyLinkedList() {
		head = new Node();
	}

	private Node head;

	/**
	 * Removes the node after Head in a linked list.
	 */
	public void remove() {
		head.next = head.next.next;
	}

	/**
	 * @param data - data to be added in linked list
	 */
	public void add(int data) {
		Node n = new Node(data);
		n.next = head.next;
		head.next = n;
	}

	/**
	 *printList() method to Override toString to display content of LinkedList.
	 */
	public void printList() {
		Node currNode = head.next;
		System.out.println("");

		System.out.print("Linked list is - ");

		while (currNode != null) {
			System.out.print("[" + currNode.data + "]");
			currNode = currNode.next;
		}
	}

}

/**
 * Head of linkedlist has no data but just a reference to the actual node.
 * 
 * @author Utkarsh Porwal
 *
 */
public class SinglyLinkedListImplementation {
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.add(2);
		sll.add(3);
		sll.add(4);
		sll.printList();
		sll.remove();
		sll.printList();
	}

}