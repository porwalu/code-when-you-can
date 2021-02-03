package com.porwau.playarea;

import java.util.Arrays;

public class SelectionSort {

	private static int[] selectionSort(int[] nums) {
		
		for(int i = 0; i< nums.length; i++) {
			int smallestPointer = i;
			for(int j=i+1; j < nums.length; j++) {
				if(nums[j] < nums[smallestPointer]) {
					smallestPointer = j;
				}
			}
			//swap with the ith element
			int tmp = nums[smallestPointer];
			nums[smallestPointer] = nums[i];
			nums[i]=tmp;
		}
		return nums;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {1, 10, 2, 5, 19, 21, 3 };
		int[] nums2 = { 1, 2 ,3,4,5,6,7 };
		System.out.println("Sorted array using selection sort is " + Arrays.toString(selectionSort(nums)));
	}
}