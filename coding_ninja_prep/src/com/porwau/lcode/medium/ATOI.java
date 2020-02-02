package com.porwau.lcode.medium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ATOI stands for ASCII to Integer Rules - 1. Discards whitespaces. 2.the first
 * non whitespace should be integers. 3. For invalid input or If no valid
 * conversion could be performed, a zero value is returned. Only the first
 * integral part is considered. eg. for 42SDs32 - return 42 and not 32 Algo a)
 * Check for valid inputs b) grab only valid first integer and return. it can
 * have positive or negative values too.
 * 
 * @author Utkarsh Porwal
 *
 */
public class ATOI {

	private static int defAtoi(String convertToInteger, String pattern) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(convertToInteger);
		long atoi;
		int sign = 1;
		if (m.matches()) {
			if (m.group(2).equals("+-") || m.group(2).equals("-+") || m.group(2).equals("--")
					|| m.group(2).equals("++")) {//invaid signs
				return 0;
			}
			String str = m.group(3).replaceAll("^0+", "");//000001231311 type numbers
			if (str.equals("")) {
				return 0;
			}

			if (str.length() >= 11) {
				return m.group(2).equals("-") ? Integer.MIN_VALUE : Integer.MAX_VALUE;//long strings which cant fit in float
			}
			atoi = Long.parseLong(str);
			sign = m.group(2).equals("-") ? -1 : 1;
			if (atoi * sign < Integer.MIN_VALUE) {
				atoi = Integer.MIN_VALUE;
			} else if (atoi * sign > Integer.MAX_VALUE) {
				atoi = Integer.MAX_VALUE;
			}

		} else {
			atoi = 0;
		}

		return (int) atoi * sign;
	}

	public static void main(String[] args) {
		String pattern = "^(\\s*)([\\-\\+]*)([0-9]+)(.*)"; // 0 or more spaces, followed by 1 0r more numbers, followed
															// by
		// anything.
		String convertToInteger = " 00000-42a1234";
		System.out.println("ATOI for " + convertToInteger + " is " + defAtoi(convertToInteger, pattern));
	}

}
