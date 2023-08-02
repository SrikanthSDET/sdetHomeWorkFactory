package DSA;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class DistributeCandies {
	
	@Test
	public void Test1() {
		int findNumberOfCandies = findNumberOfCandies(new int[] {1,1,2,2,3,3});
		Assert.assertEquals(3, findNumberOfCandies);
	}
	
	@Test
	public void Test2() {
		int findNumberOfCandies = findNumberOfCandies(new int[] {1,1,2,3});
		Assert.assertEquals(2, findNumberOfCandies);
	}
	
	@Test
	public void Test3() {
		int findNumberOfCandies = findNumberOfCandies(new int[] {6,6,6,6});
		Assert.assertEquals(1, findNumberOfCandies);
	}
	
	public int findNumberOfCandies(int[] n) {
		int Candies=1;
		int eatCandies = n.length/2;
		
		for(int i=0;i<n.length-1;i++) {//1,1,2,2,3,3
			if(n[i]!=n[i+1])
				Candies++;
		}
		
		if(eatCandies<Candies)
			return eatCandies;
		
		return Candies;
	}

}
