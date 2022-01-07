package com.porwau.designpatterns;

class Animal {
	private String name;
	private Flys flyingType;

	public Animal() {

	}

	public Animal(String name, Flys type) {
		super();
		this.name = name;
		this.flyingType = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Flys getFlyingType() {
//		return flyingType;
//	}

	public void setFlyingType(Flys flyingType) {
		this.flyingType = flyingType;
	}

	void eat() {
		System.out.println("can eat");
	}
	String tryToFly() {
		return flyingType.fly();
	}

}

interface Flys {// Strategy

	String fly();
}

class ItFlys implements Flys {

	public String fly() {
		return " can fly";
	}

}

class CantFly implements Flys {

	public String fly() {
		return " cannot fly";
	}

}

class Dog extends Animal {

	public Dog(String name) {
		super(name, new CantFly());
	}
}

class Bird extends Animal {

	public Bird(String name) {
		super(name,new ItFlys());
	}

}

public class StrategyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog("Scooby");
		
	///	System.out.println(dog.getName() + " " + dog.getFlyingType().fly());
		System.out.println(dog.getName() + " " + dog.tryToFly());
		Bird bird = new Bird("Tweety");
		System.out.println(bird.getName() + " " + bird.tryToFly());
		
		dog.setFlyingType(new ItFlys());
		
		System.out.println(dog.getName() + " " + dog.tryToFly());

	}

}
