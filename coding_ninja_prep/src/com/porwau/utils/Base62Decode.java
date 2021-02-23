package com.porwau.utils;

import java.util.Calendar;
import java.util.Date;

public class Base62Decode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int decodeThis = 1234568688;
String base62Encode = toBase62(decodeThis);
System.out.println(base62Encode);

	}

	private static String toBase62(int decodeThis) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder();
		String base62="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";// as per ascii values
		while(decodeThis !=0) {
		s=s.append(base62.charAt(decodeThis%62));
		decodeThis/=62;
		}
		
		 Date from = new Date();
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, 1000);
		Date to = cal.getTime();
		
		return s.reverse().toString();
	}

}
