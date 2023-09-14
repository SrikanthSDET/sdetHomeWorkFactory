package september;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class SplitBalacedString {
	@Test
	public void testData1() {
		Assert.assertEquals(4, findBigBalacedString("RLRRLLRLRL"));
	}

	@Test
	public void testData2() {
		Assert.assertEquals(2, findBigBalacedString("RLRRRLLRLL"));
	}
	public int findBigBalacedString(String s) {
		int countR = 0, countL = 0;
		List<Integer> subStr = new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				if (countL == countR) {
					subStr.add(countL+countR);
					countR = 0;
					countL = 0;
				}
			}
			if (s.charAt(i) == 'R') {
				countR++;
			} else {
				countL++;
			}
			
		}
		if (countL == countR) {
			subStr.add(countL+countR);
			countR = 0;
			countL = 0;
		}
		int maxWord=0;
		for(int i=0;i<subStr.size()-1;i++) {
			if(subStr.get(i)>subStr.get(i+1)) {
				maxWord=subStr.get(i);
			}
		}
		return maxWord;
	}

}
