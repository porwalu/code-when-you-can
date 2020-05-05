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

	public static void main(String[] args) {
		int dividend = 1100540749;
		int divisor = -1090366779;

		System.out.println("Quotient of division is " + divide(dividend, divisor));
		System.out.println("Quotient of division is " + fastdivide(dividend, divisor));
		System.out.println("Quotient of division is " + fasterdivide(dividend, divisor));

	}

	private static int fasterdivide(int dividend, int divisor) {
		if (dividend == 0 || divisor == 1) {
			return dividend;
		}

		if (dividend == Integer.MIN_VALUE && divisor == -1) {
			return Integer.MAX_VALUE;
		}
		Map<Integer, Integer> doubles = new HashMap<>();
		List<Integer> lookup = new ArrayList<>();

		int sign = dividend < 0 ^ divisor < 0 ? -1 : 1;
		if (dividend > 0) {
			dividend = -dividend;
		}
		if (divisor > 0) {
			divisor = -divisor;// converting to negative as negative have more range
		}
		int quotient = 0;
		// while(dividend <= divisor) {//60,13

		int value = divisor;
		int doubleCount = 1;
		int counter = 0;
		if (value >= Integer.MIN_VALUE / 2 && (value + value) > dividend) {
			value += value;// 26,52
			doubleCount += doubleCount;// 2,4
			// }

			dividend -= value; // 60-52
			quotient += doubleCount;
			doubles.put(counter++, quotient);
			lookup.add(quotient);
		}
		int i;
		while (dividend <= divisor) {
			for (i = 0; lookup.get(i) < dividend; i++) {

			}
		}
		// }
		// return sign == -1 ? -quotient:quotient;
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
