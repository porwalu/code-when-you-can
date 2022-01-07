package com.porwau.playarea;

import java.util.PriorityQueue;

public class CIQ {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
//		System.out.println(CIQ.a);
//		System.out.println(CIQ.a);
  A a = new A();
  A b = new A();
	//	System.out.println("Found " + search2(arr, 5));
		
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		System.out.println();
		pq.add(11);
		pq.add(10);
		pq.add(22);
		pq.add(5);
		pq.add(12);
		pq.add(2);
		while(!pq.isEmpty()) {
		//	System.out.printf("%d",pq.remove());
		}
	}
	
//	 static int search2(int[] arr, int x) {
//		int i = 0;
//		int k = (int) Math.sqrt(arr.length);
//	
//		while (i < arr.length && arr[i]< x) 
//			i+=k;
//		while (arr[i] != x && --i%k!=0) 
//			i--;
//		return arr[i] == x?i:-1;
//	}
//	 
//	 int search() {
//		 return search2(new int[]{1,2},2);
//	 }

}

class A{
	static int a = 10;

	
	{
		System.out.print("Output 1");
	}
	
	static {
		System.out.print("Output 2");
	}
	A(){
		System.out.println("inside A constructor");
	}
}
