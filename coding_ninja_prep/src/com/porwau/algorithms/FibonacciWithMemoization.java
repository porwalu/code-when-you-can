package com.porwau.algorithms;

import java.util.HashMap;

/**This class calculates the nth term of Fibonacci series
 * Example of Fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
 * T(N)=T(N-1)+T(N-2)
 * This is an excellen example of recursion and memoization or caching
 * This is performance centric and doesnt make repeated calls.
 * @author Utkarsh Porwal
 *
 */
/**
 * @author porwau
 *
 */
public class FibonacciWithMemoization {

	/**
	 * @param Takes in the n of terms in fibonacci series
	 * @param hm - hashmap which acts like a cache
	 * @return - the number at nth place in fibonacci series.
	 */
	private static Long fibonacciRecursion(int n, HashMap<Integer, Long> hm) {
		int i;
		if (n > 100) {
			System.out.println("Take it easy. Enter n <= 30");
			return -1L;
		}
		if (n < 2) {
			return (long) n;
		}
		if(hm.containsKey(n)) {
			System.out.println("Key is present - " + n);
			return hm.get(n);
		}
		else {
			System.out.println("Key is not present!! Memoize - " + n);
			hm.put(n, fibonacciRecursion(n-1,hm) + fibonacciRecursion(n-2,hm));
			return hm.get(n);
			}
	}

	public static void main(String[] args) {
		int n = 100;		
		HashMap<Integer, Long> hm = new HashMap<Integer, Long>();
		System.out.println("Recursive Fibonacci value of " + n + "th term is - " +fibonacciRecursion(n,hm));
	}

}
//Time complexity O(n) and Space complexity O(1)
//For recursive we will have space complexity as O(n)