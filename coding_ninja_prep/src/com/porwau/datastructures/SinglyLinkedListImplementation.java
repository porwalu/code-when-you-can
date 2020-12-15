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
}

class SinglyLinkedList {
	public SinglyLinkedList() {
		head = new Node();
	}

	private Node head;

	/**
	 * Removes the node after Head in a linked list.
	 */
	public void removeAfterHead() {
		head.next = head.next.next;
	}

	/**
	 * @param data - data to be added in linked list
	 */
	public void addAfterHead(int data) {
		Node n = new Node(data);
		n.next = head.next;
		head.next = n;
	}

	/**
	 *Override toString to display content of LinkedList.
	 */
	public String toString() {
		Node n = head.next;
		System.out.println("");

		System.out.print("Linked list is - ");

		while (n != null) {
			// s = s + String.valueOf(n.data);
			System.out.print("[" + n.data + "]");
			n = n.next;
		}
		return "";
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
		sll.addAfterHead(2);
		sll.addAfterHead(3);
		sll.addAfterHead(4);
		sll.toString();
		sll.removeAfterHead();
		sll.toString();
	}

}