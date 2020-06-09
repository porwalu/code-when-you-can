package com.porwau.lcode.easy;

/**
 * Numbers are arranged from largest to smallest. Roman numerals are represented
 * by seven different symbols: I, V, X, L, C, D and M.<br>
 * I can be placed before V (5) and X (10) to make 4 and 9. <br>
 * X can be placed before L (50) and C (100) to make 40 and 90. <br>
 * C can be placed before D (500) and M (1000) to make 400 and 900.<br>
 * I, V, X, L, C, D and M
 * 
 * @author Utkarsh Porwal
 */

public class RomanToInteger {

	public static void main(String[] args) {
		String roman = "III";
		roman = roman.replaceAll("IV", "4");
		roman = roman.replaceAll("IX", "9");
		roman = roman.replaceAll("XL", "40");
		roman = roman.replaceAll("XC", "90");
		roman = roman.replaceAll("CD", "400");
		roman = roman.replaceAll("CM", "900");
		System.out.println(roman);
		System.out.println("Integer value for Roman " + roman + " is " + romanToIntger(roman));
	}

	private static int romanToIntger(String roman) {
		int number = 0;
		for (int i = 0; i < roman.length(); i++) {
			System.out.println(romanValue(roman.charAt(i)));
			number = number + romanValue(roman.charAt(i));
		}

		return number;
	}

	private static int romanValue(char roman) {
		switch (roman) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return Character.getNumericValue(roman);
		}
	}
}