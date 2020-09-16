package com.porwau.lcode.easy;

import java.util.Arrays;

public class TwoSum {

	static int[] twoSum(int[] arrNum, int target) {
		for(int i = 0; i < arrNum.length; i++) {
			for ( int j = i + 1; j < arrNum.length; j++) {
				if( arrNum[j] == target - arrNum[i]) {
					return new int[] {i, j};
				}
			}
		}
		
		return new int[] {0};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrNum = {3,3};
		int target = 6;
		System.out.println("Two sum which gives " +  target + " is " + Arrays.toString(twoSum(arrNum,target)));

	}

}
