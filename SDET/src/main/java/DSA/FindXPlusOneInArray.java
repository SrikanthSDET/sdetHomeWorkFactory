package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class FindXPlusOneInArray {
	/*
	 * Given an integer array arr, count how many elements x there are, 
   such that x + 1 is also in arr. 
   If there are duplicates in arr, count them separately.
   Input: int[]
   Output: int
   Create List and add the int[] values 
   Traverse the int[] 
   Check the X+1 condition with List value and return the same
	 */
	@Test
	public void Test1() {
		int XPlusPresence = findXPlusOneValuePresence(new int[] {1,2,3});
		Assert.assertEquals(2, XPlusPresence);
	}
	
	@Test
	public void Test2() {
		int XPlusPresence = findXPlusOneValuePresence(new int[] {1, 1, 3, 3, 5, 5, 7, 7});
		Assert.assertEquals(0, XPlusPresence);
	}
	
	@Test
	public void Test3() {
		int XPlusPresence = findXPlusOneValuePresence(new int[] {1, 1, 2});
		Assert.assertEquals(2, XPlusPresence);
	}
	
	public int findXPlusOneValuePresence(int[] n) {
		int out=0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i : n) {
			list.add(i);
			}
		
		for(int i=0; i<n.length-1; i++) {
			if(list.contains(n[i]+1)) {
				out++;
			}
		}
			return out;
		}
		
	}


