package com.porwau.lcode.medium;

/**
 * Uses recursion. find half number recursively. complexity in O(logn)
 * 
 * @author Utkarsh Porwal
 *
 */
public class PowerFunction {

	/**
	 * @param x - number
	 * @param n - power
	 * @return - number ^ power
	 */
	private static double fastPow(double x, long n) {
		if (n == 0) {
			return 1.0;
		}
		double half = fastPow(x, n / 2);
		if (n % 2 == 0) {
			return half * half;
		} else {
			return half * half * x;
		}
	}

	private static double myPow(double x, int n) {
		long N = n;
		if (N < 0) {
			x = 1 / x;
			N = -N;
		}

		return fastPow(x, N);
	}

	public static void main(String[] args) {
		double number = 2.0;
		int power = 2;
		System.out.println(number + " raised to the power of " + power + " is " + myPow(number, power));

	}

}
