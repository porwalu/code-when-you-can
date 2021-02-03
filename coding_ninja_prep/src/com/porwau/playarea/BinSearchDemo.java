package com.porwau.playarea;

public class BinSearchDemo {

	public static void main(String[] args) {
		int[] nums = {-10,-4,-3,3,4,10,12};
		
		System.out.println(binarySearch(nums,12));
	}

	private static int binarySearch(int[] nums, int num) {
		int start = 0;
		int end = nums.length;
		int mid = (start + end)/2;
		while(start < end) {
			if(num == nums[mid]) {return mid;}
			if(num>nums[mid]) {
				start = mid +1 ;
			}else {
				end = mid -1;
			}
			mid = (start+end)/2;
		}
		return -1;
	}

}
