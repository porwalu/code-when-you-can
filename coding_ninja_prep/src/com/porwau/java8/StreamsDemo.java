package com.porwau.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list = Arrays.asList("hello", "utkarsh", "ullas", "vasu");
		List<Integer>listNum = Arrays.asList(1,12,14,15);

	list.stream().filter(p -> p.startsWith("u")).forEach((p)->System.out.println(p));
	//list.stream().filter(p -> p.startsWith("u")).forEach((p)->System.out.println(p));


	}

}
