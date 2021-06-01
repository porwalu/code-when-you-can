package com.porwau.designpattern.decorator;

public class PlainPizza implements Pizza {

	
	public PlainPizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		return "Plain Cheese Pizza";
	}

	@Override
	public double getCost() {
		return 100.00;
	}

}
