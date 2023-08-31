package august.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SummaryRanges_228 {
	
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
	
	public List<String> findSummaryRange(int[] nums) {
		List<String> range = new ArrayList<String>();
		if(nums.length==0) {
			return range;
		}
		int startRange=nums[0],endRange=nums[0];
		for(int i=0;i<nums.length-1;i++){
			if(nums[i+1]-nums[i]>1){
				endRange=nums[i];
				if(startRange==endRange){
					range.add(Integer.toString(startRange));
				}else{
					range.add(startRange+"->"+endRange);
				}		
				startRange=nums[i+1];
			}
		}
			
		endRange=nums[nums.length-1];
		if(startRange==endRange){
			range.add(Integer.toString(startRange));
		}
		else{
			range.add(startRange+"->"+endRange);
		}	
		
		
		return range;
	}

}
