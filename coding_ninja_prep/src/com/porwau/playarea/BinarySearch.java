package com.porwau.playarea;

class BinarySearch {

	private static int binarySearch(int num, int[] nums, int lb, int ub) {
		if (lb > ub) {
			return -1;
		}

		int mid = lb + (ub - lb) / 2;
		if (num > nums[mid]) { // search on RHS
			return binarySearch(num, nums, mid + 1, ub);
		} else if (num < nums[mid]) {// search on LHS
			return binarySearch(num, nums, lb, mid - 1);
		} else { // number is found.
			return mid;
		}

		// return -1;
	}

	public static void main(String[] args){
        int[] arr = new int[]{1,3,5,7,9,10};       
        int numToSearch = 7;
        System.out.println("Index of number " + numToSearch + " in array is " + (binarySearch(numToSearch, arr,0, arr.length - 1) == -1 ? "Not Found!!": binarySearch(numToSearch, arr,0, arr.length - 1)));
    }
}