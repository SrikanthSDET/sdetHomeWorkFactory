package DSA22July;

import org.junit.Test;

import junit.framework.Assert;

public class CountOfMatchesInTournament_1688 {
	
	/*
	 * If the current number of teams is even, each team gets paired with 
	 * another team. A total of n / 2 matches are played, and n / 2 teams 
	 * advance to the next round.
	 * If the current number of teams is odd, one team randomly advances 
	 * in the tournament, and the rest gets paired. A total of 
	 * (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams 
	 * advance to the next round.
	 * 
	 */
	
	@Test
	public void Test1() {
		int findCountofMatch = findCountofMatch(7);
		Assert.assertEquals(6, findCountofMatch);
	}
	
	@Test
	public void Test2() {
		int findCountofMatch = findCountofMatch(14);
		Assert.assertEquals(13, findCountofMatch);
	}
	
	public int findCountofMatch(int n) {
		int matchPlayed=0;
		
		while(n>1) {
			if(n%2==0) {
				matchPlayed = matchPlayed + n/2;
				n=n/2;
			}else {
				matchPlayed = matchPlayed + (n-1)/2;
				n=n-(n-1)/2;
			}
		}
		
		
		return matchPlayed;
	}

}
