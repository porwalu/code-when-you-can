package com.porwau.lcode.easy;

/**
 * Leetcode - 28. Implement strStr()
 * 
 * @author Utkarsh Porwal
 *
 */
public class StrStr {

	/**
	 * @param haystack
	 * @param needle
	 * @return first index of needle in haystack
	 */
	private static int strStr(String haystack, String needle) {
		if (needle.length() == 0) {
			return 0;
		}
		if (!haystack.contains(needle)) {
			return -1;
		}

		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				// check substring.
				if (i + needle.length() > haystack.length()) {
					return -1;
				}
				if (haystack.substring(i, i + needle.length()).equals(needle)) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String needle = "ll";
		String haystack = "hello";
		System.out.println("Index of needle in haystack is " + strStr(haystack, needle));
	}
}
