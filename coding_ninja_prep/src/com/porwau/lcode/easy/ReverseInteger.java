package com.porwau.lcode.easy;

public class ReverseInteger {

	private static int reverseInt(int reverseThis) {

		long reversedNum = 0;
		while (reverseThis != 0) {
			reversedNum = reversedNum * 10 + reverseThis % 10;
			reverseThis = reverseThis / 10;

		}
		if (reversedNum < Math.pow(-2, 31) || reversedNum - 1 > (Math.pow(2, 31))) {
			reversedNum = 0;
		}
		return (int) reversedNum;
	}

	public static void main(String[] args) {
		int reverseThis=231313131;
		System.out.println("Reverse of " + reverseThis + " is : "+reverseInt(reverseThis));
	}

}
