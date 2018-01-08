package com.porwau.lcode.easy;

import java.util.Arrays;

public class ReverseString {

	static void reverseString(char[] s) {
		//System.out.println(Arrays.toString(s)+ " is reversed to :");
		System.out.println(Arrays.toString(s)+ " is reversed to :");

		char tmp = ' ';
		int arrLength = s.length;
		for (int i = 0; i < arrLength / 2; i++) {
			tmp = s[i];
			s[i] = s[arrLength - 1 - i];
			s[arrLength - 1 - i] = tmp;
		}
		System.out.println(Arrays.toString(s));

	}

	public static void main(String[] args) {
		char[] reverseThis = { 'h', 'e', 'l', 'l', 'o' };
//		char[] reverseThis = null;
		if (reverseThis != null) {//if we are passing null char arrays
			//reverseString(reverseThis);//Use this 
			reverseString(new char[] { 'h', 'e', 'l', 'l', 'o' });//Or this
		} else {
			System.out.println("Char array is null. Please re-enter");
		}
	}

}
//Time complexity O(N) and Space complexity is O(1)