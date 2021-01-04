package com.porwau.lcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 136. Single Number
 * @author Utkarsh Porwal
 *
 */
public class SingleNumber {

	public static void main(String[] args) {
		System.out.println("Single number is - " + singleNum(new int[] { 1, 1, 2, 3, 2 }));
	}

	private static int singleNum(int[] nums) {
		Map<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (m.containsKey(nums[i])) {
				m.remove(nums[i]);
			} else {
				m.put(nums[i], 1);
			}
		}
		return (int) m.keySet().toArray()[0];
	}
}
