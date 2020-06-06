package com.porwau.lcode.easy;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		int smallestWordIndex = 201;
		String[] strings = { "flower", "flow", "flight" };
		for (int i = 0; i< strings.length; i++) {
			if(strings[i].length() < smallestWordIndex) {
				smallestWordIndex = i;
			}
		}
	}

}
