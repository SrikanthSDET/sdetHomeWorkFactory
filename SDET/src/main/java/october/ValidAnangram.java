package october;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class ValidAnangram {
	@Test
	public void Test1() {
		Assert.assertEquals(true, findValidAnagram("anagram","nagaram"));
	}
	
	public boolean findValidAnagram(String s,String t) {
		char[] charArrayS = s.toCharArray();
		char[] charArrayT = t.toCharArray();
		Arrays.sort(charArrayT);
		Arrays.sort(charArrayS);
		if(charArrayS.length==charArrayT.length) {
			return Arrays.equals(charArrayS, charArrayT);
		}
		
		return false;
	}
	
	public boolean findValidAnagram1(String s,String t) {
		char[] charArrayS = s.toCharArray();	
		
		if(s.length()==t.length()) {
			for(int i=0;i<t.length();i++) {
				HashSet<Integer> hset = new HashSet<Integer>();
			}
		}
		
		return false;
	}

}
