package com.porwau.designpattern.factory;

import java.util.Random;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		int randomAgain = new Random().nextInt(3);

		//int random2 = rand.nextInt(3);
		String shapeArr[] = { "Square", "Circle", "Diamond" };
		int random = (int) Math.floor(Math.random() * 3);
		System.out.println("rand number = " + random);
		System.out.println("rand number2 = " + randomAgain);

		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape = shapeFactory.getInstance(shapeArr[random]);
		Shape shape2 = shapeFactory.getInstance(shapeArr[randomAgain]);

		if (shape != null) {
			shape.area();
		}
		if (shape2 != null) {
			shape2.area();
		}


	}
}
