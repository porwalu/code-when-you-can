package com.porwau.java8;

interface Foo{
	
	default void show() {
		System.out.println("Java8 Default interfaces: foo show()");
	}
	public void display();
	
	static void magic() {
		System.out.println("lets do magic");
	}
	
}

interface Bar{
	public void display();
//	 default void show() {
//		System.out.println("Java8 Default interfaces: bar show()");
//	}
	
	public void barshow();
}
public class InterfaceChangesDemo implements Bar,Foo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceChangesDemo icd = new InterfaceChangesDemo();
		icd.display();
		icd.show();
		Foo.magic();
		icd.barshow();

	}

	@Override
	public void display() {
		System.out.println("display() of InterfaceChangesDemo");
		show();
		
	}

	@Override
	public void barshow() {
		System.out.println("barshow of InterfaceChangesDemo");
		
	}
//
//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//	Bar.super.show();
//	}

}
