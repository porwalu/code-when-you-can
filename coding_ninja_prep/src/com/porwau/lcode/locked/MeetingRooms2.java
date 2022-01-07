package com.porwau.lcode.locked;

import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
//253	Meeting Rooms II 
public class MeetingRooms2 {

	public static void main(String[] args) {
		int[][]intervals = {{7,10},{2,40}};
		
		System.out.println(numberOfRooms(intervals));
		
	}

	private static int numberOfRooms(int[][] intervals) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(intervals[0][1]);
		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i][0] >= pq.peek()) {
				pq.poll();
			}
			pq.add(intervals[i][1]);
		}
		return pq.size();
	}
}
