package com.porwau.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalsDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list = Arrays.asList("hello", "utkarsh", "llas", "vasu");
		List<Integer> listNum = Arrays.asList(1, 12, 14, 15);

		list.stream().filter(p -> p.startsWith("u")).forEach(System.out::println);
		System.out.println(listNum.stream().filter(n -> n % 2 == 0).max((a, b) -> Integer.compare(a, b)).orElse(0));
		
        String[] words = new String[10];
        words[0]="vasu";
//        String word = words[5].toLowerCase();  
//        System.out.print(word);
        Optional<String> checkNull = Optional.ofNullable(words[1]);
        if(checkNull.isPresent()) {
        	System.out.println(checkNull.get().toLowerCase());
        }else {
        	System.out.println("Null value");
        }

	}

}
