package com.porwau.concepts.io;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class EncodeDecode {
	public static void main(String args[]) {
		char c = 'a';
		System.out.println((int) c);
		System.out.println(String.format("0x%08X", (int) c));// 0x is prefix, x/X after percent is for hex conversion, 8
																// is to show how the length and 0 before 8
		// is to pad with 0s

	//	showEncoding("a");
		//showEncoding("€"); 
		showEncoding("\u1F602");
	}

	private static void showEncoding(String symbol) {
		System.out.println("Inside showEncoding");
		try {
			System.out.println(symbol.charAt(0));
			System.out.println(symbol);

			System.out.println(Arrays.toString(symbol.getBytes("US-ASCII")));//getBytes return ByteArray, ASCII cant show it.
			System.out.println(Arrays.toString(symbol.getBytes("UTF-8")));//1-4 Bytes
			System.out.println(Arrays.toString(symbol.getBytes("UTF-16")));//2 - 4  bytes

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
