package com.porwau.concepts;

class A{
	protected void test() {
		System.out.println("In Test  A");
		changeThis();
	}
	 void changeThis(){
		System.out.println("Changethis of A");
	}
}
 class B extends A{
//		@Override
		protected
		void changeThis(){
		//	test();
			System.out.println("Changethis of InheritanceCheck");

		}
}
public class InheritanceCheck {

	public static void main(String[] args) {
		A a = new B();
	 
		a.changeThis();//superclass methos will also call overriden method in subclass

	}

}


