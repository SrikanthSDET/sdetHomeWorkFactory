package DSA15July;

import org.junit.Test;

import junit.framework.Assert;

public class ShuffleString_1528 {
	
	/*
	 * Input: String S, int[] indices
	 * OutPut: String
	 * String into char[], array elements position and int[] index are equal 
	 * Initialize empty String  S1 
	 * Iterate over indices Arr[] using for 
 	 * Inside the loop using charAt() 
 	 * S1= S1+ S.charAt(indices[i])
 	 * return S1
	 */
	
	@Test
	public void Test() {
		String shuffleString = shuffleString("codeleet",new int[] {4,5,6,7,0,2,1,3});
		Assert.assertEquals("leetcode", shuffleString);
	}
	
	public String shuffleString(String S, int[] indices) {
		String out="";
		char[] S2 = new char[indices.length];
		for(int i=0;i<indices.length;i++ ) {
			S2[indices[i]]=S.charAt(i);
		}
		out = String.valueOf(S2);
		
		return out;
	}

}
