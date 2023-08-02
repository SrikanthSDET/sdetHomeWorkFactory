package DSA15July;

import org.junit.Test;

import junit.framework.Assert;

public class JewelsAndStones_771 {
	
	/*
	 * Input: String jewels = "aA", stones = "aAAbbbb"
	 * Output: int
	 * Initialize Count variable 
	 * Using for loop iterate the jewels in outer loop and stones in inner loop
	 * Check the condition with case sensitive 
	 * 
	 */

	@Test
	public void Test1() {
		int findJewelsAndStones = findJewelsAndStones1("aA","aAAbbbb");
		Assert.assertEquals(3, findJewelsAndStones);
	}
	
	@Test
	public void Test2() {
		int findJewelsAndStones = findJewelsAndStones1("z","ZZ");
		Assert.assertEquals(0, findJewelsAndStones);
	}
	
	public int findJewelsAndStones(String jewels,String stones) {
		int count=0;
		for(int i=0;i<jewels.length();i++) {
			for(int j=0;j<stones.length();j++) {
				if(jewels.charAt(i)==stones.charAt(j)) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	public int findJewelsAndStones1(String jewels,String stones) {
		int count=0;
		for(int i=0;i<stones.length();i++) {
			if(jewels.contains(stones.substring(i, i+1))) {
				count++;
			}
		}
		
		return count;
	}
}
