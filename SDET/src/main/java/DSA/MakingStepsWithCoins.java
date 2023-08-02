package DSA;

import org.junit.Test;

import junit.framework.Assert;

public class MakingStepsWithCoins {
	/*
	 * Input : Int (no of Coins)
	 * Output: Int (no of Complete Steps)
	 * Loop through the total coins
	 * Increase the Steps and reduce the coins 
	 * return the completed steps
	 */
	@Test
	public void Test1() {
		int actSteps = findSteps2(6);
		Assert.assertEquals(3, actSteps);
	}
	// using for loop
	public int findSteps(int n) {
		int steps=0;
		for(int i=1;i<=n;i++) {
			steps++;
			n=n-steps;
		}
		return steps;
	}
	//using for loop without extra variable
	public int findSteps1(int n) {
		int i=0;
		for(i=1;i<=n;i++) {			
			n=n-i;
		}
		return i-1;
	}
	//using while loop
	public int findSteps2(int n) {
		int steps=0;
		while(n>0) {
			steps++;
			n=n-steps;
		}
		return steps;
	}
	
}
