package com.porwau.lcode.easy;

public class ToLower {

    private static String toLowerCase(String str) {
		int strLength = str.length();
		char[] ch = new char[strLength];
		for (int i = 0; i < strLength; i++) {
			if (str.charAt(i) <= 90 && str.charAt(i) >= 65) {
				ch[i] = (char) (str.charAt(i) + 32);
			}else {
				ch[i] = str.charAt(i);
			}
		}
		return String.valueOf(ch);
    }
	public static void main(String[] args) {
String str = "HeLLo";
System.out.println("Lower case value of " + str + " is " + toLowerCase(str));
	}

}
