package com.porwau.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptionalsDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list = Arrays.asList("hello", "utkarsh", "llas", "vasu");
		List<Integer>listNum = Arrays.asList(1,12,14,15);

//		Stream<String> filterStream = list.stream().filter(p -> p.startsWith("u"));
		
//		System.out.println(list.stream().filter(p -> p.startsWith("u")).equals("utkarsh"));
		list.stream().filter(p -> p.startsWith("u")).forEach(System.out::println);
	
		System.out.println(listNum.stream().filter(n->n%2==0).max((a,b)->Integer.compare(a, b)));
		

	}

}
