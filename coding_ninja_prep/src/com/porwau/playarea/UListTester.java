package com.porwau.playarea;




class UList<T>{
	private T[] arr;
	int[] arr1 = new int[10];
	private static int DEFAULT_CAPACITY = 10;
	public UList() {		
		this(DEFAULT_CAPACITY);
	}
	
	public UList(int capacity) {
		arr = (T[]) new Object[capacity];
	}
}
public class UListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UList<Integer> ul = new UList<>();
		
		int[] arr  = new int[10];
		System.out.println(arr[2]);
		

	}

}
