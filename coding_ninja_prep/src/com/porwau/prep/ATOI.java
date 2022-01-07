package com.porwau.prep;

import java.math.BigInteger;

public class ATOI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String number = "  1313131333312133113";

		System.out.println("atoi is " + atoi(number));
		
		System.out.println("Hex string " + Integer.toHexString(65));
		
		String hex = "80000141E28";// byte array -[48][49][50][51] // hex --  [30][31][32][33]
	     // String str = "1D08A";

		byte[] byteArray = BigInteger.valueOf(Long.parseLong(hex, 16)).toByteArray();
		//long it = byteArray;
		
	//	System.out.println(it);
		System.out.println(Long.valueOf(hex, 16));
	  //    BigInteger bigInt = BigInteger.valueOf(it);
			//System.out.println(bigInt);

		     // byte[] bytearray = (bigInt.toByteArray());
		      System.out.print("Byte Array : ");
		      for(int i = 0; i < byteArray.length; i++)
		      System.out.print(byteArray[i]+ "\t");
		   
//		for(int i = 0; i < hex.length(); i=i+2) {
//			System.out.println(Integer.parseInt(hex.substring(i,i+2), 16));
//		}
		
		
	 //i should get [1][2][3][4]	
	//Integer.parseInt(s)
	}

	private static int atoi(String s) {
		int countSign = 0;
		int sign = 1;
		int res = 0;
		s= s.replaceAll("^\\s*", "");
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '+') {
				if (s.charAt(i) == '-' || s.charAt(i) == '+') {
					if (countSign == 1)
						return 0;
					if (s.charAt(i) == '-') {
						sign = -1;
					}

					countSign++;
				}

				continue;
			} else if (Character.isLetter(s.charAt(i)))
				break;
			;

			while (i < s.length() && Character.isDigit(s.charAt(i))) {
				if (res * sign > Integer.MAX_VALUE / 10 || (res * sign == Integer.MAX_VALUE / 10
						&& Character.getNumericValue(s.charAt(i)) > 7))
					return Integer.MAX_VALUE;
				if (res * sign < Integer.MIN_VALUE / 10 || (res * sign == Integer.MIN_VALUE / 10
						&& Character.getNumericValue(s.charAt(i)) > 8))
					return Integer.MIN_VALUE;

				res = res * 10 + Character.getNumericValue(s.charAt(i));
				i++;
			}
			break;
		}
		return res * sign;
	}

}
