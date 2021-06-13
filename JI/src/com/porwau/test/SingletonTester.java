package com.porwau.test;



class DB{
	
	private static DB instance = new DB();
	private static DB instance2;
	
	private DB() {
		
	}
	
	public static DB getDBInstance() {
		return instance;
	}
	
	public void test() {
		instance = new DB();
	}
	
	public  static  DB getInstanceLazy() {
		if (instance2 == null) {
			synchronized(DB.class) {
				if(instance2 == null) {
					instance2 = new DB();	
				}
			}
		}
		return instance2;
	}
	
}


public class SingletonTester {

	public void greet() {
		System.out.println("Hello WOrld!!");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonTester st = new SingletonTester();
		
		st.greet();

	}

}
