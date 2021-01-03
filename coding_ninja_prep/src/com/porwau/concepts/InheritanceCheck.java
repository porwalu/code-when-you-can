package com.porwau.concepts;

class A{
	protected void test() {
		System.out.println("In Test  A");
		changeThis();
	}
	protected void changeThis(){
		System.out.println("Changethis of A");
	}
}
public class InheritanceCheck extends A{

	public static void main(String[] args) {
		A a = new InheritanceCheck();
		a.test();

	}
	@Override
	protected
	void changeThis(){
		System.out.println("Changethis of InheritanceCheck");

	}

}
