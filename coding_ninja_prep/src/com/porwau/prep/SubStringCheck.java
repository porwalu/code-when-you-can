package com.porwau.prep;

import java.util.Scanner;

public class SubStringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDCDCDC";
		String sub = "CDC";
		System.out.println("Num of occurences of " + sub + ":" + checkSub(str, sub));
		int num = -1;
	//	Scanner scan = new Scanner(System.in);

//		while (num != 0) {
//			System.out.println("ENter num:");
//			 num = scan.nextInt();
//
//			// num = scan.nextInt();
//			System.out.println("Num is " + num);
//		}

	}

	private static int checkSub(String str, String sub) {
		int length = str.length();
		int subL = sub.length();
		int counter = 0;

		for (int i = 0; i <= length - subL; i++) {
			if (str.substring(i, i + subL).equals(sub))
				counter++;
		}
		return counter;
	}

}
