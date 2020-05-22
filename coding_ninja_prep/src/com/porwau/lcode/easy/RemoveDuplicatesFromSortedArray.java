package com.porwau.lcode.easy;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	private static int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int counter = 0;
		int index = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[index] != nums[i]) {
				index += 1;
				nums[index] = nums[i];
			}
		}
		return index + 1;
	}

	public static void main(String[] args) {
		int[] numArray = { 1, 1, 2, 3, 3, 4, 4, 4, 4, 4 };
		System.out.println(removeDuplicates(numArray) + Arrays.toString(numArray));
	}

}
