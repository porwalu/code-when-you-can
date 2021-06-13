package com.porwau.lambda;

@FunctionalInterface
public interface Greeting {

	public void greet();
	//public void greet1();

	public default int sum(int a, int b) {
		return a+b;
	}
}
