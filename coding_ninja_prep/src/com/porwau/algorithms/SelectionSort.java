package com.porwau.algorithms;

import java.util.Arrays;

/**
 * Selection sort selects smallest or largest number in one iteration of inner
 * loop and then swaps with outer loop variable.
 * e.g.
 * 3,2,5,6,1 --> 1,2,5,6,3-->1,2,5,6,3->1,2,3,6,5->1,2,3,5,6
 * 
 * @author Utkarsh Porwal
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] intArr = { 3,2,5,6,1 };
		selectionSortAscending(intArr);
		selectionSortDescending(intArr);
	}

	/**
	 * @param intArr
	 */
	private static void selectionSortAscending(int[] intArr) {//3,2,5,6,1
		int arrLen = intArr.length;
		for (int i = 0; i < arrLen; i++) {
			int temp = intArr[i];
			int minIndex = i;
			for (int j = i+1; j < arrLen; j++) {
				if (intArr[j] < intArr[minIndex]) {
					minIndex=j;
				}
			}
			intArr[i] = intArr[minIndex];
			intArr[minIndex] = temp;
		}
		System.out.println("Ascending order through selection sort for " + Arrays.toString(intArr));
		return;
	}
	private static void selectionSortDescending(int[] intArr) {//3,2,5,6,1
		int arrLen = intArr.length;
		for (int i = 0; i < arrLen; i++) {
			int temp = intArr[i];
			int maxIndex = i;
			for (int j = i+1; j < arrLen; j++) {
				if (intArr[j] > intArr[maxIndex]) {
					maxIndex=j;
				}
			}
			intArr[i] = intArr[maxIndex];
			intArr[maxIndex] = temp;
		}
		System.out.println("Descending order through selection sort for " + Arrays.toString(intArr));
		return;
	}
}