package com.porwau.lcode.easy;

public class SubtractProdAndSum {

	private static int subtractProductAndSum(int number) {
		int prod = 1;
		int sum = 0;
		while (number > 0) {
			int digit = number % 10;
			prod = prod * digit;
			sum = sum + digit;
			number = number / 10;
		}
		return (prod - sum);
	}

	public static void main(String[] args) {
		int number = 235;
		System.out.println("Difference of Prod and Sum of " + number + " is " + subtractProductAndSum(number));
	}

}
