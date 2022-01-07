package com.porwau.prep;

import java.util.Iterator;
import java.util.LinkedList;

class CHash<K,V>{
	
	private static final int DEFAULT_CAPACITY = 5;
	LinkedList<StoredEmployee<K,V>>[] chash ;


	public CHash() {
		this(DEFAULT_CAPACITY);
	}
	
	public CHash(int capacity) {
		chash = new LinkedList[capacity];
		for(int i = 0 ; i < chash.length; i++) {
			chash[i] = new LinkedList<StoredEmployee<K,V>>();
		}
	}

	public void put(K key, V value) {
		int bucket = hashkey(key);
//		System.out.println("bucket:"+bucket);
			chash[bucket].add(new StoredEmployee(key,value));		
	}

	private int hashkey(K key) {
		// TODO Auto-generated method stub
		return ((String)key).length() % chash.length; 
	}

	public void traverse() {
		for(int i = 0; i < chash.length;i++) {
			chash[i].forEach(p->System.out.print(p.key + ":" + p.value+"->"));
			System.out.print("null \n");
		}
	}
	
	
	public V get(K key) {
		int bucket = hashkey(key);
		Iterator<StoredEmployee<K,V>> iter= chash[bucket].iterator();
		while(iter.hasNext()) {
			StoredEmployee<K,V> emp = iter.next();
			if(emp.key.equals(key)) return emp.value;
		}
		System.out.println("Doesnt exist");
		return null;
	}

}
public class CHashDemo {

	public static void main(String[] args) {
		CHash<String,Employee> chash = new CHash<>();

		chash.put("101726", new Employee("utkarsh1", "porwal", 25));
		chash.put("1027221", new Employee("Vasu", "porwal", 26));
		chash.put("103725", new Employee("Utkarsh", "porwal", 27));
		chash.put("10373211", new Employee("Utkarsh", "porwal", 27));
		
		System.out.println(chash.get("1017206"));

		
//		chash.traverse();
		//System.out.println(chash.get("rawat"));
	}

}
