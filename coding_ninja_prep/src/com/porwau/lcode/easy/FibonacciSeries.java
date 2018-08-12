package com.porwau.lcode.easy;

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
public class FibonacciSeries {

	private static void fibonacciRecursion(int n) {
		return;
	}

	private static int fibonacciIterative(int n) {
		if (n < 3) {
			if (n == 1) {
				return 0;
			} else
				return 1;
		}
		int a = 0;
		int b = 1;
		int i = 2;
		while (i < n) {
			a = a + b;
			b = a + b;
			i += 2;
		}

		return n % 2 == 0 ? b : a;
	}

	public static void main(String[] args) {
		int n = 8;
		fibonacciRecursion(n);
		System.out.println("Fibonacci value of " + n + "th term is - " + fibonacciIterative(n));
	}

}
