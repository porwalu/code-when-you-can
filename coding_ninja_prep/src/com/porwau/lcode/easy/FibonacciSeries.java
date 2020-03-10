package com.porwau.lcode.easy;
/**This class calculates the nth term of Fibonacci series
 * Example of Fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
 * T(N)=T(N-1)+T(N-2)
 * @author Utkarsh Porwal
 *
 */
public class FibonacciSeries {

	private static void fibonacciRecursion(int n) {
		return;
	}

	/**
	 * @param n - integer n
	 * @return the nth Term of fibonacci series
	 */
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
