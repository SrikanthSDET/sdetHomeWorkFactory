package DSA;

import org.junit.Test;

public class CountOfMatchesInTournament {
	
	/*
	 * -->input is integer 14
-->initialzie the var int rem =0;
-->output is integer
-->Check the given input is even or odd
-->IF the given input is even (14%2==0)
    round 1 input/2-->14/2=7
    Check the rem is odd or even       rem=7 -->check odd or even
    round 2    -->rem-1/2 -->rem=3+1-->check it is odd or even
     Check the rem is odd or even        -->rem/2-->2
    round 3        -->rem/2-->1
    round1 (7)+round2 (4)+round3 (2)+round4 (1)
	 * 
	 */
	@Test
	public void Test1() {
		System.out.println(findTotalMatches(14));
	}
	
	public int findTotalMatches(int n) {
		
		/*
		 * int teams=0; while(n>1) { if(n%2==0) { matches=n/2; winner=matches; }else {
		 * matches = n-1/2+1; winner=matches; } } return matches;
		 */
		return 0;
	}

}
