package com.porwau.problemsolving;

/**
 * This class takes the sentence as an input and returns the longest word in the sentence.
 * <br>Assumptions:
 * <br><li>We will ignore anything other than [A-Za-z0-9\\s+] in the sentence.
 * <br><li>Spaces(one or more) are taken as word delimeters
 * @author Utkarsh Porwal
 *
 */
public class LongestWordInString {

	public static void main(String[] args) {

		String sentence = "H@#! are";

		if (sentence == null || sentence.length() == 0) {// Null and empty check for String
			System.out.println("Invalid String");
			return;
		}

		sentence = sentence.replaceAll("[^A-Za-z0-9\\s+]", "");// Not counting special characters
		System.out.println(sentence);

		longestWord(sentence);
	}

	/**
	 * @param sentence - Sentence from which we need to print the longest word
	 */
	private static void longestWord(String sentence) {
		String[] wordArr = sentence.split("\\s+");
		int maxLength = 0;
		String longestWord = "";
		for (int i = 0; i < wordArr.length; i++) {
			if (maxLength < wordArr[i].length()) {
				maxLength = wordArr[i].length();
				longestWord = wordArr[i];
			}
		}
		System.out.println("Longest word is - " + longestWord);

	}

}
//Time complexity O(n) and Space complexity O(n)