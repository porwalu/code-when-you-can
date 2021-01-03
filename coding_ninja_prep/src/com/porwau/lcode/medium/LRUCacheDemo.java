package com.porwau.lcode.medium;

import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * 146. LRU Cache Least Recently Used Cache. Here we evict the data which is
 * oldest.
 * 
 * @author Utkarsh Porwal
 *
 */
public class LRUCacheDemo {

	public static void main(String[] args) {
		LRUCache lc1 = new LRUCache(2);
		lc1.put(1, 1);
		lc1.put(2, 2);
		System.out.println(lc1.getOrDefault(1, -1));
		System.out.println(lc1.getOrDefault(2, -1));
		System.out.println("size " + lc1.size());
		lc1.put(3, 3);
		System.out.println("size " + lc1.size());

		System.out.println(lc1.getOrDefault(3, -1));
		System.out.println(lc1.getOrDefault(1, -1));

	}
}

class LRUCache extends LinkedHashMap<Integer, Integer> {
	private int capacity;

	LRUCache(int capacity) {
		super(capacity, .75F, true);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	@Override
	protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
		return size() > capacity;
	}
}
