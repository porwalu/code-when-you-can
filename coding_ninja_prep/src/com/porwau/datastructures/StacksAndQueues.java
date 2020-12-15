package com.porwau.datastructures;

import java.util.Queue;
import java.util.Stack;

/**
 * Employee details 
 * @author Utkarsh Porwal
 *
 */
class Employee {
	public Employee(String fName, String lName, int id) {
		firstName = fName;
		lastName = lName;
		employeeID = id;
	}

	String firstName;
	String lastName;
	int employeeID;
	@Override
	public String toString() {
		return firstName + " " + lastName + " " + employeeID;

	}
}

/**
 * Implementing Stack with array
 * @author Utkarsh Porwal
 *
 */
class StackWithArray {
	private int tos;// tos = 0 means empty Array
	private Employee[] intArr;

	StackWithArray(int capacity) {
		intArr = new Employee[capacity];
	}

	/**
	 * @return Employee object at the top and 
	 * <br> also decrements the top and changes the top element to null
	 */
	Employee pop() {
		if (tos == 0) {
			System.out.println("Array is empty. Can't pop");
			return null;
		} else {
			Employee e = intArr[--tos];
			intArr[tos] = null;
			System.out.println("Employee popped is " + e.toString() + " and top is " + tos);
			return e;
		}
	}

	/**
	 * @param push an employee to the stack
	 */
	void push(Employee e) {
		if (tos == intArr.length) {
			System.out.println("Array is full. Creating new Array with double capacity");
			// Lets create a new array with double capacity
			Employee[] newArray = new Employee[intArr.length * 2];
			System.arraycopy(intArr, 0, newArray, 0, intArr.length);
			intArr = newArray;
			intArr[tos++] = e;
			System.out.println("Employee pushed is " + e + " and top is " + tos);
		} else {
			intArr[tos++] = e;
			System.out.println("Employee pushed is " + e + " and top is " + tos);
		}
	}

	/**
	 * @return the top most employee details I am peeking into or null if stack is empty
	 */
	Employee peek() {
		if (tos != 0) {
			return intArr[tos - 1];
		} else
			return null;
	}

}

/**
 * @author porwau
 *
 */
public class StacksAndQueues {
	public static void main(String[] args) {
		// Stack intStack = new Stack();
		StackWithArray s = new StackWithArray(1);
		s.push(new Employee("Utkarsh", "Porwal", 1010871));
		System.out.println("Peeked and the result is " + (s.peek() == null ? "Empty Array" : s.peek()));
		s.push(new Employee("Sanjay", "Oruganti", 1320645));
		System.out.println("Peeked and the result is " + (s.peek() == null ? "Empty Array" : s.peek()));
		s.pop();
		System.out.println("Peeked and the result is " + (s.peek() == null ? "Empty Array" : s.peek()));
		s.pop();
		System.out.println("Peeked and the result is " + (s.peek() == null ? "Empty Array" : s.peek()));

	}
}
