package com.porwau.prep;

import java.util.HashMap;
import java.util.Map;

class StoredEmployee {

	Employee e;
	String key;

	public StoredEmployee(String key, Employee e) {
		super();
		this.e = e;
		this.key = key;
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

class HMap {
	StoredEmployee[] employees = new StoredEmployee[6];

//keyfname
	void put(String key, Employee employee) {
		int bucket = hashKey(key);
		if (employees[bucket] == null) {
			employees[bucket] = new StoredEmployee(key, employee);
		//	employees[bucket].key = key;
			System.out.println("Inserting Key - " + key);

		} else {
			if(employees[bucket].key.equals(key)) {
				System.out.println("Update value for :" + key);
				employees[bucket] = new StoredEmployee(key, employee);
			}else {
				System.out.println("bucket already occupied. Collision");
			}
		}
	}

	StoredEmployee get(String key) {

		int bucket = hashKey(key);
		if (employees[bucket] == null) {
			System.out.println("Data doesnt exist with this key");
			return null;
		}
		return employees[bucket];
	}

	boolean containsKey(String key) {

		int bucket = hashKey(key);
		if (employees[bucket] == null) {
			return false;
		}
		return true;
	}

	private int hashKey(String key) {
		// TODO Auto-generated method stub
		return key.length() % employees.length;
	}

	public StoredEmployee remove(String key) {
		int bucket = hashKey(key);
		if (employees[bucket] == null) {
			System.out.println("Can't Remove!! Data doesnt exist with this key");
			return null;
		}
		StoredEmployee e = employees[bucket];
		employees[bucket] = null;
		System.out.println("Removed : " + key);
		return e;
	}
}

public class HMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();

		HMap emap = new HMap();
		emap.put("utkarsh", new Employee("utkarsh", "porwal", 25));
		System.out.println(emap.get("utkarsh").e);
	emap.put("utkarsh", new Employee("Vasu", "porwal", 25));
	System.out.println(emap.get("utkarsh").e);
//
//		System.out.println(emap.containsKey("utkarsh"));
//		System.out.println(emap.get("utkarsh"));
//		System.out.println(emap.get("vasu"));
//		System.out.println(emap.containsKey("utkar2sh"));
//		
//		emap.remove("utkarsh");
//		emap.put("porwalu", new Employee("Vasu", "porwal", 25));
//

	}

}
