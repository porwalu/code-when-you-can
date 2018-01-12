package com.porwau.problemsolving;

public class ReverseStringFromStringInput {

	private static void reverseString(String reverseThis) {

		char[] strArr = reverseThis.toCharArray();
		System.out.println("'" + reverseThis + "' is reversed to : ");

		char tmp = ' ';
		int arrLength = strArr.length;
		for (int i = 0; i < arrLength / 2; i++) {
			tmp = strArr[i];
			strArr[i] = strArr[arrLength - 1 - i];
			strArr[arrLength - 1 - i] = tmp;
		}
		System.out.println("'" + String.copyValueOf(strArr) + "'");
		return;
	}

	public static void main(String[] args) {

		String reverseThis = "hello there";
		reverseString(reverseThis);
	}

}
