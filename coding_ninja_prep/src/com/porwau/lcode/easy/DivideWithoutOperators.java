package com.porwau.lcode.easy;

public class DivideWithoutOperators {

	public static void main(String[] args) {
		int dividend = -2147483648;
		int divisor = -1109186033;

		System.out.println("Quotient of division is " + divide(dividend, divisor));
	}

	public static int divide(int dividend, int divisor) {
		if (divisor == dividend) {
			return 1;
		}
		if (divisor == Integer.MIN_VALUE) {
			return 0;
		}
		if (dividend == 0) {
			return 0;
		}
		if (divisor == 1) {
			return dividend;
		}
		boolean divisorNegative = false;
		boolean dividendNegative = false;
		boolean dividendMin = false;

		if (dividend == Integer.MIN_VALUE) {
			dividendMin = true;
		}
		if (divisor == -1) {
			return dividendMin ? -(dividend + 1) : -dividend;
		}
		int count = 0;
		if (divisor < 0) {
			divisorNegative = true;
			divisor = -divisor;
		}
		if (dividend < 0) {
			dividendNegative = true;
			dividend = dividendMin ? -(dividend + divisor) : -dividend;
		}

		if (divisor > dividend && !dividendMin) {// both negative or both positve.
			return 0;
		}

		while (dividend >= divisor) {
			dividend -= divisor;
			count++;
		}
		if (dividendMin) {
			count = count + 1;
		}

		return (dividendNegative || divisorNegative) && !(dividendNegative && divisorNegative) ? -count : count;
	}
}
