package com.porwau.prep;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = { 78, 1, 12,2, 23, 45, 21 };
		int[] nums = { 1,2,3,4,5,6};

		
		//Arrays.sort(nums, (a,b)->Integer.compare(a, b));
		
		System.out.println("sorted array using selection sort - " + Arrays.toString(insertionSort(nums)));

	}

	private static int[] insertionSort(int[] nums) {
		// TODO Auto-generated method stub
		int numIndex = 1;
		for(int i = 0; i < nums.length - 1; i++) {
			if(nums[numIndex] < nums[i]) {
				System.out.println("swap");
				//find from 0 - i
				for(int j= 0; j<=i;j++) {
					if(nums[numIndex] < nums[j]) {
						//swap and break
						int tmp = nums[j];
						nums[j] = nums[numIndex];
						nums[numIndex] = tmp;
					}
				}
			}
			numIndex++;
		}
		
		return nums;
	}


}
