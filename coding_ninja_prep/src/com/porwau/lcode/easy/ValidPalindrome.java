package com.porwau.lcode.easy;

public class ValidPalindrome {

	private static boolean isPalindrome(String s) {
		// 1. replace all non alphanumeric
		// 2. split into two using mid point.
		// 3.reverse one side
		// 4. equalsIgnoreCase left and right

		s = s.replaceAll("[^A-Za-z0-9]", "");
		int strLen = s.length();
		int mid = strLen / 2;// string is from 0 to length-1
		if (strLen % 2 != 0) {
			mid = mid + 1;
		}
		return s.substring(0, strLen / 2)
				.equalsIgnoreCase(new StringBuilder(s.substring(mid, strLen)).reverse().toString());
	}
	public static void main(String[] args) {
		String str = "A man, a plan, a canal: Panama";
		String str2 = "Amma";
		System.out.println("Is Palindrome ? " + isPalindrome(str));
	}
}
