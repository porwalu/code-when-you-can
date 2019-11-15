package com.porwau.algorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] intArr = { 78, 1, 12, 1, 23, 45, 23 };
		bubbleSortDescending(intArr);
		bubbleSortAscending(intArr);


	}

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
		System.out.println("Ascending Bubble Sort" + Arrays.toString(intArr));
	}
	
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
