package com.porwau.prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CAtorAndCable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Stu> list = new ArrayList<>();
		list.add(new Stu("Utkarsh","Porwal",22));
		list.add(new Stu("Ram","Kapoor",23));
		list.add(new Stu("Shyam","Benegal",54));
		Integer[] arr = {3,12,4,3,11};

		Arrays.sort(arr, (a,b)->Integer.compare(a, b));
		Arrays.asList(arr).forEach(System.out::println);
		System.out.println(Arrays.toString(arr));
		System.out.println(new Stu("Utkarsh","Porwal",22).compareTo(new Stu("Ram","Kapoor",23)));
		
		list.sort(new CfName());
		System.out.println("By first name "); list.stream().forEach(System.out::println);
		
		list.sort((o1, o2) -> o2.getlName().compareTo(o1.getlName()));
		System.out.println("By Last name "); list.stream().forEach(System.out::println);
		//list.stream().for
		System.out.println(list.toArray()[0]);
		list.sort(new CAge());
		System.out.println("By Age"); list.stream().forEach(System.out::println);
		
	}

}


class Stu implements Comparable<Stu>{
	
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
	public Stu(String fName, String lName, int age) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}
	private String fName;
	private String lName;
	private int age;
	@Override
	public int compareTo(Stu o) {
		return fName.compareTo(o.fName);
	}
	
	@Override
	public String toString() {
		return "Stu [fName=" + fName + ", lName=" + lName + ", age=" + age + "]";
	}

}


class CfName implements Comparator<Stu>{

	@Override
	public int compare(Stu o1, Stu o2) {
		// TODO Auto-generated method stub
		return o1.getfName().compareTo(o2.getfName());
	}
	
}

//class ClName implements Comparator<Stu>{
//
//	@Override
//	public int compare(Stu o1, Stu o2) {
//		// TODO Auto-generated method stub
//		return o1.getlName().compareTo(o2.getlName());
//	}
//	
//}

class CAge implements Comparator<Stu>{

	@Override
	public int compare(Stu o1, Stu o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getAge(),o2.getAge());
	}
	
}