package com.porwau.datastructures;

import java.util.LinkedList;
import java.util.List;

/**
 * @author porwau
 *
 */
class Node {
	Node next;
	int data;
	Node(int data ){
		this.data =data;
	}
	public Node() {
		System.out.println("Hello Head");
	}
}

class SinglyLinkedList {
	private Node head = new Node() ;
	
	public void addAfterHead(int data) {
		Node n = new Node(data);
		n.next=head.next;
		head.next = n;
	}
	public String toString() {
		Node n = head.next;
		int i = 1;
		String s="";
		while (n != null) {
			s = s + String.valueOf(n.data);
			n=n.next;
		}
		return s;
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

		System.out.println("Linked list is "+ sll);
	}

}