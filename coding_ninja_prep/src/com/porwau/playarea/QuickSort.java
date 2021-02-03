package com.porwau.playarea;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] nums = new int[] {1, 10, 2, 5, 19, 21, 3, 57 };
		//int[] nums = { 3, 1, 2, 4 };

		System.out.println("Sorted array using quick sort is " + Arrays.toString(quickSort(nums, 0, nums.length - 1)));
	}

	private static final int[] quickSort(int[] nums, int start, int end) {
		
		if( start < end) {
			int pivotIndex = partition(nums, start, end);
			quickSort(nums, start, pivotIndex -1 );
			quickSort(nums, pivotIndex + 1, end);
		}
		return nums;
	}

	private static int partition(int[] nums, int start, int end) {
		int i = start;
		int j = end;
		//int pivot = nums[end];
		int pivot = nums[start];


		while (i < j) {
			while (nums[i] <= pivot) {
				i++;
			}
			while (nums[j] > pivot) {
				j--;
			}

			if (i < j) {
				swap(nums, i, j);
			}
		}
		swap(nums, start, j);

		return j;
	}

	private static void swap(int[] nums, int i, int j) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
		
	}
}
