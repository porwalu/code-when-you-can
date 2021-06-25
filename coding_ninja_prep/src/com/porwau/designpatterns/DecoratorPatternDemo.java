package com.porwau.designpatterns;


interface Pizza{
	
	String getDetails();
	int getCost();
}

class PlainPizza implements Pizza {

	@Override
	public String getDetails() {
		return "This is plain pizza";		
	}

	@Override
	public int getCost() {
		return 100;
		
	}
	
}

abstract class Topping implements Pizza{
	Pizza basePizza;

	public Topping(Pizza basePizza) {
		this.basePizza = basePizza;
	}	
}

class Paneer extends Topping{

	public Paneer(Pizza basePizza) {
		super(basePizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDetails() {
		return basePizza.getDetails() + ", with Panner topping";
		
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return basePizza.getCost() + 40;
	}
	
}


class Mozarella extends Topping{

	public Mozarella(Pizza basePizza) {
		super(basePizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDetails() {
		return basePizza.getDetails() + ", with Mozarella topping";
		
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return basePizza.getCost() + 30;
	}
	
}

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza pizza = new Mozarella(new Paneer(new PlainPizza()));
		
		System.out.println(pizza.getDetails());
		System.out.println("Total cost is :" + pizza.getCost());


	}

}
