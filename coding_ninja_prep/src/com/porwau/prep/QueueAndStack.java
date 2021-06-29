package com.porwau.prep;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class MyClass<T>{
	
}
public class QueueAndStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Deque<Integer> queue = new ArrayDeque<>();
		queue.addLast(1);
		queue.addLast(2);
		
//		System.out.println(queue);
	//	System.out.println(queue.pop());
	//	System.out.println(queue.removeFirst());
		//queue.peek
		
		Map<String,String> map = new ConcurrentHashMap<>();
		
		map.put("Utkarsh", "porwal");
		map.put("mayank", "khanna");

		MyClass<String> myClass1 = new MyClass<String>(); 
		MyClass<? extends Object> myClass2 = new MyClass<Object>(); 
		myClass2=myClass1; // compilation error since MyClass<String> is not a MyClass<Object> 
		Object obj = new Object(); 
		obj = myClass1; // MyClass<T> parent is Object

		
	Iterator<Integer> iterator = queue.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}

	Integer i = 2;
	System.out.println(i.floatValue());

	List<Integer> li = new ArrayList<>();
	List<Float> lf = new ArrayList<>();
	
	li.add(1);li.add(2);li.add(3);
	lf.add(1.0F);lf.add(2.0F);lf.add(3.0F);
	
	System.out.println(sum(li));
	
    int value1 = 6;
    int result = ~value1;
    System.out.println("complement is " + result);
	
	}

	private static Number sum(List<? extends Number> li) {
		// TODO Auto-generated method stub
		return li.stream().mapToInt(p->p.intValue()).sum();
		//return null;
	}

}
