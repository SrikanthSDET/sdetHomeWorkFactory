package september;

import org.junit.Test;

import junit.framework.Assert;

public class HeightChecker {
	@Test
	public void testData1() {
		Assert.assertEquals(3, heightChecker(new int[] {1,1,4,2,1,3}));
	}
	
	@Test
	public void testData2() {
		Assert.assertEquals(5, heightChecker(new int[] {5,1,2,3,4}));
	}
	
	@Test
	public void testData3() {
		Assert.assertEquals(0, heightChecker(new int[] {1,2,3,4,5}));
	}
	
	@Test
	public void testData4() {
		Assert.assertEquals(4, heightChecker(new int[] {2,1,2,1,1,2,2,1}));
	}
	
	public int heightChecker(int[] heights) {
		if(heights[0]==heights.length) return heights.length;
		int count=0;
		boolean atleasetOneChange=false;
		for(int i=0;i<heights.length-1;i++){					
			if(heights[i]<=heights[i+1]) {
				
			}
			else {
				if(heights[i]-heights[i+1]>=1 || heights[i]-heights[i+1]<=-1 )
				count++;
				//return heights.length-(i+1);
				atleasetOneChange=true;
			}
		}
		if(atleasetOneChange)
		return count+1;
		else
		return count;
	}

}
