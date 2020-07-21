package com.porwau.lcode.easy;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThirdMaximumNumber {
	static int ThirdMax(int[] arrNum) {
		Set<Integer> maxSet = new HashSet<>();
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
		
	}

}
