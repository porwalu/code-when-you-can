package com.porwau.playarea;

public class Misc1 {

	public int a;
	static int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Misc1 m1 = new Misc1();
		Misc1 m2 = new Misc1();
		m1.a = 0;
		Misc1.b = 0;
		m1.calculate(1, 2);
		m2.a = 0;
		m2.calculate(2, 3);
		System.out.println(m1.a + " " + Misc1.b);

	}

	public void calculate(int a, int b) {
		this.a += a;
		Misc1.b += b;
	}

}
