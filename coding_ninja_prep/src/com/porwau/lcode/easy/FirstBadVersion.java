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
		int versionCount = 6;
		System.out.println("First Bad version is " + findFirstBadLinear(versionCount));
		findFirstBadLogarithimic(versionCount);

	}

	private static int findFirstBadLogarithimic(int versionCount) {
		return versionCount;

	}

	private static int findFirstBadLinear(int versionCount) {
		int i = 0;
		for (i = versionCount; i > 0; i--) {
			if (!isBadVersion(i)) {
				break;
			}
		}
		return i + 1;

	}

	private static boolean isBadVersion(int versionCount) {
		Map<Integer, Character> badMap = new HashMap<>();
		badMap.put(1, 'G');
		badMap.put(2, 'G');
		badMap.put(3, 'G');
		badMap.put(4, 'G');
		badMap.put(5, 'B');
		badMap.put(6, 'B');
		badMap.put(7, 'B');
		badMap.put(8, 'B');
		return badMap.get(versionCount) == 'B' ? true : false;
	}
}
