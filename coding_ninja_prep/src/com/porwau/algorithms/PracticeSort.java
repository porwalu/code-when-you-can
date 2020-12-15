package com.porwau.algorithms;

//Sort in Ascending
import java.util.Arrays;

/**
 * This class shows usage of elementary sorting algorithms -selection, bubble &
 * insertion sort.
 * 
 * @author Utkarsh Porwal
 *
 */
public class PracticeSort {

	/**
	 * @param intArr - array to sort in ascending order using bubbleSort
	 * @return - sorted array
	 */
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

	/**
	 * @param intArr - array to sort in ascending order using selectionSort
	 * @return - sorted array
	 */
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

	/**
	 * @param intArr - array to sort in ascending order using insertionSort
	 * @return - sorted array
	 */
	private static int[] insertionSort(int[] intArr) {// sorted vs unsorted space
		int arrLen = intArr.length;
		for (int i = 0; i < arrLen; i++) {
//			int unsortedIndex = i+1;
			int numberToCompare = intArr[i];
			int j;
			for (j = i; j > 0 && intArr[j - 1] > numberToCompare; j--) {
				intArr[j] = intArr[j - 1];
			}
			intArr[j] = numberToCompare;
		}
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
