package com.porwau.test;

interface Print {

	void print();
	
}
class DemoPrint1 {
	
	public void print() {
		System.out.println("common across all");
	}
}
class DemoPrint extends DemoPrint1 implements Print{
	
	@Override
	public void print() {
		super.print();
		System.out.println("DemoPrint specific");
	}


}

public class Printer {

	public static void main(String[] args) {
		//DemoPrint1 instance = DemoPrint.getInstance();
		
		//instance.print();
		DemoPrint demo = new DemoPrint();
		demo.print();
		//demo.common();
		

	}

}
