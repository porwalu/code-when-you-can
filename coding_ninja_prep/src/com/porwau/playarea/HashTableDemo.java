package com.porwau.playarea;

import java.util.HashMap;
import java.util.Map;

class HashT {
	private StoredEmployee[] hashtable;

	public HashT() {
		hashtable = new StoredEmployee[6];
	}


	public boolean containsKey() {
		return true;
	}

	public int hashKey(String key) {
		return key.length() % hashtable.length;
	}

	public void put(String key, Emp emp) {
		int index = hashKey(key);
		// Emp tmp = hashtable[index];
		
		StoredEmployee st = new StoredEmployee(key, emp);
		if (!occupied(index)) {
			System.out.println("Can put at index " + index + " for key " + key);
			hashtable[hashKey(key)] = st;
		} else {// Linear probing for put

			System.out.println("Collision occurred at index " + index + " for key " + key + " , finding another place");
			int stopIndex = index;// we will loop to look for an empty space or if we reach the same index,
									// meaning table is full.
			index = ++index % hashtable.length;
			while (index != stopIndex) {
				if (!occupied(index)) {
					System.out.println("Found an empty location at index " + index);
					hashtable[index] = st;
					return;
				}
				index = ++index % hashtable.length;
			}
			System.out.println("Hashtable is full. Can't find empty space.");
		}
	}

	public StoredEmployee get(String key) {
		int keyIndex = findKey(key);
		return keyIndex == -1 ? null : hashtable[keyIndex];
	}
	public boolean containsKey(String key) {
			int keyIndex = findKey(key);
			return keyIndex == -1 ? false : true;	
		}
	@Override
	public boolean equals(Object o) {
		return true;
	}

	private int findKey(String key) {
		StoredEmployee tmp = hashtable[hashKey(key)];
		int index = hashKey(key);
		int stopIndex = index;// we will loop to look for an empty space or if we reach the same index,
								// meaning table is full.
		if (tmp == null) {// Ensure it really is not there
			System.out.println("Using liner probing");
			// int stopIndex = index;
			index = ++index % hashtable.length;
			while (index != stopIndex) {
				if (occupied(index) && key.equals(hashtable[index].key)) {
					return index;
				}
				index = ++index % hashtable.length;
			}
			System.out.println("Not found");
			return -1;
		} else {
			System.out.println("we have somme value");
			if (key.equals(hashtable[index].key)) {// even if key is found we need to make sure its equal
				System.out.println("we have found the equal key and can return");

				return index;
			} else {
				System.out.println("keys unequal - linear probing");

				index = ++index % hashtable.length;
				while (index != stopIndex && occupied(index)) {
					if (key.equals(hashtable[index].key)) {
						System.out.println("Found the key during linear probing");
						return index;
					}
					index = ++index % hashtable.length;
				}
				System.out.println("Not found");
				return -1;
			}
		}
		// return null;
	}
	

	public void printHashTable() {
		System.out.println("Printing hashtable");
		for (int i = 0; i < hashtable.length; i++) {
			System.out.println(hashtable[i]);
		}
	}

	public boolean occupied(int index) {
		return hashtable[index] != null;
	}
	
	public Emp remove(String key) {
		int keyIndex = findKey(key);
		if(keyIndex != -1) {
			Emp tmp = hashtable[keyIndex].emp;
			hashtable[keyIndex] = null;
			return tmp;
		}else {
			return null;
		}
	}

}

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<>();
	
		// map.remove(key)
		HashT empHash = new HashT();

		empHash.put("porwal", new Emp(1, "utkarsh", "porwal"));
		empHash.put("khanna", new Emp(1, "mayank", "khanna"));
		empHash.put("singh", new Emp(1, "sachin", "singh"));
		empHash.put("rawat", new Emp(1, "ashu", "rawat"));
		empHash.put("baroni", new Emp(1, "lily", "baroni"));
		System.out.println(empHash.get("rawat1"));
		empHash.printHashTable();
		System.out.println(empHash.containsKey("singh"));
		System.out.println(empHash.remove("porwal1"));
	}

}
