package com.porwau.problemsolving;

/**
 * This program takes time in hh:mm format and returns the angle in degree
 * between the hour and min hand. <br>
 * Assumptions : hh is between 1 - 12
 * 
 * @author Utkarsh Porwal
 *
 */
public class ClockAngleCalculator {

	/**
	 * @param time - Time in hh:mm format
	 */
	static void findAngle(String time) {
		String[] timeParts = time.split(":");
		int hrs = Integer.parseInt(timeParts[0]);
		int minutes = Integer.parseInt(timeParts[1]);// parseInt gives int, valueOf gives Integer
		if ((hrs < 1 || hrs > 12|| minutes < 0 || minutes > 59)) {//Checks invalid time
			System.out.println("Invalid time!! Please enter in hh:mm format");
			return;
		}
		float deltaHrDegree = minutes * .5F;//because hr hand would have moved depending on minutes elasped.
		
		if (hrs == 12 && minutes == 0) {
			minutes = 60;
		}
		System.out.println("Angle b/w the clock hands at " + time + " is "
				+ Math.abs(minutes * 6 - (hrs * 30 + deltaHrDegree)) + " degree.");

	}

	public static void main(String[] args) {
		String time = "12:60";
		findAngle(time);
	}
}
//Time  and Space complexity = O(1)