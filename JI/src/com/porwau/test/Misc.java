package com.porwau.test;

import java.util.Optional;

@FunctionalInterface
interface test1 {
	void hello();

	default void bye() {
		System.out.println("GoodBye");
	}
}

public class Misc implements test1 {

	public static void main(String[] args) {

		Misc misc = new Misc();
		misc.bye();
		misc.hello();
	}

	@Override
	public void hello() {
		System.out.println("Hi there");

	}
}