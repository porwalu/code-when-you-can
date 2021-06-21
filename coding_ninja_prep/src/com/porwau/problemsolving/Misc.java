package com.porwau.problemsolving;

import java.util.HashMap;

public class Misc {

	public static void main(String[] args) {
		int[] arr = { 3, 4,0, 2,3,2 };
		System.out.println(subarraySum(arr, 7));
	}

	public static int subarraySum(int[] nums, int k) {
		int count = 0, sum = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (map.containsKey(sum - k))
				count += map.get(sum - k);
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		return count;
	}
}