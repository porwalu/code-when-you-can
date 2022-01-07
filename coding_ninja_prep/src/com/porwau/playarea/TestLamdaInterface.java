package com.porwau.playarea;

import com.porwau.lambda.HelloWorldGreeting;

public class TestLamdaInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface t = new ImplementTest();
		//t.helloWorld();
		helloFromMain(t);
		TestInterface l = ()->System.out.println("Hello lambda");
		l.helloWorld();
		LambdaInterface l1  = ()->System.out.println("Hello lambda1");
		l1.bar();
		Thread t1 = new Thread(()->System.out.println("Hello lambdathread"));
		t1.start();
	}

	static void helloFromMain(TestInterface t ) {
		System.out.println("Hello from main");
		t.helloWorld();
		
	}
}
@FunctionalInterface
interface LambdaInterface{
	void bar();
	default void foo() {
		System.out.println("Hi there");
	}
}
