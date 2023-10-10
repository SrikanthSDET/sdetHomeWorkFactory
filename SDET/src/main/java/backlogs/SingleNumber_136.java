package backlogs;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumber_136 {
    @Test
    public void testData1(){
        Assert.assertEquals(1,findSingleNumber(new int[] {2,2,1}));
    }

    @Test
    public void testData2(){
        Assert.assertEquals(4,findSingleNumber(new int[] {4,1,2,1,2}));
    }
    public int findSingleNumber(int[] nums){
        int result=0;
        for(int num : nums){
            result ^=num;
        }
        return result;
    }
}
