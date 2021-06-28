package com.porwau.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();

		list = Arrays.asList("hello", "utkarsh", "ullas", "vasu");

		Stream<String> filterStream = list.stream().filter(p -> p.startsWith("u"));
		System.out.println(filterStream.count());// this closes stream and cant be executed again.
		System.out.println(filterStream.count());// this will give exception.

	}
}
