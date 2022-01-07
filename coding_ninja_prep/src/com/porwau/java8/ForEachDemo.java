package com.porwau.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ForEachDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list = Arrays.asList("hello", "utkarsh", "llas", "vasu");
		List<Integer> listNum = Arrays.asList(10, 12, 14, 150);

		Map<String, String> map = new HashMap<>();
		map.put("utkarsh", "porwal");
		map.put("vasu", "porwal");

		Iterator<Entry<String, String>> iter1 = map.entrySet().iterator();
		Iterator<Entry<String, String>> iter = map.entrySet().iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next().getKey());
//		}

		// list.forEach(p->System.out.println(p));


		list.forEach(System.out::println);
		
		list.stream().filter(p->p.startsWith("u")).forEach(System.out::println);
		Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(listNum.stream().filter(n->n%2!=0).max((a,b)->Integer.compare(a, b)).orElse(0));
//

//		Stream<String> filterStream = list.stream().filter(p -> p.startsWith("u"));
//		
//		System.out.println(list.stream().filter(p -> p.startsWith("u")).equals("utkarsh"));
//		
//		System.out.println(listNum.stream().filter(n->n%2==0).max((a,b)->Integer.compare(a, b)));

		// System.out.println(filterStream.count());// this closes stream and cant be
		// executed again.
		// System.out.println(filterStream.count());// this will give exception.

	}
}
