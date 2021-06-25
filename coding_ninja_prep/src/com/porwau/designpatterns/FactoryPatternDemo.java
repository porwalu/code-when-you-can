package com.porwau.designpatterns;

interface Shape {
	void details();
}

class Square implements Shape {

	@Override
	public void details() {
		System.out.println("I am Square");
	}

}

class Circle implements Shape {

	@Override
	public void details() {
		System.out.println("I am Circle");
	}

}

class ShapeFactory{
	
	public Shape getShapeInstance(String shape) {
		if(shape.equalsIgnoreCase("Square")) {
			return new Square();
		}else if(shape.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		System.out.println("Shape not found");
		return null;
	}
}

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape shape1 = factory.getShapeInstance("squre");
		if(shape1 != null) shape1.details();
		factory.getShapeInstance("sphere");

	}

}
