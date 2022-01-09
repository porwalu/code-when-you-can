package com.porwau.playarea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerAndBiConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> l1 = new ArrayList<>(Arrays.asList("1","2","3"));
		List<String> l2 = new ArrayList<>(Arrays.asList("4","5","6"));

		BiConsumer<List<String>, List<String>> biC = (l,m)->{
			System.out.println("Printing via Biconsumer");
			System.out.println("Printing List1");

			l.forEach(System.out::println);
			System.out.println("Printing List2");

			m.forEach(System.out::println);	
		};
		biC.accept(l1, l2);
		
		Consumer<List<String>> consumer = (l)->{
			System.out.println("Printing via consumer");
			l.forEach(System.out::println);

		};
		
		consumer.accept(l1);
	}

}
