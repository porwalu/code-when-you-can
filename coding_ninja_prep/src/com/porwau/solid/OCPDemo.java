package com.porwau.solid;

import java.util.Scanner;

interface Shape{
	void display();
}

class Shape1 {
	void display(Shape shape) {

shape.display();
	}
}
class Circle implements Shape{

	@Override
	public void display() {
		System.out.println("I am Circle");
	}
	
}

class Square implements Shape{

	@Override
	public void display() {
		System.out.println("I am Square");
	}
	
}
public class OCPDemo {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter shape:");
		Shape1 sh1 = new Shape1();
				sh1.display(new Circle());
				sh1.display(new Square());

	//	String input = scan.nextLine();
		
	}

}
