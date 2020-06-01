package com.porwau.lcode.medium;

public class PowerFunction {

	private static double myPow(double x, int n) {
		double num = 1;
		boolean negative = false;
		if (n < 0) {
			negative = true;
			n = -n;
		}
		for (int i = 1; i <= n / 2; i++) {
			num = num * x;
		}
		num = n % 2 == 1 ? num * num * x : num * num;
		return negative == false ? num : 1 / num;
	}

	public static void main(String[] args) {
		double number = 2.0;
		int power = 2;
		System.out.println(number + " raised to the power of " + power + " is " + myPow(number, power));

	}

}
