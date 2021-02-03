package com.porwau.playarea;

import java.util.Iterator;
import java.util.LinkedList;

public class ChainedHashTable {
	
	private LinkedList<StoredEmployee>[] hashtable;

	public ChainedHashTable() {
		this(10);
	}
	public ChainedHashTable(int capacity) {
		hashtable = new LinkedList[capacity];
		for(int i = 0 ; i < hashtable.length; i++) {
			hashtable[i] = new LinkedList<StoredEmployee>();
		}

	}
	public int hashedkey(String key) {
		return key.length() % hashtable.length; 
	}
	public void put(String key, Emp emp) {
		hashtable[hashedkey(key)].add(new StoredEmployee(key, emp));
	}
	public Emp get(String key) {
		int hashedkey = hashedkey(key);
		Iterator<StoredEmployee> iterator = hashtable[hashedkey].iterator();
		while(iterator.hasNext()) {
			StoredEmployee tmp = iterator.next();
			if(tmp.key.equals(key)){
				return tmp.emp;
			}
		}
		return null;
	}
	
	public Emp remove(String key) {
		int hashedkey = hashedkey(key);
		Iterator<StoredEmployee> iterator = hashtable[hashedkey].iterator();
		while(iterator.hasNext()) {
			StoredEmployee tmp = iterator.next();
			if(tmp.key.equals(key)){
				hashtable[hashedkey].remove(tmp);
				return tmp.emp;
			}
		}
		return null;
	}
}
