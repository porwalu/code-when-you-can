package com.porwau.lcode.easy;

/**
 * Longest common prefix - only the prefix starting from beginning for word.<br>
 * if array is null, return blank.
 * 
 * @author Utkarsh Porwal
 *
 */
public class LongestCommonPrefix {

	/**
	 * @param strings - array of words to check for longest common prefix
	 * @return - longest common prefix
	 */
	private static String findPrefix(String[] strings) {
		if (strings.length == 0) {
			return "";
		}
		String prefix = strings[0];
		for (int i = 1; i < strings.length; i++) {
			while (strings[i].indexOf(prefix) != 0) {// if it matches and it is a prefix, meaning, first index
														// should always be 0.
														// when prefix becomes empty, it also returns 0
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}
		System.out.println(prefix);
		return prefix;
	}

	public static void main(String[] args) {
		String[] strings = { "c", "racecar", "car" };
		System.out.println("Longest Common Prefix is " + findPrefix(strings));
	}
}
