package com.porwau.lcode.easy;

public class StrStr {

	private static int strStr(String haystack, String needle) {
		if (needle.length() == 0) {
			return 0;
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
