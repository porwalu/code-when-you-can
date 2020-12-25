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
		String roman1 = "DCXXI";
		System.out.println(roman1);

		System.out.println("Integer value for Roman " + roman1 + " is " + romanToIntger(roman1));
	}

	private static int romanToIntger(String roman) {
		int number = 0;
		for (int i = 0; i < roman.length(); i++) {
			if (!(roman.length() == i + 1)) {
				if (roman.charAt(i) == 'I') {
					if (roman.charAt(i + 1) == 'V') {
						number = number + 4;
						i++;
						continue;
					} else if (roman.charAt(i + 1) == 'X') {
						number = number + 9;
						i++;
						continue;
					}

				} else if (roman.charAt(i) == 'X') {
					if (roman.charAt(i + 1) == 'L') {
						number = number + 40;
						i++;
						continue;
					} else if (roman.charAt(i + 1) == 'C') {
						number = number + 90;
						i++;
						continue;
					}

				} else if (roman.charAt(i) == 'C') {
					if (roman.charAt(i + 1) == 'D') {
						number = number + 400;
						i++;
						continue;
					} else if (roman.charAt(i + 1) == 'M') {
						number = number + 900;
						i++;
						continue;
					}
				}
			}
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
			return -1;
		}
	}
}