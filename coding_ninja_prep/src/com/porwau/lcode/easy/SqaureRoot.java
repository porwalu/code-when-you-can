package com.porwau.lcode.easy;

public class SqaureRoot {

	public static void main(String[] args) {
		int number = 100;
		System.out.println("Square root of " + number + " is " + sqrt(number));
	}

	private static int sqrt(int number) {
		int left = 1;
		int right = number;
		while (right > left) {
			int mid = left + (right - left) / 2;// square too wont be more than this.

			if (mid * mid > number) {
				left = mid + 1;
			} else if (mid * mid < number) {
				// root is to the left of mid
				right = mid;
			} else {
				return mid;// equal case
			}
		}
		return 1;
	}

}
