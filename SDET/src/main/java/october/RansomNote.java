package october;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class RansomNote {
	/*
	 * 
	 */
	@Test
	public void TestData1() {
		Assert.assertEquals(false, canConstruct1("a","b"));
	}
	
	@Test
	public void TestData2() {
		Assert.assertEquals(false, canConstruct1("aa","ab"));
	}
	
	@Test
	public void TestData3() {
		Assert.assertEquals(true, canConstruct1("aa","aab"));
	}
	
	public boolean canConstruct(String ransomNote, String magazine) {
		short[] alpha = new short[26];
		for(char ch : magazine.toCharArray())
			alpha[ch-'a']++;
        for(char ch : ransomNote.toCharArray()){
        	alpha[ch-'a']--;
            if(alpha[ch-'a'] <0)
            return false;
      }
		
		return true;
	}
	
	public boolean canConstruct1(String ransomNote, String magazine) {
		
        Map<Character, Integer> hash = new HashMap<>();
        
        for(int i = 0; i < magazine.length(); i++) {
            
            char ch = magazine.charAt(i);
            
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
        }
        
        for(int i = 0; i < ransomNote.length(); i++) {
            
            char ch = ransomNote.charAt(i);
           
            hash.put(ch, hash.getOrDefault(ch, 0) - 1);
        }
        
        for(Map.Entry<Character, Integer> entry: hash.entrySet()) {
            
            if(entry.getValue() < 0) return false;
        }
        
        return true;
	}

}
