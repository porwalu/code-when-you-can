package com.porwau.lcode.easy;

import java.util.Arrays;

public class RunningSum1DArray {
	
    private static int[] runningSum(int[] nums) {
        for (int i = 1 ; i < nums.length; i++){
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;
        
    }

	public static void main(String[] args) {
		int[] intNum = {1,2,3,4,5};
		System.out.println("Running Sum is "+ Arrays.toString(runningSum(intNum)));
	}

}
