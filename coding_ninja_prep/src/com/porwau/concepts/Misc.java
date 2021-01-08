package com.porwau.concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Misc implements Comparable{

	protected int major;
	protected int[] minors;
	protected int update;
	
	 Misc (int major, int... minors){
        this.major = major;
        System.out.println(major + " and minors length " + minors.length);
        if (minors.length == 0) {
            this.minors = minors;
            this.update = 0;
        }
        else {
        	this.minors = new int[minors.length -1];
        	this.update = minors[minors.length -1];
        	for(int i = 0; i < minors.length -1 ; i++) {	
        		this.minors[i] = minors[i];
        	}
        }
        System.out.println("minors are - " + Arrays.toString(this.minors) + " , update is " + update);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Misc v1 = new Misc(5,1,1,1);
		Misc v2 = new Misc(4,1,1,1);
		System.out.println(v1.compareTo(v2));
		List<Misc> li = new ArrayList<>();
		
		li.add(v1);
		li.add(v2);
		for(Misc i: li) {
			System.out.println("major " + i.major + " minor " + Arrays.toString(i.minors) + " update " + i.update);
		}
		Collections.sort(li);
		for(Misc i: li) {
			System.out.println("major " + i.major + " minor " + Arrays.toString(i.minors) + " update " + i.update);
		}

	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Misc i = (Misc)o;
		if(major == i.major && update == i.update) {return 0;}
		else {return -1;}
	}

}
