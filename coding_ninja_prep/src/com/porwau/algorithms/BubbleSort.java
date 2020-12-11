package com.porwau.algorithms;

import java.util.Arrays;

/**
 * This class sorting array in ascending and descending order using Bubble sort.
 * @author Utkarsh Porwal
 *
 */
public class BubbleSort {

	public static void main(String[] args) {

		int[] intArr = { 78, 1, 12, 1, 23, 45, 23 };
		bubbleSortDescending(intArr);
		bubbleSortAscending(intArr);

	}

	/**
	 * @param intArr -  Array of integer to be sorted in descending order using bubble sort.
	 */
	private static void bubbleSortDescending(int[] intArr) {
		int arrLength = intArr.length;
		int tmp = 0;
		for (int i = 0; i < arrLength; i++) {
			for (int j = i + 1; j < arrLength; j++) {
				if (intArr[i] < intArr[j]) {
					tmp = intArr[j];
					intArr[j] = intArr[i];
					intArr[i] = tmp;
				}
			}

		}
		System.out.println("Descending Bubble Sort" + Arrays.toString(intArr));
	}

	/**
	 * @param intArr - Array of integer to be sorted in ascending order using bubble sort.
	 */
	private static void bubbleSortAscending(int[] intArr) {
		int arrLength = intArr.length;
		int tmp = 0;
		for (int i = 0; i < arrLength; i++) {
			for (int j = i + 1; j < arrLength; j++) {
				if (intArr[i] > intArr[j]) {
					tmp = intArr[j];
					intArr[j] = intArr[i];
					intArr[i] = tmp;
				}
			}

		}
		System.out.println("Ascending Bubble Sort" + Arrays.toString(intArr));
	}

}
//Time complexity O(n^2) and Space complexity O(1)