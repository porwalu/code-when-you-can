package com.porwau.lcode.medium;

/**
 * Divide two integers without operators
 * 
 * @author Utkarsh Porwal
 *
 */
public class DivideWithoutOperators {

	public static void main(String[] args) {
		int dividend = 1109186033;
		int divisor = 4;

		System.out.println("Quotient of division is " + divide(dividend, divisor));
		System.out.println("Quotient of division is " + fastdivide(dividend, divisor));

	}

	private static int fastdivide(int dividend, int divisor) {
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
			divisor = -divisor;//converting to negative as negative have more range	
		}
		int quotient =0;
		while(dividend <= divisor) {//60,13
			int value = divisor;
			int doubleCount = 1;
			if(value + value > dividend) {
				value += value;//26,52
				doubleCount+=doubleCount;//2,4
			}
			dividend -=value;		//60-52
			quotient +=doubleCount;
			
		}
		return sign == -1 ? -quotient:quotient;
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
			divisor = -divisor;//converting to negative as negative have more range	
		}
		int count = 0;
		while (dividend <= divisor) {
			dividend -= divisor;
			count++;
		}

		return sign == -1 ? -count : count;
	}
}
