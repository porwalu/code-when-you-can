package com.porwau.lcode.easy;

public class LongestCommonPrefix {

	private static String findPrefix(String[] strings){
	       if(strings.length == 0){
	            return "";
	        }
			String prefix = strings[0];
			for (int i = 1; i < strings.length; i++) {
				while (strings[i].indexOf(prefix) != 0) {
					prefix = prefix.substring(0, prefix.length() - 1);
				}
			}
			System.out.println(prefix);
			return prefix;
		}
	
	public static void main(String[] args) {
		String[] strings = { "c","racecar","car" };
		System.out.println("Longest Common Prefix is "+ findPrefix(strings));
}
}
