package com.porwau.lcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 136. Single Number
 * 
 * @author Utkarsh Porwal
 *
 */
public class SingleNumber {

	public static void main(String[] args) {
		System.out.println("Single number is - " + singleNum(new Integer[] { 1, 1, 2, 3, 2 }));
		System.out.println("Single number is - " + singleNumXOR(new Integer[] { 1, 1, 2, 3, 2 }));

	}

	private static int singleNumXOR(Integer[] nums) {
		int a = 0;
		for (int i = 0; i < nums.length; i++) {
			a ^= nums[i];
		}
		return a;
	}

	private static int singleNum(Integer[] nums) {
		List<Integer> unique = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (unique.contains(nums[i])) {
				unique.remove(nums[i]);
			} else {
				unique.add(nums[i]);
			}
		}
		return unique.get(0);
	}
}
