package september;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SummaryRangeTwoPointer {
	@Test
	public void Test1() {
		List<String> findSummaryRange = findSummaryRange(new int[] {0,1,2,4,5,7});
		List<String> numbers = Arrays.asList("0->2", "4->5", "7");
		Assert.assertArrayEquals(numbers.toArray(), findSummaryRange.toArray());
	}
	
	@Test
	public void Test2() {
		List<String> findSummaryRange = findSummaryRange(new int[] {0,2,3,4,6,8,9});
		List<String> numbers = Arrays.asList("0", "2->4", "6","8->9");
		Assert.assertArrayEquals(numbers.toArray(), findSummaryRange.toArray());
	}
	
	@Test
	public void Test3() {
		List<String> findSummaryRange = findSummaryRange(new int[] {-9,-4,-3,0,1,2});
		List<String> numbers = Arrays.asList("-9", "-4->-3", "0->2");
		Assert.assertArrayEquals(numbers.toArray(), findSummaryRange.toArray());
	}
	
	@Test
	public void Test4() {
		List<String> findSummaryRange = findSummaryRange(new int[] {-10,-9,0,1});
		List<String> numbers = Arrays.asList("-10->-9","0->1");
		Assert.assertArrayEquals(numbers.toArray(), findSummaryRange.toArray());
	}
	
	public List<String> findSummaryRange(int[] nums){
		List<String> numRange = new ArrayList<String>();
		if(nums.length==0) {
			return numRange;
		}
		int left=0,right=1,startVal=nums[0],endVal=0;
		
		while(right<nums.length){
			if((nums[right]-nums[left])==1){
				left++;
				right++;
			}else{
				endVal=nums[left];
				if(startVal!=endVal)
				numRange.add(String.valueOf(startVal)+"->"+String.valueOf(endVal));
				else
				numRange.add(String.valueOf(startVal));
				startVal=nums[right];
				left++;
				right++;
				
			}
		}
		endVal=nums[left];
		if(startVal!=endVal)
			numRange.add(String.valueOf(startVal)+"->"+String.valueOf(endVal));
		else
			numRange.add(String.valueOf(startVal));
		
		return numRange;
	}

}
