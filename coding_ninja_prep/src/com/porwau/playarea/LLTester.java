package com.porwau.playarea;

import java.util.LinkedList;

class Employee {
	private String fname;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		if (lname == null) {
			if (other.lname != null)
				return false;
		} else if (!lname.equals(other.lname))
			return false;
		return true;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String lname;
	private int age;

	public Employee() {
		this("utkarsh", "porwal", 20);
	}

	public Employee(String fname, String lname, int age) {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}

	@Override
	public String toString() {
		return this.fname + " " + this.lname + " " + this.age;
	}
}

class Node<T> {

	private T data;
	private Node<T> next;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node(T d) {

		this.data = d;
	}

	public Node() {
		// TODO Auto-generated constructor stub
	}
}

class LL<T> {
	private Node<T> head;
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void add(T data) {

		Node newNode = new Node<>(data);
		if (size == 0) {
			head = newNode;
			size++;
			System.out.println("Inserting first entry");
		} else {
			newNode.setNext(head.getNext());
			head.setNext(newNode);
			size++;
		}

	}

	public boolean add(int i, T e1) {
		// i need to
		// index should be less than or = size.
		if (i > size) {
			System.out.println("Invalid Insertion index");
			return false;
		}

		// if i = 0. add before head
		Node<T> newNode = new Node(e1);
		if (i == 0) {
			// shift head
			newNode.setNext(head);
			head = newNode;
			size++;
			return true;
		}
		Node<T> currNode = head;

		int counter = 0;
		while (counter != i - 1) { // i need the node previous to index
			currNode = currNode.getNext();
			counter++;
		}
		// shift here.
		newNode.setNext(currNode.getNext());
		currNode.setNext(newNode);
		size++;
		return true;
	}

	public void traverse() {
		System.out.println("Size of list is " + size);
		if (size == 0) {
			System.out.println("Linked List is EMPTY!! Returning..");
			return;
		}

		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.getData() + "->");
			currNode = currNode.getNext();
		}
		System.out.println("null");

	}

	public T remove() {
		if (size == 0) {
			System.out.println("Linked List is empty. Can't remove any element");
			return null;
		}
		System.out.println("Removing First Entry...");
		Node<T> delNode = head;
		Node tempNode = head.getNext();
		head.setNext(null);
		head = tempNode;
		size--;
		return  delNode.getData();

	}

	public T remove(int index) {
		if (index > size - 1) {
			throw new IndexOutOfBoundsException("Index " + index + " is OOB");
		}
		if (size == 0) {
			System.out.println("Linked List is empty. Can't remove any element");
			return null;
		}
		int counter = 0;
		Node<T> currNode = head;
		if (index == 0) {// remove head
			Node<T> tempNode = head.getNext();
			head.setNext(null);
			head = tempNode;
			size--;
			return currNode.getData();
		} else {// currNode should be before the index node.
			while (counter != index - 1) {
				currNode = currNode.getNext();
				counter++;
			}
			Node<T> delNode = currNode.getNext();
			currNode.setNext(currNode.getNext().getNext());
			delNode.setNext(null);
			return delNode.getData();
		}

	}

	public T remove(T e1) {
		if (size == 0) {
			System.out.println("Linked List is empty. Can't remove any element");
			return null;
		}
		//need to chekc if object exists and delete or if object doesnt exist.
		Node<T> currNode = head;
		
		while (currNode !=null) {
			if(currNode.getData().equals(e1)) {
				System.out.println("I found an object using equals");
				return null;
			}else {
				currNode = currNode.getNext();
			}
		}
		System.out.println("Node " + e1 + " doesn't exist. Can delete!!!");
 		return null;
	}

	public void reverse() {
		// TODO Auto-generated method stub
		System.out.println("Reverse");
		Node<T> currNode = head;
		Node<T> prevNode = null;
		Node<T> nextNode ;

		while(currNode !=null) {
			nextNode = currNode.getNext();
			currNode.setNext(prevNode);
			prevNode = currNode;
			currNode=nextNode;
		}
		head=prevNode;
		
	}

}

public class LLTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL<Employee> ll1 = new LL();
		// ll1.traverse();
		ll1.add(new Employee("aru", "p", 30));
		Employee e1 = new Employee("vasu", "p", 30);

		ll1.add(e1);
		ll1.traverse();
		
//		ll1.reverse();
		//ll1.add(0, e1);
		// ll1.add(0,new Employee("papa", "p", 71));
		ll1.traverse();
//		ll1.remove(20);

		// System.out.println(ll1.remove(3));// remove the first element.
//			ll1.traverse();
		ll1.remove(new Employee("vasu", "p", 32));
		// ll1.remove(1);

		LL<String> ll2 = new LL();
//		ll2.add("Hello");
		// ll2.traverse();
//		System.out.println(ll2.remove());
		LinkedList<Employee> llist = new LinkedList();
		llist.add(e1);
		
		
		
	}

}
