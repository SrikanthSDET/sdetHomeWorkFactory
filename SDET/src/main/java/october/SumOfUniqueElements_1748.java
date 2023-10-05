package october;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements_1748 {
    @Test
    public void testData1(){
        Assert.assertEquals(4,findSumOfUniqueElements(new int[] {1,2,3,2}));
    }

    public int findSumOfUniqueElements(int[] nums){
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int each : nums){
            map.put(each,map.getOrDefault(each,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                sum+=entry.getKey();
            }
        }
        return sum;
    }

    public int findSumOfUniqueElements1(int[] nums){
        int sum=0;
        int[] digits = new int[100];
        for(int each : nums){
            digits[each]++;
        }
        for(int i=0;i<digits.length;i++){
            if(digits[i]==1) sum += i;
        }
        return sum;
    }

}
