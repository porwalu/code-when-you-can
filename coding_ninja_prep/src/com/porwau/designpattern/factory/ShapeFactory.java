package com.porwau.designpattern.factory;

public class ShapeFactory {

	public Shape getInstance(String shapeDesc) {

		if (shapeDesc.equals("Circle")) {

			return new Circle();

		} else if (shapeDesc.equalsIgnoreCase("Square")) {
			return new Square();
		} else {

			System.out.println("You are in wrong shape factory.");
			return null;
		}

	}

}
