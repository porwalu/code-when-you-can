package com.porwau.lcode.easy;

public class BuyAndSellStocks {

	public static void main(String[] args) {
		System.out.println("Max profit is " + maxProfitBruteF(new int[] {7,6,4,3,1}));
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

}
