/*
Problem: You are given a grid of size NXN that has the following specifications: 
Each cell in the grid contains either a policeman or a thief. 
A policeman can only catch a thief if both are in the same row. 	
Each policeman can only catch one thief. 
	
A policeman cannot catch a thief who is more than K units away from the policeman. 
Write a program to find the maximum number of thieves that can be caught in the grid. 

Input format 

First line: Two space-separated integers N and K 
	
Next - Nlines:N space-separated characters (denoting each cell in the grid) 
	
Output format 
 print the maximum number of thieves that can be caught in the grid. 


SAMPLE INPUT
SAMPLE OUTPUT

3 1 P T P T P T T T P
3
 * 
 */


package com.porwau.prep;

import java.util.Scanner;

public class ThievesPoliceDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N and K");
		String[] line1 = scan.nextLine().split(" ");
		int rows = Integer.parseInt(line1[0]);
		int k = Integer.parseInt(line1[1]);
		System.out.println("Rows " + rows + " .K is " + k);
		char[][] grid = new char[rows][rows];
		for(int i = 0; i < rows; i++) {
			System.out.println("Enter grid line " + i+":");
			String[] gridLine = scan.nextLine().split(" ");
			for(int j = 0 ; j< gridLine.length;j++) {
				grid[i][j] = gridLine[j].charAt(0);
			}
		}
		System.out.println("Done creating grid");
		System.out.println("Number of thieves " + findThieves(grid,k));
	}

	private static int findThieves(char[][] grid, int k) {
		int totThieves = 0;
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				if(grid[i][j] == 'P') {
					int left = Math.max(0,j-k);
					int right = Math.min(grid[0].length - 1, j+k);
					while(left <= right ) {
						if(grid[i][left] == 'T') {
							totThieves +=1;
							grid[i][left] ='D';
							break;
						}
						left++;
					}
				}
			}
		}
		return totThieves;
	}

}
