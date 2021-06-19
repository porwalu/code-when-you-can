package com.porwau.playarea;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

class DoubleLinkedList{
	EmployeeDoubleNode head;
	EmployeeDoubleNode tail;
	private int size = 0;
	void add(Emp e) {
		EmployeeDoubleNode curr = new EmployeeDoubleNode(e);

		if (head==null) {
			head = curr;
			tail = head;
			curr.setPrev(null);
			curr.setNext(null);
		}else {
			curr.setNext(head);
			curr.setPrev(null);
			head.setPrev(curr);
			head = curr;
		}
		size++;
	}
	int getSize() {
		return this.size;
	}
	void displayDLL(){
		EmployeeDoubleNode curr = head;
		System.out.print("null->");
		while(curr !=null) {
			System.out.print(curr.getEmployee());
			curr=curr.getNext();
			System.out.print("->");
		}
		System.out.println("null");

	}
}
class EmployeeDoubleNode{
	public EmployeeDoubleNode(Emp employee) {
		this.employee = employee;
	}
	private Emp employee;
	public Emp getEmployee() {
		return employee;
	}
	public void setEmployee(Emp employee) {
		this.employee = employee;
	}
	public EmployeeDoubleNode getNext() {
		return next;
	}
	public void setNext(EmployeeDoubleNode next) {
		this.next = next;
	}
	public EmployeeDoubleNode getPrev() {
		return prev;
	}
	public void setPrev(EmployeeDoubleNode prev) {
		this.prev = prev;
	}
	private EmployeeDoubleNode next;
	private EmployeeDoubleNode prev;

}
 
class LinkedList1 {
	EmployeeNode head;
	private int size;
	public EmployeeNode getHead() {
		return head;
	}
	public int getSize() {
		return size;
	}
	void add(Emp en) {
		EmployeeNode enode = new EmployeeNode(en);
		enode.setNext(head);
		head = enode;
		size++;
	}
	void printList(){
		EmployeeNode curr = head;
		System.out.print("HEAD-->");
		while(curr !=null) {
			System.out.print(curr.getEmployee());
			curr=curr.getNext();
			System.out.print("-->");
		}
		System.out.println("null");
	}
	int size() {
		return this.size;
	}
	EmployeeNode remove() {
		if(getSize()==0) {
			return null;
		}
		EmployeeNode removedNode = head;
		head = head.getNext();
		removedNode.setNext(null);
		size--;
		return removedNode;
	}
}
class EmployeeNode{
	private Emp employee;
	private EmployeeNode next;
	
	public EmployeeNode(Emp e) {
		this.employee = e;
	}
	public EmployeeNode() {
	}
	public Emp getEmployee() {
		return employee;
	}
	public void setEmployee(Emp employee) {
		this.employee = employee;
	}
	public EmployeeNode getNext() {
		return next;
	}
	public void setNext(EmployeeNode next) {
		this.next = next;
	}
}
public class Randomness {
	
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		Deque<String> dq = new ArrayDeque<>();
		
		int[] arr = new int[10];
		for(int i = 0; i < 4; i++) {
			arr[i] = i;
		}
		System.out.println(Arrays.toString(arr));
		int prevValue = arr[0];
		for(int i = 0; i < arr.length-1; i++) {
			int currValue = arr[i+1];
			arr[i+1] = prevValue;
			prevValue=currValue;
		}
		System.out.println(Arrays.toString(arr));

		System.out.println("SIze is " + arr.length);
		java.util.LinkedList<Integer> jll= new java.util.LinkedList<Integer>();
		
		jll.add(10);
		jll.add(20);
        LinkedList<Integer> list  = new LinkedList<>();
//		list.getLast();
System.out.println("29".compareTo("27"));
		Integer[] array = jll.toArray(new Integer[2]);
		Emp e1 = new Emp(1,"Utkarsh","Porwal");
		Emp e2 = new Emp(2,"Vasu","Porwal");
		Emp e3 = new Emp(2,"Ashu","Porwal");
		DoubleLinkedList dll1 = new DoubleLinkedList();
		dll1.add(e3);
		dll1.add(e2);
		dll1.add(e1);
		dll1.displayDLL();
		System.out.println("Size of DLL is - "+dll1.getSize());

		LinkedList1 ll1 = new LinkedList1();
		String str = 123 + "";
		//System.out.println(Integer.MAX_VALUE);
		List<Integer> lst = new ArrayList<Integer>();

		ll1.add(e1);
		ll1.add(e2);
		System.out.println(ll1.getSize());
//		ll1.printList();
//		ll1.remove();
//		System.out.println(ll1.getSize());
//		ll1.printList();
		List<Emp> el = new ArrayList<>();
		el.add(e1);
		el.add(e2);
		el.add(2, e3);
		el.add(e3);
		System.out.println(el.size());
		
		System.out.println(el.get(2));
		el.set(3, new Emp(3,"Aru","Porwal"));
		System.out.println(el.contains(e3));
		

		for(Emp e:el) {
			System.out.println(e);
		}
		lst.add(1);//add, remove, get,set,contains
		lst.add(1, 2);
		ListIterator<Integer> li = lst.listIterator();
		Iterator<Integer> iterator = lst.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
		factorial(6);
	}
	
	static void factorial(int n) {
		int fact = 1;
		for (int i = n ; i >=1; i--) {
			fact = fact*i;
		}
		System.out.println("factorial of " + n + " is " + fact);
	}
	
}
class Emp{
	private int id;
	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String firstName;
	private String lastName;
	
	Emp(int id, String firstName, String lastName){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;			
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	
}
	
