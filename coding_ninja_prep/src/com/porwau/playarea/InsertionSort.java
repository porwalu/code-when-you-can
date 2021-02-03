package com.porwau.playarea;

import java.util.Arrays;

public class InsertionSort {

	private static int[] insertionSort(int[] nums) {
//		for (int i = 0; i < nums.length; i++) {
		int i = 0;//pointer of sorted array
			for (int j =  1; j < nums.length; j=j+1) {
				if (nums[j] < nums[i]) {
					// find from 0 - i - where to put //this will take O(n) per j. so O(n^2)
					for (int k = 0; k <= i; k++) {
						if (nums[j] < nums[k]) {
							// shift everything one right and make space for nums[j]
							// nums[k] goes to k+1, nums[i] goes to nums[k]
							int tmp = nums[k];
							nums[k] = nums[j];
							nums[j] = tmp;
						}
					}
				}
				i++;
			}
		//}
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 10, 2, 5, 19, 21, 3 };
		int[] nums2 = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println("Array using Insertion Sort is : " + Arrays.toString(insertionSort(nums)));
	}

}
