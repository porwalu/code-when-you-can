package com.porwau.designpattern.decorator;

public class Mozarella extends ToppingDecorator{

	public Mozarella(Pizza basePizza) {
		//super(basePizza);
		this.basePizza = basePizza;
}
	
	@Override
	public String getDescription() {	
		return basePizza.getDescription() + ", Mozarella Topping";
	}

	@Override
	public double getCost() {	
		return basePizza.getCost() + 50;
	}
}
