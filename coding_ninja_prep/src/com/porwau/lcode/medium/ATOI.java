package com.porwau.lcode.medium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ATOI stands for ASCII to Integer Rules - 1. Discards whitespaces. 2.the first
 * non whitespace should be integers. 3. For invalid input or If no valid
 * conversion could be performed, a zero value is returned. Only the first
 * integral part is considered. eg. for 42SDs32 - return 42 and not 32 Algo a)
 * Check for valid inputs b) grab only valid first integer and return.
 * it can have positive or negative values too.
 * 
 * @author Utkarsh Porwal
 *
 */
public class ATOI {

	private static int defAtoi(String convertToInteger, String pattern) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(convertToInteger);
		String atoi = null;
		int sign=1;
		if (m.matches()) {
			System.out.println("Group 2 " + m.group(3));
			atoi = m.group(3);
			sign = m.group(2).equals("-") ? -1 : 1;
		}else {
			System.out.println("No Match found");
			atoi = "0";
		}

		return Integer.parseInt(atoi)*sign;
	}

	public static void main(String[] args) {
		String pattern = "^(\\s*)([\\-\\+]*)([0-9]+)(.*)"; // 0 or more spaces, followed by 1 0r more numbers, followed by
												// anything.
		String convertToInteger = "   +42";
		System.out.println("ATOI for " + convertToInteger + " is " + defAtoi(convertToInteger,pattern));
	}

}
