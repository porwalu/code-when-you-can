package com.porwau.lcode.easy;

/**
 * Assumption - all lowercase input characters.
 * Break a palindrome by addind a lowercase character to make result lexicographically smallest.
 * @author Utkarsh Porwal
 *
 */
public class BreakPalindrome {
	// Test cases 1) odd and even lengths strings.
	//all a's
	//odd length string with all all 'a' except midpoint.

	/**
	 * @param palindrome - palindrome to be broken.
	 * @return - broken palindrome.
	 */
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
		String str = "aa";
		System.out.println("Break palindrome - " + breakPalindrome(str));

	}

}
