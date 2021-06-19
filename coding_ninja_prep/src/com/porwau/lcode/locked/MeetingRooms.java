package com.porwau.lcode.locked;

import java.util.Arrays;

public class MeetingRooms {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[][]intervals = {{0,3},{5,10},{15,20}};
		System.out.println(canAttendMeetings(intervals));
	}
	
	
	
    private  static boolean canAttendMeetings(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b) ->Integer.compare(a[0],b[0]));

        for(int i = 0 ; i < intervals.length - 1; i++){
            if(intervals[i][1] > intervals[i+1][0] )
                return false;
        }
        return true;
        
    }

}
