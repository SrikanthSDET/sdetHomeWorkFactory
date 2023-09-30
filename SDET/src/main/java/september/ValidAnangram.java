package september;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class ValidAnangram {
	@Test
	public void Test1() {
		Assert.assertEquals(true, findValidAnagram("anagram","nagaram"));
	}
	
	public boolean findValidAnagram(String s,String t) {
		Map<Character,Integer> smap = new HashMap<Character,Integer>();
		Map<Character,Integer> tmap = new HashMap<Character,Integer>();
		if(s.length()==t.length()) {
			for(int i=0;i<s.length()-1;i++) {
				smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0)+1);
				tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0)+1);
			}
		}
		
		return smap.equals(tmap);
	}

}
