package com.porwau.lcode.easy;

public class ReverseInteger {

	private static int reverseInt(int reverseThis) {

		long reversedNum = 0;// This is long because in some cases we can have a reverse number
								// e.g 1534236469, exceeding the int range
		while (reverseThis != 0) {
			reversedNum = reversedNum * 10 + reverseThis % 10;
			reverseThis = reverseThis / 10;

		}
		// if (reversedNum < Math.pow(-2, 31) || reversedNum - 1 > (Math.pow(2, 31))) {
		if (reversedNum < Integer.MIN_VALUE || reversedNum - 1 > Integer.MAX_VALUE) {//Alternate of above
			reversedNum = 0;
		}
		return (int) reversedNum;
	}

	public static void main(String[] args) {
		int reverseThis = 1534236469;// reverse of this is out of integer range.
		System.out.println("Reverse of " + reverseThis + " is : " + reverseInt(reverseThis));
	}

}
//Time complexity O(n) if n are the digits or O(logx) is x is the number
//Space Complexity. - O(1)?