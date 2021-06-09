package com.porwau.datastructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		Collection<Integer> arrList = new ArrayList<Integer>();// default capacity is 10
	
		
		System.out.println("Default size is "+ arrList.size());// this doesn't return capacity but 
															   //size of underlying array

		ArrayList<Integer> arrList2 = new ArrayList<Integer>();
		
		arrList2.add(2);
		arrList2.add(3);
	Set<Integer> setNum = new HashSet<>();
	//setNum.
		arrList.add(1);
		System.out.println("Size now  is "+ arrList.size());
		arrList.addAll(arrList2);//add a collection to the original array list.
		System.out.println("Size now  is "+ arrList.size());
		System.out.println("iS LIST impacted? "+ arrList.removeAll(arrList2));//add a collection to the original array list.
		System.out.println("Size now  is "+ arrList.size());
		System.out.println("iS LIST impacted? "+ arrList.removeAll(arrList2));//add a collection to the original array list.

		
		arrList.clear();
		System.out.println("Size now  is "+ arrList.size());
		arrList.addAll(arrList2);
		Iterator<Integer> iter = arrList.iterator();
		while(iter.hasNext()){
		//	iter.remove();//removes from underlying collection the value returned by next.
		//	System.out.println(iter.next());
			iter.next();
		}

		System.out.println("done");
		System.out.println(arrList);




		
	}

}
