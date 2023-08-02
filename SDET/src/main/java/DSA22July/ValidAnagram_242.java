package DSA22July;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ValidAnagram_242 {
	
	@Test
	public void Test1() {
		boolean findValidAnagram = findValidAnagram("anagram","nagaram");
		Assert.assertTrue(findValidAnagram);
	}
	
	@Test
	public void Test2() {
		boolean findValidAnagram = findValidAnagram("rat","car");
		Assert.assertTrue(!findValidAnagram);
	}
	
	public boolean findValidAnagram(String s,String t) {
		
		char[] charArrayS = s.toCharArray();
		char[] charArrayT = t.toCharArray();
		Arrays.sort(charArrayT);
		Arrays.sort(charArrayS);
		
		if(Arrays.equals(charArrayS, charArrayT)){
			return true;
		}
			return false;		
		
	}

}
