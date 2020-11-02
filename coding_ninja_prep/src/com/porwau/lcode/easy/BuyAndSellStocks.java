package com.porwau.lcode.easy;

public class BuyAndSellStocks {

	public static void main(String[] args) {
		System.out.println("Max profit is " + maxProfitBruteF(new int[] {7,1,5,3,6,3,10}));
		System.out.println("Max profit is " + maxProfitOnePass(new int[] {7,1,5,3,6,3,10}));

	}

	private static int maxProfitBruteF(int[] prices) {
		int profit = 0;
		for (int i = 0; i < prices.length;i++) {
			for(int j = i+1;j< prices.length; j++) {
				if(prices[j] > prices[i] && (prices[j] - prices[i]) > profit) {
					profit = prices[j] - prices[i];
				}
			}
		}
		return profit;
	}
	private static int maxProfitOnePass(int [] prices) {
		int minPrice = Integer.MAX_VALUE;
		int profit = 0;
		for (int i = 0; i < prices.length; i++) {
			if(prices[i] < minPrice) {minPrice = prices[i];}
			if(prices[i] - minPrice > profit) {
				profit = prices[i] - minPrice;
			}
		}
		return profit;
	}

}
