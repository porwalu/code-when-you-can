package com.porwau.lcode.easy;
/**This class calculates the nth term of Fibonacci series
 * Example of Fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
 * T(N)=T(N-1)+T(N-2)
 * @author Utkarsh Porwal
 *
 */
public class FibonacciSeries {

	private static int fibonacciRecursion(int n) {
		int i;
		if (n > 30) {
			System.out.println("Take it easy. Enter n <= 30");
			return -1;
		}
		if (n == 1) {
			return 0;
		}
		if (n == 2) {
			return 1;
		}
		return(fibonacciRecursion(n-1) + fibonacciRecursion(n-2));
	}

	/**
	 * @param n - integer n
	 * @return the nth Term of fibonacci series
	 */
	private static int fibonacciIterative(int n) {
		if (n > 30) {
			System.out.println("Take it easy. Enter n <= 30");
			return -1;
		}
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
		int n = 5;		
		System.out.println("Recursive Fibonacci value of " + n + "th term is - " +fibonacciRecursion(n));
//		System.out.println("Iterative Fibonacci value of " + n + "th term is - " + fibonacciIterative(n));
	}

}
//Time complexity O(2^n) - this is as we have to make redundant calculations in recursive calls.
//For recursive we will have space complexity as O(n)