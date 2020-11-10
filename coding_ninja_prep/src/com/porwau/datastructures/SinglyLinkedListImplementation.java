package com.porwau.datastructures;

import java.util.LinkedList;
import java.util.List;

/**
 * Typical Node class for a linkedlist
 * 
 * @author Utkarsh Porwal Revision History 1.1 - added length and getLength()
 *         for SinglyLinkedList. 1.0 - Added the reverse linked list method. 0.9
 *         - Added code to strtucture SLL, with add, remove, print methods
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
 * This implementation adds and removes the first element after head . This also
 * calculates length of LinkedList and can reverse a Linked List.
 * 
 * @author Utkarsh Porwal
 *
 */
class SinglyLinkedList {
	public SinglyLinkedList() {
		head = new Node();
		length = 1;
	}

	private Node head;
	private int length;

	/**
	 * Removes the node after Head in a linked list. If Head is the only node,
	 * nothing gets removed
	 */
	public void remove() {
		if (getLength() == 1) {
			System.out.println("There is only head node and hence we cant remove anything else");
			return;
		}

		head.next = head.next.next;
		length = getLength() - 1;
	}

	/**
	 * @param data - data to be added in linked list
	 */
	public void add(int data) {
		Node n = new Node(data);
		n.next = head.next;
		head.next = n;
		length = getLength() + 1;
	}

	/**
	 * printList() method to Override toString to display content of LinkedList.
	 */
	public void printList() {
		Node currNode = head.next;

		System.out.print("Linked list is - ");

		while (currNode != null) {
			System.out.print("[" + currNode.data + "]");
			currNode = currNode.next;
		}
		System.out.println("");

	}

	public void reverse() {
		Node prev = null;
		Node curr = head.next;
		Node next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head.next = prev;
	}

	public int getLength() {
		return length;
	}

	/**
	 * Add an element at specific index index of 0 is for head so acceptable values
	 * are from: 1 - (length-1)
	 * 
	 * @param index - index to insert record at.
	 * @param data
	 * @return - true if insert successful else false
	 */
	public boolean addAtIndex(int index, int data) {
		if (index <= 0 || index > (length - 1)) {
			System.out.println(index + " is invalid index. Valid index range for this linked list is from 1 - "
					+ (getLength() - 1));
			return false;
		} else {

			return true;
		}
		// TODO Auto-generated method stub

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
//		sll.add(3);
//		sll.add(4);
//		sll.printList();
//		sll.reverse();
//		sll.printList();
//		sll.add(4);
		sll.addAtIndex(2, 4);
		System.out.println("Length of linked list including Head node is " + sll.getLength());

//		sll.remove();
//		sll.printList();
//		System.out.println("Length of linked list including Head node is " + sll.getLength());

	}
}