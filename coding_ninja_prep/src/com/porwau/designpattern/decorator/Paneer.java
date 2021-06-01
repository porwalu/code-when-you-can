package com.porwau.designpattern.decorator;

public class Paneer extends ToppingDecorator{

	public Paneer(Pizza basePizza) {
		this.basePizza=basePizza;
	}

	
	@Override
	public String getDescription() {	
		return basePizza.getDescription() + ", Panner Topping";
	}

	@Override
	public double getCost() {	
		return basePizza.getCost() + 70;
	}
}
