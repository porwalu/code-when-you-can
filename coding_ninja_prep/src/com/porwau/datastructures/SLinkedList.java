package com.porwau.datastructures;

public class SLinkedList {
	public SLinkedList() {
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
