package com.porwau.lcode.easy;

public class BreakPalindrome {

	// even length --- replace the mid point with next lowercase.
	// odd length -- replace the midpoint -1 / +1
	// empty String
	// all a's
	// lexicographically smallest.

	public static String breakPalindrome(String palindrome) {
		int strLength = palindrome.length();
		if (strLength == 1) {
			return "";
		}

		int midPoint = strLength / 2;
		for (int i = 0; i < midPoint; i++) {
			if (palindrome.charAt(i) != 'a') {
				return palindrome.substring(0, i) + 'a' + palindrome.substring(i + 1, strLength);
			}
		}
		return palindrome.substring(0, strLength - 1) + 'b';

	}

	public static void main(String[] args) {
		String str = "aaaaaaaaa";
		System.out.println("Break palindrome - " + breakPalindrome(str));

	}

}
