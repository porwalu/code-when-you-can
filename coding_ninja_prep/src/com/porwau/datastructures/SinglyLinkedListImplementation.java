package com.porwau.datastructures;

import java.util.LinkedList;
import java.util.List;

/**
 * Typical Node class for a LinkedList
 * 
 * @author Utkarsh Porwal Revision History 1.1 - added length and getLength()
 *         for SinglyLinkedList. 1.0 - Added the reverse linked list method. 0.9
 *         - Added code to structure SLL, with add, remove, print methods
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
	 * 
	 * @return - true if removed or false
	 */
	public boolean remove() {
		if (getLength() == 1) {
			System.out.println("There is only head node and hence we cant remove anything else");
			return false;
		}
		head.next = head.next.next;
		length = getLength() - 1;
		return true;
	}

	/**
	 * @param data - data to be added in linked list
	 * @return true if added or false
	 */
	public boolean add(int data) {
		Node n = new Node(data);
		n.next = head.next;
		head.next = n;
		length = getLength() + 1;
		return true;
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

	/**
	 * reverse a LinkedList
	 * 
	 * @return true if r or false
	 */
	public boolean reverse() {
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
		return true;
	}

	public int getLength() {
		return length;
	}

	public void setLength() {
		length++;
	}
	public void redLength() {
		length--;
	}

	/**
	 * Add an element at specific index. 
	 * If there is already an element at index that is sifted to the right. 
	 * @param index - index to insert record at.
	 * @param data  - data to insert
	 * @return - true if insert is successful else false
	 */
	public boolean addAtIndex(int index, int data) {
		if (index < 0 || index > (length)) {
			System.out.println(index + " is invalid index. Valid index range for this linked list is from 1 - "
					+ (getLength() - 1));
			return false;
		} else {
			Node insert = new Node(data);
			Node curr = head;
			Node prev = null;
		if (index == 0) {
			head.next=insert;
			insert.next=null;
		}else {
			int i = 0;
			while (i != (index )) {
				prev = curr;
				curr = curr.next;
				i++;
			}
			insert.next = curr;
			prev.next=insert;
		}
			setLength();
			return true;
		}
	}
	public boolean removeAtIndex(int index) {
		if (index <= 0 || index >= length) {
			System.out.println(index + " is invalid index. Valid index range for this LinkedList is from 1 - "
					+ (getLength() - 1));
			return false;
		}
		Node curr = head;
		Node prev = null;
		int i = 0;
		while(i != index) {
			prev =curr;
			curr = curr.next;
			i++;
		}
		prev.next=curr.next;
		redLength();
		return true;
	}
}

public class SinglyLinkedListImplementation {
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		System.out.println("Length of linked list including Head node is " + sll.getLength());
		sll.addAtIndex(0, 4);
		sll.printList();
		sll.addAtIndex(1, 5);
		sll.printList();
		sll.addAtIndex(1, 3);
		sll.printList();
		sll.addAtIndex(3, 40);
		sll.printList();
		sll.reverse();
		sll.remove();
		sll.printList();
		sll.removeAtIndex(4);
		sll.printList();

	}
}