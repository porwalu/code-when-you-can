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
		int versionCount = 5;
		findFirstBadLinear(versionCount);
		findFirstBadLogarithimic(versionCount);

	}

	private static int findFirstBadLogarithimic(int versionCount) {
		return versionCount;

	}

	private static int findFirstBadLinear(int versionCount) {
		int i = 0;
		for (i = versionCount; i > 0; i--) {
			if (!isBadVersion(versionCount)) {
				break;
			}
		}
		return i + 1;

	}

	private static boolean isBadVersion(int versionCount) {
		// TODO Auto-generated method stub
		Map <Integer,Character> badMap = new HashMap<>();
		badMap.put(1, 'G');
		badMap.put(1, 'G');
		badMap.put(1, 'G');
		badMap.put(1, 'G');
		badMap.put(1, 'G');
		badMap.put(1, 'B');
		badMap.put(1, 'B');
		badMap.put(1, 'B');
		return badMap.get(versionCount)=='B'?true:false;
	}
}
