package com.porwau.lcode.locked;

import java.util.Arrays;

//167. Two Sum II - Input array is sorted
// this is add addition to the traditional two sum.
//Addition is that the array is sorted.
// space complexity reduced to O(1)
//Easy
//O(n) 
//Space complexity  O(1)
public class TwoSumAgain {

	public static void main(String[] args) {
		int[] nums = new int[] { 2, 5, 11, 15 };
		int target = 10;
		System.out.println(Arrays.toString(twoSumAgain(nums, target)));
	}

	private static int[] twoSumAgain(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left < right) {
			int sum = nums[left] + nums[right];
			if (sum == target) {
				return new int[] { left + 1, right + 1 };
			} else if(sum > target) {
				right = right - 1;				
			} else {
				left = left + 1;
			}
		}
		return new int[] { -1, -1 };

	}

}
