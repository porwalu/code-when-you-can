package com.porwau.designpattern.singleton;

class Student {
//	private static Student stu = new Student(101726, "Utkarsh");//Eager Instantiation 
	private int rollNum;
	private String name;
	private static Student stu;

	private Student(int rn, String name) {
		rollNum = rn;
		this.name = name;
	}

	private Student() {
		// TODO Auto-generated constructor stub
	}

	static Student getInstance() {
		return stu;
	}

	public static synchronized Student getInstanceSingleton() {// thread safe but can cause bad performance since this
		// method should be synchronized only for the first time.
		if (stu == null) {
			stu = new Student(101726, "Utkarsh");
		}
		return stu;
	}

	public static synchronized Student getInstanceSingletonDoubleCheck() {// Best
		if (stu == null) {
			synchronized(Student.class) {
				if (stu == null) {
					stu = new Student(101726, "Utkarsh");
				}
			}
		}
		return stu;
	}

	public String toString() {
		return name + " " + rollNum;
	}
}

public class SingletonDemo {

	public static void main(String[] args) {

		System.out.println(Student.getInstance());
		System.out.println(Student.getInstance());
		System.out.println(Student.getInstanceSingleton());

		// Student s = new Student();// - this is not allowed in singleton.
		System.out.println(Boolean.valueOf("true ".trim()));
		StringBuilder sb = new StringBuilder("N");
	sb.append("s");
	sb.replace(0, sb.length(), "HI");
	System.out.println(sb);
	}

}
