package com.porwau.lcode.medium;

//Leetcode 165. Compare Version Numbers
//If version1 < version2, return -1.
//If version1 > version2, return 1.
//Otherwise, return 0 if equal.
//All leading zeros are ignored
//corner cases -  1.2.3.0 - 1.2.3, 1.2.3 - 1.2.3.0.1 - 

public class CompareVersions {

	static int compareVer(String version1, String version2) {
		if (version1.equals(version2)) {
			return 0;
		}

		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		int l1 = v1.length;
		int l2 = v2.length;

		for (int i = 0; i < Math.max(l1, l2); i++) {
			int rev1, rev2;
			rev1 = i < l1 ? Integer.parseInt(v1[i]) : 0;
			rev2 = i < l2 ? Integer.parseInt(v1[i]) : 0;
			if (rev1 != rev2) {//ignore the equal revision
				return rev1 > rev2 ? 1 : -1;//at any stage we get larger revision, return the decission
			}
		}
		return 0;//all revs are same at this stage.
	}

	public static void main(String[] args) {
		String version1 = "1";
		String version2 = "1.1";
		System.out.println(compareVer(version1, version2));
	}
}
//Time complexity of O(N + M +Max(N,M) - split uses linear complexity
//Space - O(N+M) - creating arrays.