package com.porwau.lcode.easy;

import java.util.Arrays;

public class CountEvenDigitNumbers {
	private static int countEven(int[] nums) {
		int arrSize = nums.length;
		if (arrSize < 1 || arrSize > 500) {
			System.out.println("Invalid array size criteria - 1 <= nums.length <= 500.\nPlease retry!!");
			return -1;
		}
		int countEvenNum = 0;
		for (int i = 0; i < arrSize; i++) {
			if (nums[i] < 1 || nums[i] > Math.pow(10, 5)) {
				System.out.println("Invalid int number value criteria - 1 <= nums[i] <= 10^5 \nPlease retry!!");

				return -1;
			}
			if (Math.floor(Math.log10(nums[i])+1) % 2 == 0) {//This gives better time result for fixed input
	        //if((Integer.toString(nums[i])).length() % 2 == 0) {//Alternate solution

				countEvenNum++;
			}
		}
		return countEvenNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1 };
		int countOfNum = countEven(nums);
		if (countOfNum != -1) {
			System.out.println("Count of Even number in " + Arrays.toString(nums) + " is " + countEven(nums));
		}
	}

}
//Time complexity O(n)
//Space Complexity O(1)