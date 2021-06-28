package com.porwau.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();

		list = Arrays.asList("hello", "utkarsh", "llas", "vasu");
		List<Integer>listNum = Arrays.asList(1,12,14,15);

		
		list.forEach(p->System.out.println(p));
		list.forEach(System.out::println);


//		Stream<String> filterStream = list.stream().filter(p -> p.startsWith("u"));
		
		System.out.println(list.stream().filter(p -> p.startsWith("u")).equals("utkarsh"));
		
		System.out.println(listNum.stream().filter(n->n%2==0).max((a,b)->Integer.compare(a, b)));
		

		//System.out.println(filterStream.count());// this closes stream and cant be executed again.
		//System.out.println(filterStream.count());// this will give exception.

	}
}
