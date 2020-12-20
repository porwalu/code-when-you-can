package com.porwau.lcode.easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	private static int[] twoSum(int[] arrNum, int target) {
		for (int i = 0; i < arrNum.length; i++) {
			for (int j = i + 1; j < arrNum.length; j++) {
				if (arrNum[j] == target - arrNum[i]) {
					return new int[] { i, j };
				}
			}
		}

		return new int[] { 0 };
	}

	private static int[] twoSumOptimized(int[] arrNum, int target) {
		HashMap hm = new HashMap();
		for (int i = 0; i < arrNum.length; i++) {
			hm.put(target - arrNum[i], i);
		}

		for (int i = 0; i < arrNum.length; i++) {
			if (hm.containsKey(arrNum[i]) && (int)hm.get(arrNum[i]) != i) {
				return new int[] { i, (int) hm.get(arrNum[i]) };
				// hm.get()
			}
		}
	    throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrNum = { 2,7,11,15 };
		int target = 9;
	//	System.out.println("Two sum which gives " + target + " is " + Arrays.toString(twoSum(arrNum, target)));
		System.out.println("Two sum which gives " + target + " is " + Arrays.toString(twoSumOptimized(arrNum, target)));

	}

}
