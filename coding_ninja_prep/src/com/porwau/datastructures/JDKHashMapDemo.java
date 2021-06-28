package com.porwau.datastructures;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class JDKHashMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> treemap = new TreeMap<>();
		treemap.put(10, "utkarsh");
		treemap.put(5, "vasu");
		treemap.put(1, "ashu");
		treemap.put(11, "rahul");
		treemap.put(4, "mayank");
		
		for(Entry<Integer, String> set:treemap.entrySet()) {
			System.out.println(set.getKey() + " " + set.getValue());
		}

		Map<Integer,String> syncmap = Collections.synchronizedMap(treemap);
	}

}
