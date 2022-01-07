package com.porwau.playarea;

import java.util.Arrays;

public class MergeSort {

	private static final int[] mergeSort(int[] nums) {
		int[] mergeArray = new int[nums.length];
		mergeSortRecursive(nums, mergeArray, 0, nums.length - 1);
		return mergeArray;
	}

	private static void mergeSortRecursive(int[] nums, int[] mergedArr, int start, int end) {
		if (start < end) {

			int mid = (start + end) / 2;
			System.out.println("Mid is " + mid);

			mergeSortRecursive(nums, mergedArr, start, mid);
			mergeSortRecursive(nums, mergedArr, mid + 1, end);
			merge(nums, mergedArr, start, mid, end);
		}
	}

	private static void merge(int[] nums, int[] mergedArray, int start, int mid, int end) {
		int left = start;
		int right = mid + 1;
		int mergeCounter = start;
		while (left <= mid && right <= end) {
			if (nums[left] <= nums[right]) {
				// add to final array
				mergedArray[mergeCounter] = nums[left];
				mergeCounter++;
				left++;
			} else {
				mergedArray[mergeCounter] = nums[right];
				mergeCounter++;
				right++;
			}
		}

		// if left sublist finishes
		if (left > mid) {
			// put all remaining elements in right sublist to final array
			while (right <= end) {
				mergedArray[mergeCounter] = nums[right];
				right++;
				mergeCounter++;
			}
		} else if (right > end) {// right finishes
			// put remaining for left to final array
			while (left <= mid) {

				mergedArray[mergeCounter] = nums[left];
				left++;
				mergeCounter++;
			}
			// copy merged array to nums
			for (int i = start; i <= end; i++) {
				nums[i] = mergedArray[i];
			}
		}
	}
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 10, 2, 5, 19, 21, 3, 7 };
		int[] nums2 = { 3, 1, 2 };

		System.out.println("Array using Merge Sort is : " + Arrays.toString(mergeSort(nums)));
	}
}
