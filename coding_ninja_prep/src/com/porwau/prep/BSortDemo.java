package com.porwau.prep;

import java.util.Arrays;

public class BSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,50,120,340,1000};
		System.out.println(Arrays.toString(bSort(nums)));
		
	}

	public static int[] bSort(int[] nums) {
		int counter = nums.length -1;
		boolean isSwappedOnce = false;
		for(int i = 0 ; i < nums.length; i++) {
			for(int j = 0; j < counter; j++) {
				if(nums[j] > nums[j+1]) {
					int tmp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tmp;
					isSwappedOnce  = true;
				}
			}
			if(!isSwappedOnce) {
				System.out.println("Array is sorted. exit");
				return nums;
			}
			counter--;
		}
		
		return nums;
	}

}
