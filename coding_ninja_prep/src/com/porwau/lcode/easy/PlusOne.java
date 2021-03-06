package com.porwau.lcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 66. Plus One
 * @author Utkarsh Porwal
 *
 */
public class PlusOne {

	public static void main(String[] args) {
		System.out.println("Plus one " + Arrays.toString(plusOne(new int[] { 9, 9, 9 })));
	}

	private static int[] plusOne(int[] digits) {
//        int sum = 0;
//        int carry = 1;
//        boolean allNine = false;
//        for(int i = digits.length -1;  i >=0;i--){
//            if(digits[i]+carry == 10){
//            	allNine=true;
//                carry = 1;
//                digits[i]=0;   
//            }else{
//            	allNine=false;
//                digits[i]=digits[i]+carry;
//                carry = 0;          
//            }
//        }
//        if(allNine) {
//        	int[] nums = new int[digits.length+1];
//        	nums[0]=1;
//        	for (int i = 0;i<digits.length;i++) {
//        		nums[i+1] = digits[i];
//        	}
//            return nums;
//        }
//        return digits;
		
        for(int i = digits.length -1;  i >=0;i--){
            if(digits[i] == 9){
                digits[i]=0;   
            }else{
                digits[i]=digits[i]+1;//As soon as any number is <9, we wont have a carry & hence other digits remain unchanged.
                return digits;          //We can immediately return.
            }
        }
        //this is all 9's in input array.
        	int[] nums = new int[digits.length+1];// THis is also O(n);
        	nums[0]=1;//this is sufficient because by default all elments of array are 0 so no need to set them.
            return nums;
        }
}
