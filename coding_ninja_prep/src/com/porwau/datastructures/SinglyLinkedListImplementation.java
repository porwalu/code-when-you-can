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

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

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
		head.setNext(head.getNext().getNext());
		length = getLength() - 1;
		return true;
	}

	/**
	 * @param data - data to be added in linked list
	 * @return true if added or false
	 */
	public boolean add(int data) {
		Node n = new Node(data);
		n.setNext(head.getNext());
		head.setNext(n);
		length = getLength() + 1;
		return true;
	}

	/**
	 * printList() method to Override toString to display content of LinkedList.
	 */
	public void printList() {
		Node currNode = head.getNext();
		System.out.print("Linked list is - ");
		while (currNode != null) {
			System.out.print("[" + currNode.getData() + "]");
			currNode = currNode.getNext();
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
		Node curr = head.getNext();
		Node next = null;
		while (curr != null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		head.setNext(prev);
		return true;
	}

	public int getLength() {
		return length;
	}

	public void increaseLength() {
		length++;
	}

	public void reduceLength() {
		length--;
	}

	/**
	 * Add an element at specific index. If there is already an element at index
	 * that is sifted to the right.
	 * 
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
				head.setNext(insert);
				insert.setNext(null);
			} else {
				int i = 0;
				while (i != (index)) {
					prev = curr;
					curr = curr.getNext();
					i++;
				}
				insert.setNext(curr);
				prev.setNext(insert);
			}
			increaseLength();
			return true;
		}
	}

	/**
	 * @param index - remove an element at index
	 * @return - true if removed else false
	 */
	public boolean removeAtIndex(int index) {
		if (index <= 0 || index >= length) {
			System.out.println(index + " is invalid index. Valid index range for this LinkedList is from 1 - "
					+ (getLength() - 1));
			return false;
		}
		Node curr = head;
		Node prev = null;
		int i = 0;
		while (i != index) {
			prev = curr;
			curr = curr.getNext();
			i++;
		}
		prev.setNext(curr.getNext());
		reduceLength();
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
		SinglyLinkedList sll2 = new SinglyLinkedList();
		SinglyLinkedList sll3 = new SinglyLinkedList();
		sll2.add(3);
		sll2.add(4);
		sll2.add(2);
		sll2.printList();

		sll3.add(4);
		sll3.add(6);
		sll3.add(5);
		sll3.printList();
	}
}