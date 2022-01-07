package com.porwau.algorithms;

import java.util.Arrays;

/**
 * This class sorting array in ascending and descending order using Bubble sort.
 * Bubble sort. compare adjacent elements with each other in multiple passes and
 * bubble them up. in each pass one element is finalized (biggest or smallest)
 * 
 * @author Utkarsh Porwal
 *
 */
public class BubbleSort {

	public static void main(String[] args) {

		// Tip for string sorting. use compareTo method accordingly
		int[] intArr = { 78, 1, 12, 1, 23, 45, 23 };
		bubbleSortDescending(intArr);
		bubbleSortAscending(intArr);
String s = "bew";

	}

	/**
	 * @param intArr - Array of integer to be sorted in descending order using
	 *               bubble sort.
	 */
	private static void bubbleSortDescending(int[] intArr) {
		int arrLength = intArr.length;
		int tmp = 0;
		for (int i = 0; i < arrLength; i++) {// i doesn't have any role here. it it used to create n iterations.
			for (int j = 0; j < arrLength - 1; j++) {
				if (intArr[j] < intArr[j + 1]) {
					tmp = intArr[j];
					intArr[j] = intArr[j + 1];
					intArr[j + 1] = tmp;
				}
			}
		}
		System.out.println("Descending Bubble Sort" + Arrays.toString(intArr));
	}

	/**
	 * @param intArr - Array of integer to be sorted in ascending order using bubble
	 *               sort.
	 */
	private static void bubbleSortAscending(int[] intArr) {
		int arrLength = intArr.length;
		int tmp = 0;
		for (int i = 0; i < arrLength; i++) {
			for (int j = 0; j < arrLength - 1; j++) {
				if (intArr[j] > intArr[j + 1]) {
					tmp = intArr[j];
					intArr[j] = intArr[j + 1];
					intArr[j + 1] = tmp;
				}
			}
		}
		System.out.println("Ascending Bubble Sort" + Arrays.toString(intArr));
	}
}
//Time complexity O(n^2) and Space complexity O(1)
//Base case complexity in case of sorted array and if we use a flag is O(n)