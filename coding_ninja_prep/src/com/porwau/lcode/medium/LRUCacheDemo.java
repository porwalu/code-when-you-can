package com.porwau.lcode.medium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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
		//this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	@Override
	protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
		return size() > capacity;
	}
	
	public int get(int key) {
		return super.get(key)==null? -1 : super.get(key);		
	}
	
	public void put(int key,int value) {
		super.put(key, value);		
	}
}

class LRUCache2 {
	private int capacity;
	private int size;
	Map<Integer, DLinkNode> cache = new HashMap();
	DLinkNode head, tail;

	class DLinkNode {
		public DLinkNode(int key, int value) {
			this.key = key;
			this.value = value;
		}

		public DLinkNode() {
		}

		DLinkNode next;
		DLinkNode prev;
		int key;
		int value;
	}

	public int get(int key) {
		// if doesn't exist, return -1, else return value and update the position.
		DLinkNode node = cache.get(key);
		if (node == null) {
			return -1;
		} else { // return value and update the position.
			makeLatest(node);
			return node.value;
		}
	}

	private void makeLatest(DLinkNode accessNode) {
		accessNode.prev.next = accessNode.next;
		accessNode.next.prev = accessNode.prev;
		head.next.prev = accessNode;
		accessNode.next = head.next;
		head.next = accessNode;
		accessNode.prev=head;
	}

	public void put(int key, int value) {
		// if exists
		DLinkNode node = cache.get(key);

		if (node != null) {
			node.value = value;// update Node
			// cache.put(key,cache.get(key) );//update cache.//not needed as we have changed
			// the node
			makeLatest(node);
		} else {// new value
			DLinkNode newNode = addNode(key, value); // add latest Node
			cache.put(key, newNode);// update map
			if (size > capacity)  //  more than capacity
				// remove the one before tail.
				cache.remove(tail.prev.key);
				removeTail(tail.prev);
			}
		}

	private DLinkNode addNode(int key, int value) {
		// TODO Auto-generated method stub
		DLinkNode newNode = new DLinkNode(key, value);
		newNode.next = head.next;
		newNode.prev = head;
		head.next.prev = newNode;
		head.next = newNode;
		++size;
		return newNode;

	}

	private void removeTail(DLinkNode oldNode) {
		tail.prev = oldNode.prev;
		oldNode.prev.next = tail;
		--size;
	}
}