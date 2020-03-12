package com.porwau.lcode.medium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ATOI stands for ASCII to Integer
 * Rules -
 * 1. Discards whitespaces.
 * 2.the first non whitespace should be integers.
 * 3. For invalid input or If no valid conversion could be performed, a zero value is returned.
 * Only the first integral part is considered. eg. for 42SDs32 - return 42 and not 32
 * Algo 
 * a) Check for valid inputs
 * b) grab only valid first integer and return.
 * @author Utkarsh Porwal
 *
 */
public class ATOI {

	final static int defAtoi() {
		return 1;
	}
	public static void main(String[] args) {
		String test = " ad12d";
		String test1 = "123adsdadad";

		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher("test1");
		System.out.println("Using matcher find gives " + m.find() + " while matches gives - " + m.matches());
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
