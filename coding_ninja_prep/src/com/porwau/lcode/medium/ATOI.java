package com.porwau.lcode.medium;

import java.util.regex.Pattern;

/**
 * ATOI stands for ASCII to Integer
 * Rules -
 * 1. Discards whitespaces.
 * 2.the first non whitespace should be integers.
 * 3. For invalid input or If no valid conversion could be performed, a zero value is returned.
 * Only the first integral part is considered. eg. for 42SDs32 - return 42 and not 32
 * @author Utkarsh Porwal
 *
 */
public class ATOI {

	final static int defAtoi() {
		return 1;
	}
	public static void main(String[] args) {
		String test = " ad12d";
        if(Pattern.matches("^\\s*[0-9]+.*",test)) {
        	System.out.println("valid");
        }else {
        	System.out.println("Invalid");
        }
		//test = test.replaceAll("[^\\+\\-0-9]", "");
		System.out.println(test);
		//System.out.println(Integer.parseInt(test));
	}

}
