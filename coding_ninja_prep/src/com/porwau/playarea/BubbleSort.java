package com.porwau.playarea;

import java.util.Arrays;

public class BubbleSort {

	// sort ascending
	// after first pass - at the end we will have largest number.
	// if nothing is swapped , it is already sorted.

	private static int[] bubbleSort(int[] nums) {
		int counter = nums.length;
		boolean isSwappedOnce = false;
		while (counter >= 1) {
			int k = 0;
			for (int i = 0; i < counter -1 ; i++) {
				if (nums[i] > nums[i+1]) {//swap elements
					 k = nums[i];
					 nums[i] = nums[i+1];
					 nums[i+1] = k;
					 isSwappedOnce = true;					 
				}
			}
			System.out.println("At the end of pass "+ (nums.length - counter +1) + ". Array is " + Arrays.toString(nums));
			if(!isSwappedOnce) {
				System.out.println("No Need to swap further - array is sorted from here on");
				return nums;
			
			}
			counter--;
			isSwappedOnce = false;
		}
		return nums;
	}

	public static void main(String[] args) {

		//int[] nums = { 1, 10, 2, 5, 19, 21, 3 };
		int[] nums = { 1, 2 ,3,4,5,6,7 };
		System.out.println("Sorted using Bubble sort " + Arrays.toString(bubbleSort(nums)));
	}

}
