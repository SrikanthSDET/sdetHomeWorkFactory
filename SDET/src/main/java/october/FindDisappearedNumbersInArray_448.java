package october;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindDisappearedNumbersInArray_448 {
    @Test
    public void testData1(){
        List<Integer> expectedList = Arrays.asList(5,6);
        Assert.assertEquals(expectedList,findFindDisappearedNumbersInArray(new int[] {4,3,2,7,8,2,3,1}));
    }
    @Test
    public void testData2(){
        List<Integer> expectedList = Arrays.asList(2);
        Assert.assertEquals(expectedList,findFindDisappearedNumbersInArray(new int[] {1,1}));
    }
    public List<Integer> findFindDisappearedNumbersInArray(int[] nums){
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer,Boolean> numMap = new HashMap<>();
        for(int each : nums){
            numMap.put(each,true);
        }
        for(int i=1;i<=nums.length;i++){
            if(!numMap.containsKey(i)) output.add(i);
        }
        return output;
    }
}
