package com.porwau.lcode.easy;

/**
 * 9. Palindrome Number
 * There can be many solutions but this is optimized
 * @author Utkarsh Porwal
 *
 */
public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 121;
		System.out.println("Is " + num + " a palindrome? " + isPalindrome(num));
	}

	private static boolean isPalindrome(int x) {
		if (x < 0 || (x % 10 == 0 && x != 0)) { // If num negative its not palindrome, if last digit is 0 then its
												// a palindrome only for nuber 0. Eliminating unnecessary worst case checks
												// for numbers
			return false;
		}
		int reverse = 0;
		while (x > reverse) {// we dont reverse full number, just half. when revrse becomes > new number it has
							// traversed more than half. for example 121 - when rev becomes 12 and x = 1, we exit
			reverse = reverse * 10 + x % 10;
			x = x / 10;
		}
		return x == reverse || x == reverse / 10;// in odd numbers like 121, we just ignore middle ones
												// e.g. 1 and 12 , for even first reverse condition will be met.
	}
}
