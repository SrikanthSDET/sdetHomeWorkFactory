package september;

import org.junit.Assert;
import org.junit.Test;

public class CheckPalindrome {
	
	@Test
	public void Test() {
		Assert.assertTrue(findValidPalindrome("A man, a plan, a canal: Panama"));
		
	}
	
	public boolean findValidPalindrome(String s) {				
			s = s.toLowerCase();
			  //s.replaceAll("^[a-z0-9]", "") // Wrong Syntax
			s = s.replaceAll("[^a-z0-9]",""); // Right syntax 
			if(s.length()==0 || s.length()==1) return true;
			for(int i=0;i<s.length();i++){		
				for(int j=(s.length()-1)-i;j>=0;j--){
					if(s.charAt(i)!=s.charAt(j)) return false; // h != p
					else{ break;}
				}
				
			}    
		return true;
	}

}
