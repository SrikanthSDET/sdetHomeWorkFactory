package DSA;

import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairs_70 {
	
	@Test
	public void Test1() {
		int findVariousClimbingStairs = findVariousClimbingStairs(45);
		Assert.assertEquals(5, findVariousClimbingStairs);
	}
	
	public int findVariousClimbingStairs(int n) {
		if(n==1) return 1;
		int oneStep=0,twoStep=0,onlyOne=1;
		oneStep+=n%2;
		twoStep+=n/2;
		return onlyOne+(twoStep*twoStep)+oneStep;
	}

}
