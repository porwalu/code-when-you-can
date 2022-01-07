package com.porwau.prep;

import java.util.Scanner;

public class TNPDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Grid dimension and units:");
		String[] arr = scan.nextLine().split(" ");
		int gridsize = Integer.parseInt(arr[0]);
		int k = Integer.parseInt(arr[1]);
		String[][] grid = new String[3][3];

		for (int i = 0; i < gridsize; i++) {
			System.out.println("Enter police/thief details for gridrow " + (i + 1) + ":");
			String[] tp = scan.nextLine().split(" ");
			grid[i][0] = tp[0];
			grid[i][1] = tp[1];
			grid[i][2] = tp[2];
		}
		System.out.println("done with the grid");*/
		String[][] grid1 = { { "P", "T","P", "T" }, { "T", "P", "T","T" }, { "T", "T", "P","P" } };
		int k = 2;
		System.out.println("Max thieves " + catchThieves(grid1, k));

	}

	private static int catchThieves(String[][] grid, int k) {
		int thiefCounter = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				int left = 0;
				int right = 0;
				if (grid[i][j].equals("P")) {
					left = Math.max(0, j - k);
					right = Math.min(grid[i].length - 1, j + k);
					while (left <= right) {
						if (grid[i][left].equals("T")) {
							grid[i][left] = "C";
							thiefCounter++;
							break;
						}
						left++;
					}
				}
			}
		}
		return thiefCounter;
	}
}
