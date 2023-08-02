package DSA;

import org.junit.Test;

import junit.framework.Assert;

public class BestTimeToBuyAndSellStock {
	
	/*
	 * ou are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
	 * 
	 * Input: int[]
	 * Output: int
	 * Traverse the int Array
	 * Check the least(buy) and most(sell) value pair combination 
	 * return most value
	 * if not found return 0
	 * 
	 */
	@Test
	public void Test1() {
		int bestBuy = mostProfit(new int[] {7,1,5,3,6,4});
		Assert.assertEquals(5, bestBuy);
	}
	
	@Test
	public void Test2() {
		int bestBuy = mostProfit(new int[] {7,6,4,3,1});
		Assert.assertEquals(0, bestBuy);
	}
	
	public int findBestTimeToBuyAndSellStock(int[] prices) {
		for(int i=0;i<prices.length;i++) {
			for(int j=i+1;j<prices.length;j++) {
				if(prices[j]>prices[i]) {
					return prices[j];
				}
			}
		}
		return 0;
	}
	
public int mostProfit(int[] prices) {
		
		int maxProfit=0;
		int tempProfit=0;
		int buyvalue=Integer.MAX_VALUE;		
		System.out.println(buyvalue);
		
		for (int i = 0; i < prices.length; i++) {
				
				if(prices[i]<buyvalue) {
					
					buyvalue=prices[i];
					
				}
				
				tempProfit=prices[i]-buyvalue;
				if(maxProfit<tempProfit) 
				{
					maxProfit=tempProfit;
				}
		}
		return maxProfit;
	}

}
