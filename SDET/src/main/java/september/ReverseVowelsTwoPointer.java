package september;

import java.util.Arrays;

import org.junit.Test;

public class ReverseVowelsTwoPointer {
	@Test
	public void test() {

		findReverseVowel("leetcode");
		//Output: "leotcede"
	}

	public String findReverseVowel(String s) {
		char[] charArray = s.toCharArray();	
		char temp=' ';
		int left=0,right=charArray.length-1;
		while(left<right) {
			if((charArray[left]==('A') || charArray[left]==('E')|| charArray[left]==('I')|| charArray[left]==('O')|| 
					charArray[left]==('U')||charArray[left]==('a') || charArray[left]==('e')|| charArray[left]==('i')
					|| charArray[left]==('o')|| charArray[left]==('u')) && (charArray[right]==('A') || 
					charArray[right]==('E')|| charArray[right]==('I')|| charArray[right]==('O')|| 
					charArray[right]==('U')||charArray[right]==('a') || charArray[right]==('e')|| charArray[right]==('i')
					|| charArray[right]==('o')|| charArray[right]==('u'))) {
				temp=charArray[left];
				charArray[left]=charArray[right];
				charArray[right]=temp;
				left++;
				right--;
			}else if((charArray[left]!=('A') || charArray[left]!=('E')|| charArray[left]!=('I')|| charArray[left]!=('O')|| 
					charArray[left]!=('U')||charArray[left]!=('a') || charArray[left]!=('e')|| charArray[left]!=('i')
					|| charArray[left]!=('o')|| charArray[left]!=('u')) && (charArray[right]==('A') || 
					charArray[right]==('E')|| charArray[right]==('I')|| charArray[right]==('O')|| 
					charArray[right]==('U')||charArray[right]==('a') || charArray[right]==('e')|| charArray[right]==('i')
					|| charArray[right]==('o')|| charArray[right]==('u'))) {
				left++;
			}
			else if((charArray[left]==('A') || charArray[left]==('E')|| charArray[left]==('I')|| charArray[left]==('O')|| 
					charArray[left]==('U')||charArray[left]==('a') || charArray[left]==('e')|| charArray[left]==('i')
					|| charArray[left]==('o')|| charArray[left]==('u')) && (charArray[right]!=('A') || 
					charArray[right]!=('E')|| charArray[right]!=('I')|| charArray[right]!=('O')|| 
					charArray[right]!=('U')||charArray[right]!=('a') || charArray[right]!=('e')|| charArray[right]!=('i')
					|| charArray[right]!=('o')|| charArray[right]!=('u'))) {
				
				right--;
			
			
		}else if((charArray[left]!=('A') || charArray[left]!=('E')|| charArray[left]!=('I')|| charArray[left]!=('O')|| 
				charArray[left]!=('U')||charArray[left]!=('a') || charArray[left]!=('e')|| charArray[left]!=('i')
				|| charArray[left]!=('o')|| charArray[left]!=('u')) && (charArray[right]!=('A') || 
				charArray[right]!=('E')|| charArray[right]!=('I')|| charArray[right]!=('O')|| 
				charArray[right]!=('U')||charArray[right]!=('a') || charArray[right]!=('e')|| charArray[right]!=('i')
				|| charArray[right]!=('o')|| charArray[right]!=('u'))) {
			left++;
			right--;
		
		
	}
		
		
	}
		System.out.println(Arrays.toString(charArray));
		return " ";
}
}
