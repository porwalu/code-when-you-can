package com.porwau.interviewquestions;

import java.util.Arrays;

public class ClockAngleCalculator {

	static float findAngle(String time) {
		String[] timeParts = time.split(":");
		int hrs = Integer.parseInt(timeParts[0]);
		int minutes = Integer.parseInt(timeParts[1]);// parseInt gives int, valueOf gives Integer
		float deltaHrDegree = minutes * .5F;
		if (hrs == 12 && minutes == 0) {
			minutes = 60;
		}
		return Math.abs(minutes * 6 - (hrs * 30 + deltaHrDegree));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String time = "1:59";
		System.out.println("Angle b/w the clock hands at " + time + " is " + Math.abs(findAngle(time)) + " degree.");
	}
}
//Time  and Space complexity = O(1)