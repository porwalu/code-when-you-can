package com.porwau.test;

class Common {

	void print() {
		System.out.println("common");
	}
}

interface PrintD {

	void print();
}

class HP extends Common implements PrintD {

	@Override
	public void print() {
		super.print();
		System.out.println("From HP");
	}

}

class Canon extends Common implements PrintD {

	@Override
	public void print() {
		System.out.println("From Canon");

	}

}

public class PrintDemo {

	public static void main(String[] args) {
		PrintD hp = new HP();
		hp.print();
	}

}
