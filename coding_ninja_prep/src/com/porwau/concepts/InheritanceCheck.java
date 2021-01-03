package com.porwau.concepts;

class A{
	void test() {
		System.out.println("In Test  A");
		changeThis();
	}
	void changeThis(){
		System.out.println("Changethis of A");
	}
}
public class InheritanceCheck extends A{

	public static void main(String[] args) {
		A a = new InheritanceCheck();
		a.test();

	}
	@Override
	void changeThis(){
		System.out.println("Changethis of InheritanceCheck");

	}

}
