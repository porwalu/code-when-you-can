package com.porwau.playarea;

import java.util.HashMap;
import java.util.Map;

//sweet - w
public class FirstNonRepeatedChar {

	public static void main(String[] args) {

		String s = "swweetts";
		System.out.println("First non-repeated char is - " + nonRepChar(s));
	}

	private static char nonRepChar(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}

		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) == 1)
				return s.charAt(i);
		}

		return ' ';
	}

	private static char nonRepCharOnePass(String s) {
		return ' ';

	}

}
