package com.porwau.lcode.medium;

//Leetcode 165. Compare Version Numbers
//If version1 < version2, return -1.
//If version1 > version2, return 1.
//Otherwise, return 0 if equal.
//All leading zeros are ignored
//corner cases - no . - 3 and 5, 1.2.3.0 - 1.2.3, 1.2.3 - 1.2.3.0.1

public class CompareVersions {
	private static int compare(String v1, String v2) {
		if (Integer.parseInt(v1) > Integer.parseInt(v2)) {
			return 1;
		} else if (Integer.parseInt(v1) < Integer.parseInt(v2)) {
			return -1;
		}
		return 0;

	}

	static int compareVer(String version1, String version2) {

		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		int leftVersionGreater = 1;
		int leftVersionLonger = 1;
		int trackRev = 0;
		int length = v2.length;
		if (v1.length < v2.length) {
			leftVersionLonger = -1;
			length = v1.length;
		} else if (v1.length == v2.length) {
			leftVersionLonger = 0;
			length = v1.length;

		}

		for (int i = 0; i < length ; i++) {
			trackRev = compare(v1[i].replaceAll("^0+(?!$)", ""), v2[i].replaceAll("^0+(?!$)", ""));
			if(trackRev !=0) {break;}
		}
		// 1, 0, -1
		if (trackRev == 0) {// both split revisions are equal.
			// length is more and not just zeros return it. else return equal
			return leftVersionLonger;
		}
		return trackRev;
	}

	public static void main(String[] args) {
		String version1 = "7.5.2.4";
		String version2 = "7.5.3";
		System.out.println(compareVer(version1, version2));

	}

}
