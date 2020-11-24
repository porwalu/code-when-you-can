package com.porwau.algorithms;

import java.util.HashMap;

/**This class calculates the nth term of Fibonacci series
 * Example of Fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
 * T(N)=T(N-1)+T(N-2)
 * @author Utkarsh Porwal
 *
 */
public class FibonacciWithMemoization {

	private static int fibonacciRecursion(int n, HashMap<Integer, Integer> hm) {
		int i;
		if (n > 30) {
			System.out.println("Take it easy. Enter n <= 30");
			return -1;
		}
		if (n < 2) {
			return n;
		}
		if(hm.containsKey(n)) {
			System.out.println("Key is present - " + n);
			System.out.println("Value is present - " + hm.get(n));
			return hm.get(n);
		}
		else {
			System.out.println("Key is not present!! Memoize - " + n);
			hm.put(n, fibonacciRecursion(n-1,hm) + fibonacciRecursion(n-2,hm));
			return hm.get(n);
			}
	}

	public static void main(String[] args) {
		int n = 23;		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		System.out.println("Recursive Fibonacci value of " + n + "th term is - " +fibonacciRecursion(n,hm));
	}

}
//Time complexity O(n) and Space complexity O(1)
//For recursive we will have space complexity as O(n)