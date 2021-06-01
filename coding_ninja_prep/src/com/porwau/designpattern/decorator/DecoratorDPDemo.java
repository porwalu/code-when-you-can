package com.porwau.designpattern.decorator;

public class DecoratorDPDemo {

	public static void main(String[] args) {

		Pizza customPizza = new Mozarella(new Paneer(new PlainPizza()));
		
		System.out.println("The pizza ordered is : " + customPizza.getDescription());
		System.out.println("The pizza cost is : " + customPizza.getCost());

	}

}
