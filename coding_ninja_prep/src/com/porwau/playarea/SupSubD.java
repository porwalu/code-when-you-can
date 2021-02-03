package com.porwau.playarea;

class SupClass{
	
	
	static {
		System.out.println("Static initialization inside Super.");
	}
	{System.out.println("Inside instance initializer sup");}


	SupClass(){
		System.out.println("Inside sup 0 arg constructor");

	}
	
	SupClass(int a){
		System.out.println("Inside sup 1 arg constructor");

	}
	static void insup(){
	System.out.println("Inside superclass ");
	}
}

class SubClass extends SupClass{
	
	static {
		System.out.println("Static initialization inside SUb.");
	}
	
	{System.out.println("Inside instance initializer sub");}
	static final int I_AM_CONSTANT = 1;

	SubClass(){

		System.out.println("Inside sub 0 arg constructor");
	}
	SubClass(int a){
//		super(1);

		System.out.println("Inside sub 1 arg constructor");
	}
	static void insub() {
		System.out.println("Inside subclass static insub");
	}
}


public class SupSubD {

	
	static {
		System.out.println("Static initialization inside Main.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main");
		SupClass.insup();
		System.out.println(SubClass.I_AM_CONSTANT);
		//SubClass sc = new SubClass(1);
	}

}
