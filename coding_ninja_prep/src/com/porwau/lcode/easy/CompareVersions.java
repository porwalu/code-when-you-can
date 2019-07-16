package com.porwau.lcode.easy;

//If version1 < version2, return -1.
//If version1 > version2, return 1.
//Otherwise, return 0.

public class CompareVersions {

	static int compareVer(String version1, String version2) {
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		if(Integer.parseInt(v1[0]) < Integer.parseInt(v2[0])) {
			System.out.println("v1 < v2");
			return -1;
		}else if(Integer.parseInt(v1[0]) > Integer.parseInt(v2[0])){
			System.out.println("v1 > v2");
			return 1;
		}
		return 1;
	}

	public static void main(String[] args) {
		String version1 = "3.001";
		String version2 = "2.1";
		compareVer(version1, version2);

	}

}
