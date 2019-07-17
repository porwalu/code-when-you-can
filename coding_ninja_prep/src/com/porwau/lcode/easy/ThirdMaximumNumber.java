package com.porwau.lcode.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//Use cases - Third Maximum number
//in case of duplicates, consider it as a single entry
//if there are less than three maxs, return maximum

public class ThirdMaximumNumber {
	static int thirdMax(int[] arrNum) {
		Set<Integer> maxSet = new HashSet<>();//TO avoid duplicate addition to a set
		for(int i = 0 ; i < arrNum.length; i++) {
			maxSet.add(arrNum[i]);
			if(maxSet.size() > 3) {
				maxSet.remove(Collections.min(maxSet));
			}			
		}
		if(maxSet.size() < 3) {
			return Collections.max(maxSet);
		}else {
			return Collections.min(maxSet);
		}
	}
	public static void main(String[] args) {
		int[] arrNum = {2, 2, 1};
		System.out.println("Third Maximum number of " + Arrays.toString(arrNum) + " is - " + thirdMax(arrNum));	
	}
}