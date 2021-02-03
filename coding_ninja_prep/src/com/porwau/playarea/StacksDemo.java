package com.porwau.playarea;

class StacksWithList {
	private int tos = 0;

	Emp pop() {
		return null;
	}

	boolean push() {
		return true;
	}

	Emp peek() {
		return null;
	}

}

class StackWithArray {
	private int tos = -1;
	private Emp[] stack;

	public StackWithArray(int capacity) {
		stack = new Emp[capacity];
	}
	public int getTos() {
		return tos;
	}

	public void setTos(int tos) {
		this.tos = tos;
	}
	Emp pop() {
		if (isEmpty()) {
			System.out.println("Empty Stack. Can't pop anymore elements");
			return null;
		}
		System.out.println("Element popped from index " + tos);
		Emp emp = stack[tos];
		stack[tos] = null;
		tos--;
		return emp;
	}

	boolean push(Emp e) {
		if (isFull()) {
			System.out.println("Stack capacity of " + stack.length + " is full. Resizing to " + stack.length * 2);
			Emp[] newArray = new Emp[2 * stack.length];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			stack = newArray;
		}
		stack[++tos] = e;
		System.out.println("Added to Stack at index " + tos);

		return true;
	}

	Emp peek() {
		if (isEmpty()) {
			System.out.println("Empty Stack. Nothing to view");
			return null;
		}
		System.out.println("Viewing element at  index " + tos);
		return stack[tos];	}

	boolean isFull() {
		return tos == stack.length - 1;
	}

	boolean isEmpty() {
		return tos == -1;
	}
}

public class StacksDemo {
	public static void main(String[] args) {
		StackWithArray swa = new StackWithArray(2);
		System.out.println(swa.pop());
		System.out.println(swa.peek());

		swa.push(new Emp(4, "Rahul", "Goswami"));
		swa.push(new Emp(5, "Rahul", "Gandhi"));

		swa.push(new Emp(5, "Indira", "Gandhi"));
		System.out.println(swa.pop());

//		System.out.println(swa.pop());
//		System.out.println(swa.pop());
		System.out.println(swa.peek());
		System.out.println(swa.peek());

	}
}
