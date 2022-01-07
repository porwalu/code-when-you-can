package com.porwau.prep;

import java.util.HashMap;
import java.util.Map;

import javax.naming.ldap.HasControls;

class StoredEmployee<K, V> {
	K key;
	V value;

	public StoredEmployee(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StoredEmployee other = (StoredEmployee) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

}

class Employee {

	private String fName;
	private String lName;
	private int age;

	public Employee(String fName, String lName, int age) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", age=" + age + "]";
	}

}

class HMap<K, V> {

	StoredEmployee<K, V>[] hmap = new StoredEmployee[6];

	void put(K key, V value) {
		int bucket = hashkey(key);
		if (hmap[bucket] != null) {
			if (hmap[bucket].key.equals(key)) {
				hmap[bucket] = new StoredEmployee(key, value);
			} else {
				System.out.println("Collission Occurred: Trying liner probing..");
				int startIndex = (bucket +1) % hmap.length;
				int stopIndex = bucket;
				while(startIndex !=stopIndex) {
					if(hmap[startIndex] == null) {
						hmap[startIndex] = new StoredEmployee(key, value);
						return;
					}
					startIndex = (startIndex +1) % hmap.length;
				}
				System.out.println("HashMap is full");
			}
		}
		hmap[bucket] = new StoredEmployee(key, value);
	}

	private int hashkey(K key) {
	//	return Math.abs(key.hashCode()) % hmap.length;
		return ((String) key).length() % hmap.length;
	}

	public V get(K key) {
		int bucket = findKey(key);
		return bucket==-1 ? null:hmap[bucket].value;
	}

	public boolean containsKey(K key) {
		//int bucket = hashkey(key);
		return findKey(key) == -1 ? false:true;
//		if (hmap[bucket] == null || !hmap[bucket].key.equals(key))
//			return false;
//		return true;
	}

	void printHashMap() {
		for (int i = 0; i < hmap.length; i++) {
			if (hmap[i] != null) {
				System.out.println(hmap[i].key + ":" + hmap[i].value);
			}
		}
	}

	public V remove(K key) {
		//int bucket = hashkey(key);
//		if(!containsKey(key)) {
//			System.out.println("nothing is present here");
//			return null;
//		}
		int bucket = findKey(key);
		if(bucket == -1) return null;
		V remVal = hmap[bucket].value;
		hmap[bucket] = null;
		return remVal;
	}
	
	public int findKey(K key) {
		int bucket = hashkey(key);
		int start;
		int stop;
		if (hmap[bucket] == null) {
			System.out.println("Nothing at regular place. Linear probe");
			stop = bucket;
			start = (bucket +1)%hmap.length;
			while(start != stop) {
				if(hmap[start]!= null && hmap[start].key.equals(key)) {
					return start;
				}
				start = (++start)%hmap.length;
			}
		}else {
			//check if it has same key
			System.out.println("Something regular place. verify if its same");

			if(hmap[bucket].key.equals(key)) {
				System.out.println("at same place and same key");
				return bucket;
			}else {
				//this is a collission - i need to traverse
				System.out.println("Not same  so - Linear probe");

				stop = bucket;
				start = (bucket +1)%hmap.length;
				while(start != stop) {
					if(hmap[start].key.equals(key)) {
						return start;
					}
					start = (++start)%hmap.length;
				}
			}
		}
		
		return -1;
	}
}

public class HMapDemo {
	public static void main(String[] args) {
		HMap<String, Employee> hm = new HMap<>();
		hm.put("101726", new Employee("utkarsh", "porwal", 35));
//		System.out.println(hm.findKey("1017167891"));

		//System.out.println(hm.get("101726"));

		hm.put("101726", new Employee("utkarsh1", "porwal", 35));
		hm.put("1017161", new Employee("Vasu", "porwal", 35));
		hm.put("10171623", new Employee("Vasu", "porwal", 35));

		hm.put("101716456", new Employee("Vasu", "porwal", 35));

		hm.put("1017167890", new Employee("Vasu", "porwal", 35));
		hm.put("1017167891", new Employee("Vasu", "porwal", 35));
//		hm.put("101716789012", new Employee("Vasu", "porwal", 35));


//		hm.put("101726", new Employee("utkarsh1", "porwal", 35));
//
//		System.out.println(hm.get("101726"));
		hm.printHashMap();
		
//		System.out.println(hm.findKey("101726"));
//		System.out.println(hm.findKey("1017167891"));
		
	//	System.out.println(hm.remove("abc"));
		//System.out.println(hm.remove("1017167891"));

	//	hm.printHashMap();

	System.out.println(hm.remove("1017167891"));
//		hm.printHashMap();
	hm.put("1017167891", new Employee("Vasu", "porwal", 35));
	hm.printHashMap();

	}
}
