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
		// TODO Auto-generated method stub

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
		return cache.get(key);
	}

	public void set(int key, int value) {
		cache.put(key, value);
	}
	

	LRUCache(int capacity){
		this.capacity = capacity;
	}
	
}
