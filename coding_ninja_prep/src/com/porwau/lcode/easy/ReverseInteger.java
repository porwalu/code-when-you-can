package com.porwau.lcode.easy;

/**
 * This method reverses an integer values This also check a case of integer
 * overflow when the reversed number is outside of the Java integer range
 * 
 * @author Utkarsh Porwal
 *
 */
public class ReverseInteger {

	/**
	 * @param reverseThis - This is the integer to be reversed
	 * @return The reverse of reverseThis
	 */
	private static int reverseInt(int reverseThis) {

		long reversedNum = 0;// This is long because in some cases we can have a reverse number
								// e.g 1534236469, exceeding the int range
		while (reverseThis != 0) {
			reversedNum = reversedNum * 10 + reverseThis % 10;
			reverseThis = reverseThis / 10;

		}
		// if (reversedNum < Math.pow(-2, 31) || reversedNum - 1 > (Math.pow(2, 31))) {
		if (reversedNum < Integer.MIN_VALUE || reversedNum - 1 > Integer.MAX_VALUE) {// Alternate of above
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