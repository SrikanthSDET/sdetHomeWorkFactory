package september;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroWithTwoPointers {
	@Test
	public void validTestData() {
		Assert.assertArrayEquals(new int[] {1,1,4,6,5,0,0}, moveZeroToRight(new int[] {0,1,1,4,6,0,5}));
	}
	
	public int[] moveZeroToRight(int[] input) {
		int left=0,right=0;
		while(left<input.length && right<input.length) {
			if(input[left]==0 && input[right]!=0) {
				input[left]=input[right];
				input[right]=0;
			}else{
				if(input[left]!=0) {
					left++;
					right++;
				}else if(input[right]==0) {
					right++;
				}
			}
		}
		
		return input;
	}

}
