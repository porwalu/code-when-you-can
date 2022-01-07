package com.porwau.prep;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] nums = { -78, 1, 12, 2, 23, 45, 21 };
		System.out.println("sorted array using merge sort - " + Arrays.toString(mergeSort(nums)));

	}

	private static int[] mergeSort(int[] nums) {
		int start = 0, end = nums.length - 1;
		mergeSortRec(nums, start, end);
		return nums;
	}

	private static void mergeSortRec(int[] nums, int start, int end) {
		int mid = 0;
		// TODO Auto-generated method stub
		if (start < end) {
			mid = start + (end - start) / 2;
			mergeSortRec(nums, start, mid);
			mergeSortRec(nums, mid + 1, end);

			merge(nums, start, mid, end);
		}
	}

	private static void merge(int[] nums, int start, int mid, int end) {

		int[] temp = new int[end - start + 1];

		int i = start, j = mid + 1;
		int counter = 0;
		while (i <= mid && j <= end) {
			if (nums[i] < nums[j]) {
				temp[counter] = nums[i];
				i++;
			} else {
				temp[counter] = nums[j];
				j++;
			}
			counter++;
		}
		if (i <= mid) {
			// put remaining of i into tmp
			while (i <= mid) {
				temp[counter++] = nums[i++];
			}
		} else if (j <= end) {
			while (j <= end) {
				temp[counter++] = nums[j++];
			}
		}
		System.arraycopy(temp, 0, nums, start, temp.length);

	}
}