package com.porwau.test;

interface I {
	void print();

	default void printD() {
		System.out.println("default print I");
	}
	
	default void printD2() {
		System.out.println("default print2 I");
	}
}

interface J {
	void print();
	default void printD() {
		System.out.println("default print J");
	}
}

//abstract class Abs{
//    public void print(){
//        System.out.println("Abstract");
//    }
//    
//
//}

class Check implements I, J {

	@Override
	public void print() {
		System.out.println("check print");

	}

	@Override
	public void printD() {
		// TODO Auto-generated method stub
		I.super.printD();
	}

}

public class Test {

	public static void main(String[] args) {

		I t = new Check();
		t.print();// calls Abstract's print method and How to call interface's defaut method?
		t.printD();
		t.printD2();

	}
}
