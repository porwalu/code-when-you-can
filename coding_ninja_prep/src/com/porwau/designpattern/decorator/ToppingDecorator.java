package com.porwau.designpattern.decorator;

public abstract class ToppingDecorator implements Pizza {
	protected Pizza basePizza;


	@Override
	public String getDescription() {
		return this.basePizza.getDescription();
	}
	
	@Override
	public double getCost() {
		return this.basePizza.getCost();
	}

}
