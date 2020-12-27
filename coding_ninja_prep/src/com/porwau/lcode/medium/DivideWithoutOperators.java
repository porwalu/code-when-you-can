package com.porwau.lcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Divide two integers without operators
 * 
 * @author Utkarsh Porwal
 *
 */
public class DivideWithoutOperators {
	private static int HALF_INT_MIN = -1073741824;// -2**30;

	public static void main(String[] args) {
		int dividend = 13;
		int divisor = 2;

		System.out.println("Quotient of division by divide is " + divide(dividend, divisor));
		System.out.println("Quotient of division fastdivide is " + fastdivide(dividend, divisor));
		System.out.println("Quotient of division fasterdivide is " + fasterdivide(dividend, divisor));
		System.out.println("Quotient of division fasterdividebit is " + fasterdividebit(dividend, divisor));

	}

	private static int fasterdividebit(int dividend, int divisor) {
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
			divisor = -divisor;// converting to negative as negative have more range
		}
		int powerCount = 1;
		int doubleCount = divisor;
		while (divisor + divisor >= dividend) {
			powerCount += powerCount;// will have the max power
			doubleCount += doubleCount;// will have the maximum value at the end
			if (divisor < HALF_INT_MIN) {
				break;
			}
			divisor += divisor;

		}

		int quotient = 0;
		while (doubleCount >= dividend) {
			quotient += powerCount;
			dividend -= doubleCount;
			doubleCount >>= 1;
			powerCount >>= 1;

		}

		return sign == -1 ? -quotient : quotient;
	}

	private static int fasterdivide(int dividend, int divisor) {
		if (dividend == 0 || divisor == 1) {
			return dividend;
		}

		if (dividend == Integer.MIN_VALUE && divisor == -1) {
			return Integer.MAX_VALUE;
		}
		List<Integer> lookup = new ArrayList<>();
		List<Integer> doubles = new ArrayList<>();

		int sign = dividend < 0 ^ divisor < 0 ? -1 : 1;
		if (dividend > 0) {
			dividend = -dividend;
		}
		if (divisor > 0) {
			divisor = -divisor;// converting to negative as negative have more range
		}

		int quotient = 0;
		int value = divisor;
		int doubleCount = 1;
		while (divisor >= dividend) {
			doubles.add(doubleCount);
			lookup.add(divisor);
			if (divisor < HALF_INT_MIN) {
				break;
			}
			divisor += divisor;// 26,52
			doubleCount += doubleCount;// 2,4
		}
		int i;
		for (i = lookup.size() - 1; i >= 0; i--) {
			if (lookup.get(i) >= dividend) {
				quotient += doubles.get(i);
				dividend -= lookup.get(i); // 60-52
			}
		}
		return sign == -1 ? -quotient : quotient;
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
			divisor = -divisor;// converting to negative as negative have more range
		}
		int quotient = 0;
		while (dividend <= divisor) {// 60,13
			int value = divisor;
			int doubleCount = 1;
			if (value >= Integer.MIN_VALUE / 2 && (value + value) > dividend) {
				value += value;// 26,52
				doubleCount += doubleCount;// 2,4
			}
			dividend -= value; // 60-52
			quotient += doubleCount;

		}
		return sign == -1 ? -quotient : quotient;
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
			divisor = -divisor;// converting to negative as negative have more range
		}
		int count = 0;
		while (dividend <= divisor) {
			dividend -= divisor;
			count++;
		}

		return sign == -1 ? -count : count;
	}
}
