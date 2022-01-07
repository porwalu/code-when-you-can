package com.porwau.prep;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Misc {

	public static void main(String[] args) throws IOException {
		//Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]);
		
		LinkedList<Integer> list = new LinkedList<>();
Map<Integer,Integer> map = new HashMap<>();
Set<Entry<Integer, Integer>> entrySet = map.entrySet();

try {
System.out.println("try demo");
throw new IOException();
} catch(NullPointerException  f) {
	
}finally {
	System.out.println("in finally");
}

		//charset.iterator();
//		charset.add
		System.out.println(Integer.MIN_VALUE);
		Pattern p = Pattern.compile("^[\\s+\\+\\-\\d]*");
		Matcher m = p.matcher("  +a12345");
		System.out.println(m.matches());
		int[] nums = { 4, 7, 11, 15, 1 };

		int target = 8;

		System.out.println('a' + 10);
		
		String s = "A man, a plan, a canal: Panama";
		s = s.replaceAll("[^a-zA-z]", "").toLowerCase();
		System.out.println(s);
		int left = 0;
		int right = s.length() - 1;

while(left< right) {
	if(!(s.charAt(left) == s.charAt(right))) {
		System.out.println("Not palindrome");
		return;
	}else {
		left++;
		right--;
	}
}
System.out.println("Is a palindrome");
		
		System.out.println(Arrays.toString(findTwoSum(nums,target)));
	}

	private static int[] findTwoSum(int[] nums, int target) {
		Map<Integer,Integer> map  = new HashMap<>();
		//complement/index
		int[] result = new int[2];
		for(int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement) && nums[i] !=complement) {
				result[0] =i;
				result[1] = map.get(complement);
			}else {
				map.put(nums[i], i);
			}
		}
		return result;
	}

}
