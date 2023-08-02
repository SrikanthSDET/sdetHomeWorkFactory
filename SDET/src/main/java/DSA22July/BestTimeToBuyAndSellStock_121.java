package DSA22July;

import org.junit.Test;

import junit.framework.Assert;

public class BestTimeToBuyAndSellStock_121 {
	
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
	
	
	
public int mostProfit(int[] prices) {
		
		int maxProfit=0;
		int tempProfit=0;
		int buyvalue=Integer.MAX_VALUE;				
		
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
