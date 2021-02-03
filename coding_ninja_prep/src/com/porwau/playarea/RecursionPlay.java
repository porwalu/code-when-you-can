package com.porwau.playarea;

import java.util.HashMap;
import java.util.Map;

public class RecursionPlay {

	public static void main(String[] args) {
		Map<Integer,Integer> mapFac = new HashMap<>();
		Map<Integer,Integer> mapFib = new HashMap<>();
		System.out.println(factorial(5,mapFac));
		System.out.println(fibonacci(45,mapFib));//nth term of fibonacci f(n) = f(n-1) + f(n-2)... f(0) = 0, f(1) = 1 

		
	}
		static int factorial(int n, Map<Integer, Integer> mapFac) {
			if(n ==1) {return 1;}
			
				if(mapFac.containsKey(n)) {
					return mapFac.get(n);
				}else {
					mapFac.put(n,n*factorial(n-1,mapFac));
					return mapFac.get(n);
				}			
		}
		
		static int fibonacci(int n, Map<Integer, Integer> mapFib) {
			if(n <2) { return n;}
			if(mapFib.containsKey(n)) {
				return mapFib.get(n);
			}else {
				mapFib.put(n,fibonacci(n-1,mapFib) + fibonacci(n-2,mapFib));
				return mapFib.get(n);
			}
		}
}
