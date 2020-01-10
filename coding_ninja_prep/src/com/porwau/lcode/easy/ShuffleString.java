package com.porwau.lcode.easy;

/**
 * @author Utkarsh Porwal
 *This program takes a random string and an array having the integer values.
 *The string will be shuffled such that the character at the ith position 
 *moves to indices[i] in the shuffled string.
 */
public class ShuffleString {

	/**
	 * @param s - String to be shuffled
	 * @param indices -array storing the positional value
	 * @return the shuffled string
	 */
	private static String restoreString(String s, int[] indices) {
		int length = indices.length;
		char[] shuffleArray = new char[length];
		for (int i = 0; i < length; i++) {
			shuffleArray[indices[i]] = s.charAt(i);
		}
		return String.valueOf(shuffleArray);
	}

	public static void main(String[] args) {
		String reverseThis = "codeleet";
		System.out.println(
				reverseThis + " is shuffled to : " + restoreString(reverseThis, new int[] { 4, 5, 6, 7, 0, 1, 2, 3 }));
	}

}
