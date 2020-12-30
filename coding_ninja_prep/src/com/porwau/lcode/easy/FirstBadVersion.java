package com.porwau.lcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 278. First Bad Version All the versions after the first bad versions are Bad.
 * We need to find first bad version GGGGGGBBBB Algo - Starting from the most
 * recent version - find the version GB combination.
 * 
 * @author Utkarsh Porwal
 *
 */
public class FirstBadVersion {

	public static void main(String[] args) {
		int versionCount = 10;
		System.out.println("First Bad version via linear search is " + findFirstBadLinear(versionCount));
		System.out.println("First Bad version via binary search is " + findFirstBadLogarithimic(versionCount));
	}
	/**
	 * @param versionCount -Version number which is detected as bad
	 * @return -first bad version This will have O(logn) complexity
	 */
	private static int findFirstBadLogarithimic(int versionCount) {
		int left = 1;
		int right = versionCount;
		while (left < right) {
          int mid = left +(right-left) / 2;//good point
			if (isBadVersion(mid)) {
				// Search left and discard right
				right = mid;
			} else {//Search right, discard left
				left = mid+1;//this is important else it will become infinite.
			}
		}
		return left;
	}

	/**
	 * @param versionCount - Version number which is detected as bad
	 * @return - first bad version This will have O(n) complexity
	 */
	private static int findFirstBadLinear(int versionCount) {
		int i = 0;
		for (i = versionCount; i > 0; i--) {
			if (!isBadVersion(i)) {
				break;
			}
		}
		return i + 1;
	}

	/**
	 * @param version - To check if this version is bad
	 * @return - if the version is bad or not
	 */
	private static boolean isBadVersion(int version) {
		Map<Integer, Character> badMap = new HashMap<>();
		badMap.put(1, 'G');
		badMap.put(2, 'G');
		badMap.put(3, 'G');
		badMap.put(4, 'G');
		badMap.put(5, 'B');
		badMap.put(6, 'B');
		badMap.put(7, 'B');
		badMap.put(8, 'B');
		badMap.put(9, 'B');
		badMap.put(10, 'B');
		return badMap.get(version) == 'B' ? true : false;
	}
}
