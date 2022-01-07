package com.porwau.prep;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class TestThieves {

	public static void main(String[] args) {		
		//char[][]grid= {{'P', 'T', 'P'},{'T', 'P', 'T'},{'T', 'T', 'P'}};
		LinkedList<String> ll = new LinkedList<>();
		
		
		BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
		//BufferedInputStream b = new BufferedInputStream(System.in);

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
		System.out.println("Num thieves "+  solution(grids,k));

	}

	private static int solution(char[][] grid, int k) {
		int totalThieves=0;
		for(int row=0; row< grid.length; row++) {
			for(int i=0; i<grid.length;i++) {
				if(grid[row][i] == 'P') {
					int left = Math.max(0,i-k);
					int right = Math.min(grid.length-1, i+k);
					while(left <= right) {
						if(grid[row][left] == 'T') {
							totalThieves++;
							grid[row][left]='C';
							break;
						}else {
							left++;
						}
					}
				}
			}
		}
		return totalThieves;
	}	
}
