package com.porwau.lambda;

public class HelloWorldGreeting implements Greeting {

	@Override
	public void greet() {
		System.out.println("Hello World!");
	}

}
