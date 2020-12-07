package com.porwau.lcode.easy;

import java.util.Arrays;

public class ReverseString {

	/**
	 * @param str - character array to reverse
	 */
	static void reverseString(char[] str) {
		//System.out.println(Arrays.toString(str)+ " is reversed to :");
		System.out.println(Arrays.toString(str)+ " is reversed to :");

		char tmp = ' ';
		int arrLength = str.length;
		for (int i = 0; i < arrLength / 2; i++) {
			tmp = str[i];
			str[i] = str[arrLength - 1 - i];
			str[arrLength - 1 - i] = tmp;
		}
		System.out.println(Arrays.toString(str));

	}

	public static void main(String[] args) {
		char[] reverseThis = { 'h', 'e', 'l', 'l', 'o' };
//		char[] reverseThis = null;
		if (reverseThis != null) {//if we are passing null char arrays
			reverseString(reverseThis);//Use this 
			//reverseString(new char[] { 'h', 'e', 'l', 'l', 'o' });//Or this
		} else {
			System.out.println("Char array is null. Please re-enter");
		}
	}

}
//Time complexity O(N) and Space complexity is O(1).