package com.porwau.prep;


import java.util.Arrays;

//Problem: You are given a grid of size N×N that has the following specifications:
//Each cell in the grid contains either a policeman or a thief.
//A policeman can only catch a thief if both are in the same row.
//Each policeman can only catch one thief.
//A policeman cannot catch a thief who is more than K units away from the policeman.

//Write a program to find the maximum number of thieves that can be caught in the grid.
//
//Input format
//	
//First line: Two space-separated integers N and K
//Next N lines: N space-separated characters (denoting each cell in the grid)
//
//3 1 P T P T P T T T P
//
//Output format
//print the maximum number of thieves that can be caught in the grid.
//
//3
import java.util.Scanner;

public class ThiefAndPolice {

	public static void main(String[] args) {
		char[] grid = {'T', 'P', 'T'};		
		
		System.out.println("Enter details");
		Scanner scan = new Scanner(System.in);
		String[] line1 = scan.nextLine().split(" ");
		int n = Integer.parseInt(line1[0]);
		int k = Integer.parseInt(line1[1]);
		int counter = 0;
		char[][]grids = new char[n][n];
		while(counter <n) {
			String[] arr = scan.nextLine().split(" ");
			for(int i=0; i < arr.length;i++) {
				grids[counter][i] = arr[i].charAt(0);
			}
			counter++;
		}
		
		System.out.println("Finished entering inputs");
//		System.out.println("Num thieves "+  solution(grid,k));
		System.out.println("Num thieves "+  solution(grid,k));

		char[][]grid1= {{'P', 'T', 'P'},{'T', 'P', 'T'},{'T', 'T', 'P'}};
//		System.out.println(grid1.length);
//		System.out.println(grid1[0].length);

		int pi = -1, ti=-1;
		int totalThives=0;
		int thievesCount=0;
		for(int i = 0; i< grid.length; i++) {
			if(grid[i] == 'P') {
				if(ti==-1) {
					//either its the first police or the police following  police.-P,T,T,T or PP
					pi = i;//reset pi
				}else {//PTTP --
					//reset the Pi
					pi=i;
					totalThives+=thievesCount;
					thievesCount =0;
					ti=-1;
				}			
			}else {
				if(ti!=-1 && (i - pi > k)) {
					ti = ti+1;
				}else if(ti == -1){
					ti=i;
					thievesCount++;
				}else {
					thievesCount++;
				}
			}
		}
		System.out.println("Total thieves - " + (totalThives+thievesCount));
	}

	private static int solution(char[] grid, int k) {
		int totalThieves = 0;
		for(int i=0; i<grid.length;i++) {
			if(grid[i] == 'P') {
				int left = Math.max(0,i-k);
				int right = Math.min(grid.length-1, i+k);
				while(left <= right) {
					if(grid[left] == 'T') {
						totalThieves++;
						grid[left]='C';
						break;
					}else {
						left++;
					}
				}
			}
		}
		return totalThieves;
	}
}
