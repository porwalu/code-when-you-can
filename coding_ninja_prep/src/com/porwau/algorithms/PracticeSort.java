package com.porwau.algorithms;

//Sort in Ascending
import java.util.Arrays;

public class PracticeSort {

	private static int[] bubbleSort(int[] intArr) {// Bubble Up
		int arrLen = intArr.length;
		for (int i = 0; i < arrLen; i++) {
			for (int j = 0; j < arrLen - 1; j++) {
				if (intArr[j] > intArr[j + 1]) {
					int tmp = intArr[j];
					intArr[j] = intArr[j + 1];
					intArr[j + 1] = tmp;
				}
			}
		}
		return intArr;
	}

	private static int[] selectionSort(int[] intArr) {// Find the smallest in one iteration and swap with
		// leftside elements
		int arrLen = intArr.length;
		for (int i = 0; i < arrLen; i++) {
			int minIndex = i;
			int tmp = intArr[i];
			for (int j = i + 1; j < arrLen; j++) {
				if (intArr[j] < intArr[minIndex]) {
					minIndex = j;
				}
			}
			intArr[i] = intArr[minIndex];
			intArr[minIndex] = tmp;
		}
		return intArr;
	}

	private static int[] insertionSort(int[] intArr) {// sorted vs unsorted space

		return intArr;
	}

	public static void main(String[] args) {
		int[] intArr1 = { 10, 11, 8, 10, 4, 5, 1, 101, 0 };
		int[] intArr2 = { 10, 11, 8, 10, 4, 5, 1, 101, 0 };
		int[] intArr3 = { 10, 11, 8, 10, 4, 5, 1, 101, 0 };

		System.out.println("Unsorted Array is " + Arrays.toString(intArr1));
		System.out.println("Bubble sorted Array is " + Arrays.toString(bubbleSort(intArr1)));
		System.out.println("Selection sorted Array is " + Arrays.toString(selectionSort(intArr2)));
		System.out.println("Insertion sorted Array is " + Arrays.toString(insertionSort(intArr3)));
	}

}
