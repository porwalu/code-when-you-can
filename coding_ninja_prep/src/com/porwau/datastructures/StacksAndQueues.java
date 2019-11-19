package com.porwau.datastructures;

import java.util.Queue;
import java.util.Stack;
class Employee {
	public Employee(String fName, String lName, int id) {
		firstName = fName;
		lastName = lName;
		employeeID = id;
	}
	String firstName;
	String lastName;
	int employeeID;
	public String toString() {
		return firstName+ " "+ lastName + " " + employeeID;
		
	}
}
class StackWithArray {
	private int tos ;//tos = 0 means empty Array
	private Employee[] intArr;

	StackWithArray(int capacity) {
		intArr = new Employee[capacity];
	}
	Employee pop() {
		if (tos == 0 ) {
			System.out.println("Array is empty. Can't pop");
			return null;
		}else {
		Employee e  = intArr[--tos];
		intArr[tos] = null;
		System.out.println("Employee popped is " + e.toString() + " and top is " + tos);
		return e;
		}
	}
	void push(Employee e) {
		if(tos == intArr.length) {
			System.out.println("Array is full. Creating new Array with double capacity");
			//Lets create a new array with double capacity
			Employee[] newArray = new Employee[intArr.length*2];
			System.arraycopy(intArr, 0, newArray, 0, intArr.length);
			intArr=newArray;
			intArr[tos++] = e;
			System.out.println("Employee pushed is " + e + " and top is " + tos);
		}
		else {
			intArr[tos++] = e;
			System.out.println("Employee pushed is " + e + " and top is " + tos);
		}
	}
	Employee peek() {
		if(tos != 0) {
			return intArr[tos -1];
		}
		else return null;
	}
	
}

public class StacksAndQueues {
	public static void main(String[] args) {
		 //Stack intStack = new Stack();
		StackWithArray s = new StackWithArray(1);
		s.push(new Employee("Utkarsh", "Porwal", 1010871));
		System.out.println("Peeked and the result is " + (s.peek() == null ? "Empty Array" : s.peek()));
	//	s.push(2);
		//s.push(3);
		//s.push(4);
		//s.push(5);
		s.pop();
		System.out.println("Peeked and the result is " + (s.peek() == null ? "Empty Array" : s.peek()));
		s.pop();
	}
}
