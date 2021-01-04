package com.porwau.concepts;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Vasu", 22);
		map.put("Ashu", 23);
		Set<String> set = map.keySet();
		for (String s : set) {

			System.out.println(s);
		}
		List<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		Map<String, Map<String, Object>> employee = new HashMap<>();
		Map<String, Object> profile = new HashMap<>();
		profile.put("Age", 23);
		profile.put("City", "Bangalore");
		employee.put("Vasu", profile);
		profile = new HashMap<>();
		profile.put("Age", 27);
		profile.put("City", "Bangalore");
		employee.put("Ashu", profile);
		System.out.println("Employee Details - " + employee);
		Set<String> prof = employee.keySet();
		Set<Map.Entry<String, Map<String, Object>>> mapping = employee.entrySet();
		
		for(String str : prof) {
			System.out.println(str + " details are " + employee.get(str));
		}
	}

}
