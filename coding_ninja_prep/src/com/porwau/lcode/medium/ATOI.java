package com.porwau.lcode.medium;

import java.util.regex.Pattern;

public class ATOI {

	final static int defAtoi() {
		return 1;
	}
	public static void main(String[] args) {
		String test = "1ddasd +912834723 with words";
        System.out.println(Pattern.matches("^[^\\+\\-(0-9)+\\s]+.*",test));
		test = test.replaceAll("[^\\+\\-0-9]", "");
		System.out.println(test);
		System.out.println(Integer.parseInt(test));
	}

}
