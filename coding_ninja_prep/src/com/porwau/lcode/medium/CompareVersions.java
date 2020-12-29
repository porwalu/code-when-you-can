package com.porwau.lcode.medium;

//Leetcode 165. Compare Version Numbers
//If version1 < version2, return -1.
//If version1 > version2, return 1.
//Otherwise, return 0 if equal.
//All leading zeros are ignored

public class CompareVersions {

	static int compareVer(String version1, String version2) {
String v = "01";
 String ve1 = v.replaceAll("^0+(?!$)", "");//negative lookahead.
 System.out.println(ve1);

		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		boolean leftVersionGreater = true;
		boolean leftVersionLonger=true;
		int length = v2.length;
		if(v1.length < v2.length) {
			leftVersionLonger =false;
			length = v1.length;
		}
		
		for(int i = 0; i < length; i++) {
			compare(v1[0],v2[0]);
		}
		if (Integer.parseInt(v1[0]) < Integer.parseInt(v2[0])) {
			System.out.println("v1 < v2");
			return -1;
		} else if (Integer.parseInt(v1[0]) > Integer.parseInt(v2[0])) {
			System.out.println("v1 > v2");
			return 1;
		}
		return 1;
	}

	private static void compare(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		String version1 = "3.001";
		String version2 = "2.1";
		compareVer(version1, version2);

	}

}
