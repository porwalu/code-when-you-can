package com.porwau.lcode.medium;

/**
 * Divide two integers without operators
 * 
 * @author Utkarsh Porwal
 *
 */
public class DivideWithoutOperators {

	public static void main(String[] args) {
		int dividend = 10;
		int divisor = -1109186033;

		System.out.println("Quotient of division is " + divide(dividend, divisor));
	}

	public static int divide(int dividend, int divisor) {
		if (dividend == 0 || divisor == 1) {
			return dividend;
		}

		if (dividend == Integer.MIN_VALUE && divisor == -1) {
			return Integer.MAX_VALUE;
		}
		int sign = dividend < 0 ^ divisor < 0 ? -1 : 1;
		if (dividend > 0) {
			dividend = -dividend;
		}
		if (divisor > 0) {
			divisor = -divisor;
		}
		int count = 0;
		while (dividend <= divisor) {
			dividend -= divisor;
			count++;
		}

		return sign == -1 ? -count : count;
	}
}
