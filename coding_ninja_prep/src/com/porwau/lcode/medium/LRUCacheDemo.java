package com.porwau.lcode.medium;

import java.util.Map;
import java.util.HashMap;

/**
 * Least Recently Used Cache. Here we evict the data which is oldest.
 * 
 * @author Utkarsh Porwal
 *
 */
public class LRUCacheDemo {

	public static void main(String[] args) {
		LRUCache lc1 = new LRUCache(2);
		System.out.println("Getting value for " + lc1.get(2));
		lc1.set(1, 1);
		lc1.set(2, 2);
		System.out.println("Getting value for " + lc1.get(2));
	}
}
class LRUCache{
	private int capacity;
	Map <Integer,Integer> cache = new HashMap<>();

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public int get(int key) {
		//if exists in map
		return cache.containsKey(key) == true ? cache.get(key) : -1;
	}

	public void set(int key, int value) {
		//check for capacity before putting
		cache.put(key, value);
	}
	

	LRUCache(int capacity){
		this.capacity = capacity;
	}
	
}
