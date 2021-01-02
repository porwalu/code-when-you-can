package com.porwau.lcode.easy;

public class SqaureRoot {

	public static void main(String[] args) {
		int number = 8;
		System.out.println("Square root of " + number + " is " + sqrt(number));
	}

	private static int sqrt(int number) {
		int left = 1;
		int right = number;
		int mid = 1;
		while (left <=right) {
			 mid = left + (right - left) / 2;// square too wont be more than this.

			if ((long)mid * mid > number) {//to prevent overflow 
				right = mid -1 ;
			} else if ((long)mid * mid < number) {
				// root is to the right of mid
				left = mid + 1;
			}else {return mid;}
		}
		return right;//remember this
	}

}
