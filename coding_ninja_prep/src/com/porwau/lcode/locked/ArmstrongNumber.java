package com.porwau.lcode.locked;

import java.util.Scanner;

/*
 * LC - 1134. Armstrong Number
Given an integer n, return true if and only if it is an Armstrong number.

The k-digit number n is an Armstrong number if and only if the 
kth power of each digit sums to n.
153 is a 3-digit number, and 153 = 13 + 53 + 33.
*/
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter potential Armstrong number:");
		int num = Integer.parseInt(scan.nextLine());
		
		System.out.println(num + " is Armstrong : " + checkArmstrong(num));

		//String.valueOf
	}
	private static boolean checkArmstrong(int num) {
		int digits = (int) (Math.log10(num) + 1);
		int sum = 0;
		int orig = num;
		while(num !=0) {
			sum += Math.pow(num%10,digits);
			num = num/10;
		}
		System.out.println("Armstrong representation " + sum);
		return sum==orig;
	}

}
