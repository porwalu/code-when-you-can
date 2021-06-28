package com.porwau.problemsolving;

import java.util.Arrays;

public class Array {

	
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,0,1,0,1,2,30,0};
		int[] nums1 = {1,-2,-3,0,-1,0,1,2,30,0};

		System.out.println(Arrays.toString(update(nums1)));
	}

	private static int[] update(int[] nums) {
		int left = 0;
		int tmp = 0;
		int right = nums.length -1;
		right = updateRight2(nums,right);
		while(left < right) {
			//if(nums[left] == 0) {
			if(nums[left] < 0) {
				tmp = nums[left];
				nums[left] = nums[right];
				nums[right] = tmp;
				right--;
			}
			left++;
			//right = updateRight(nums,right);
			right = updateRight2(nums,right);
		}
		return nums;
	}
	
	private static int updateRight(int[] nums, int right) {
		while(nums[right] == 0) {
			right = right -1;
		}
		return right;
	}
	
	private static int updateRight2(int[] nums, int right) {
		while(nums[right] < 0) {
			right = right -1;
		}
		return right;
	}

}
