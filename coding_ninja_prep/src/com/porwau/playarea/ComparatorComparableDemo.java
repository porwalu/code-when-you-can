package com.porwau.playarea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Data implements Comparable<Data>{
	
	private String fN;
	private String lN;
	private int age;
	

	public Data(String fN, String lN, int age) {
		super();
		this.fN = fN;
		this.lN = lN;
		this.age = age;
	}
	
	@Override
	public int compareTo(Data o) {
		return fN.compareTo(o.fN);
	}

	public String getfN() {
		return fN;
	}

	public void setfN(String fN) {
		this.fN = fN;
	}

	public String getlN() {
		return lN;
	}

	public void setlN(String lN) {
		this.lN = lN;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Data [fN=" + fN + ", lN=" + lN + ", age=" + age + "]";
	}
	
//	public int compareTo(Data o) {
//		return lN.compareTo(o.lN);
//	}
	
	
}

class ComparebyFirstName implements Comparator<Data>{

	@Override
	public int compare(Data o1, Data o2) {
		// TODO Auto-generated method stub
		return o1.getfN().compareTo(o2.getfN());
	}
	
}

class ComparebyLastName implements Comparator<Data>{

	@Override
	public int compare(Data o1, Data o2) {
		// TODO Auto-generated method stub
		return o1.getlN().compareTo(o2.getlN());
	}
	
}

class ComparebyAge implements Comparator<Data>{

	@Override
	public int compare(Data o1, Data o2) {
		// TODO Auto-generated method stub
		return o1.getAge() - o2.getAge();
	}
	
}
public class ComparatorComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array = {"wtkarsh","vasu"};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array)); 
		
		Data d1 = new Data("Utkarsh", "Porwal",19);
		Data d2 = new Data("Ankur", "Sharma",20);
		List<Data> list = new ArrayList<>();
		list.add(d1);
		list.add(d2);
		Comparator cfn = new ComparebyFirstName();
		
		Comparator cln = new ComparebyLastName();

		Collections.sort(list, cfn);
		
		System.out.println(list);
		Collections.sort(list, cln);
		System.out.println(list);
		
		System.out.println(d2.compareTo(d1));
	//	Collections.sort(list, c);
		Comparator ca = (a,b)-> ((Data) a).getAge() - ((Data) b).getAge();
		Collections.sort(list, ca);
		System.out.println(list);
		
		Collections.sort(list, (a,b)-> a.getAge() - b.getAge());


		
		
		
	}

}
