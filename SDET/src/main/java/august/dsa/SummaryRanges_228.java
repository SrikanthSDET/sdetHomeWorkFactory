package august.dsa;

import java.util.Arrays;

import org.junit.Test;

public class SummaryRanges_228 {
	
	@Test
	public void Test1() {
		String[] findSummaryRange = findSummaryRange(new int[] {0,1,2,4,5,7});
	}
	
	public String[] findSummaryRange(int[] nums) {
		String[] out = new String[nums.length];
		int j=0,k=0,diff=0;
		for(int i=0;i<=nums.length;i++){
			diff=(nums[i+1]-nums[i]);	//  0, 1, 2 , 3,4
			if(diff>1){
										//1-0,2-1,4-2,4-5,5-7
				//if(k==i){
					//out[j] += k;
				//}else{
					out[j] =+ k+"->"+i;
				//}
				k=(i-1)+diff;
				j++;
				System.out.println(Arrays.toString(out));
			}
		}
		return out;
	}

}
