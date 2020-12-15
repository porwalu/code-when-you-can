package com.porwau.algorithms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] intArr = {10,2,3,6,1,2,20,100,32};
		selectionSort(intArr);
	}

	private static void selectionSort(int[] intArr) {
		int arrLen = intArr.length;
		int j;
		for(int i = 1; i< arrLen; i++) {
			int tmp =intArr[i];
			for(j= i; j >0 && intArr[j-1]>tmp; j--) {//sorted side
				intArr[j] = intArr[j-1];
			}
			intArr[j]=tmp;
			System.out.println(Arrays.toString(intArr));
		}
		System.out.println(Arrays.toString(intArr));
	}

}
