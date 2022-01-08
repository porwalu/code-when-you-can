package com.porwau.playarea;


//Given a sorted array of distinct integers and a target value, return the index if the target is found. 
//If not, return the index where it would be if it were inserted in order.

/*
 * 
 Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
 */
public class SearchInsert {

	public static void main(String[] args) {
	int[] arr = {1,3,5,6,9,10,11,23};
	//	int[] arr = {1,3,5};

		int target = 14;
		int find = 6;
		
		//System.out.println("Search index is - " + searchIndex(arr,target));
		System.out.println("insertion point is - " + binarysearchIndex(arr,target));
//		System.out.println("Found using binary search at index - " + binarySearch(arr,find));



	}

	private static int searchIndex(int[] arr, int target) {
		// TODO Auto-generated method stub
		if(target < arr[0]) return 0;
		if(target > arr[arr.length - 1]) return arr.length;
		int i = 0;
			while(arr[i] <  target) {
				i++		;		
			}
			return i;
	}

	private static int binarysearchIndex(int[] arr, int target) {
		// TODO Auto-generated method stub
		if(target < arr[0]) return 0;
		if(target > arr[arr.length - 1]) return arr.length;
		int start = 0;
		int end = arr.length -1 ;
		int mid = (start + end)/2;
		while(start <= end) {
			if(target == arr[mid]) return mid;
			if(target > arr[mid]) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
			mid = (start + end)/2;
		}
		return start;
	}
	
	private static int binarySearch(int[] arr, int target) {
		if(target < arr[0] ||
		target > arr[arr.length - 1]) return -1;
		int start = 0;
		int end = arr.length ;
		int mid = (start + end)/2;
		while(start <= end) {
			if(target == arr[mid]) return mid;
			if(target > arr[mid]) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
			mid = (start + end)/2;
		}
		return -1;
	}
}
