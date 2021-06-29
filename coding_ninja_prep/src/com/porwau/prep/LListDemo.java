package com.porwau.prep;


class Node<T>{

	private Node<T> next;
	private T data;
	
	public Node(T data) {
		super();
		this.next = next;
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}

class LL<T>{
	private Node<T> head;

	public LL() {
	}
	
	void add(T data) {
		Node<T> tmp = new Node<>(data);
		if(head == null) {
			head = tmp;
		}else {
			tmp.setNext(head.getNext());
			head.setNext(tmp);
		}
	}
	
	void traverse() {
		System.out.println();
		Node<T> currNode = head;
		while(currNode!=null) {
			System.out.print(currNode.getData()+"->");
			currNode = currNode.getNext();
		}
		System.out.print("null");
	}
	
	void reverse() {
		Node<T> currNode = head;
		Node<T> prevNode = null;
		
		while(currNode != null) {
			Node<T> nextNode = currNode.getNext();
			currNode.setNext(prevNode);
			prevNode=currNode;
			currNode=nextNode;
		}
		head=prevNode;
	}
}
public class LListDemo {

	public static void main(String[] args) {
		LL<Integer> ll = new LL<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		
		ll.traverse();
		LL<String> ll2 = new LL<>();
		ll2.add("utkarsh");
		ll2.add("vasu");
		ll2.add("aru");
		
		ll2.traverse();
		ll.reverse();
		ll.traverse();
		ll2.reverse();
		ll2.traverse();
	}

}
