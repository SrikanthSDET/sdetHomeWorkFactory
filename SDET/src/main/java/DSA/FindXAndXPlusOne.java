package DSA;
import org.junit.Test;

import junit.framework.Assert;
public class FindXAndXPlusOne {
	/*
	 * Pseudo Code :
Input --> Integer array
Output -->int
Initialize one variable count =0;
Iterate throug every lements 
Outerloop  starts from i=0 to i < length.Array and 
Inner loop starts from j=0 j<length. arrya
increment vaue to +1 , then copare wth other values
Match found
Increment count
	 */
	
	@Test
	public void Test1() {
		int findXAndXPlusOne = findXAndXPlusOne(new int[] {1, 2, 3});
		Assert.assertEquals(2, findXAndXPlusOne);
	}
	
	@Test
	public void Test2() {
		int findXAndXPlusOne = findXAndXPlusOne(new int[] {1, 1, 3, 3, 5, 5, 7, 7});
		Assert.assertEquals(0, findXAndXPlusOne);
	}
	
	@Test
	public void Test3() {
		int findXAndXPlusOne = findXAndXPlusOne(new int[] {1, 1, 2});
		Assert.assertEquals(2, findXAndXPlusOne);
	}
	
	public int findXAndXPlusOne(int[] num) {
		int count=0;
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				if(num[i]+1==num[j]) {
					count++;
				}
			}
		}
		return count;
	}

}
