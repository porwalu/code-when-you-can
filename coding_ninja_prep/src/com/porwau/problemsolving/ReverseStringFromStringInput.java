package com.porwau.problemsolving;

/**This class is used to reverse a string while taking string (and not char array as input)
 *  * @author Utkarsh Porwal
 *
 */
public class ReverseStringFromStringInput {

	/**
	 * @param reverseThis - String to be reversed
	 * Reversed string is also printed in the same method.
	 */
	private static void reverseString(String reverseThis) {

		char[] strArr = reverseThis.toCharArray();

		char tmp = ' ';
		int arrLength = strArr.length;
		for (int i = 0; i < arrLength / 2; i++) {
			tmp = strArr[i];
			strArr[i] = strArr[arrLength - 1 - i];
			strArr[arrLength - 1 - i] = tmp;
		}
		System.out.println("'" + reverseThis + "' is reversed to : '" + String.copyValueOf(strArr) + "'");
		return;
	}

	public static void main(String[] args) {

		String reverseThis = "Hello! How are you ? ";
		reverseString(reverseThis);
	}

}
