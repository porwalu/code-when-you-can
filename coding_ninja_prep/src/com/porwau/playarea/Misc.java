package com.porwau.playarea;

import java.util.Arrays;

public class Misc {
private static int numIsland = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[10][20];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		char[][] island = { { '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' } };
		
		System.out.println(Arrays.toString(island[0]));
		
		int rows = island.length;
		int columns = island[0].length;
		
		for(int i = 0; i<rows;i++) {
			for(int j = 0; j < columns;j++) {
				markIsland(i,j,island,false);
			}
		}
		System.out.println("Number of Island is " + numIsland);
	}

	private static void markIsland(int i, int j,char[][] island,boolean isNewIsland) {
		if(i<0 || j < 0||i >= island.length || j >= island[0].length) return;
		if (island[i][j] == '0') {
			return;
		}else if(island[i][j] == '2') {
			return;
		}else {
			island[i][j] = '2';
			if(!isNewIsland) {
				isNewIsland = true;
				numIsland+=1;
			}
				markIsland(i+1,j,island,isNewIsland);
				markIsland(i-1,j,island,isNewIsland);
				markIsland(i,j+1,island,isNewIsland);
				markIsland(i,j-1,island,isNewIsland);				
				
		}		
	}

}
