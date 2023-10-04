package october;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class FairCandySwap_888 {
    @Test
    public void testData1(){
        Assert.assertArrayEquals(new int[] {1,2},findFairCandySwap(new int[] {1,1},new int[] {2,2}));
    }

    public int[] findFairCandySwap(int[] aliceSizes, int[] bobSizes){
        int sumAlices=0,sumBob=0;
        for(int each : aliceSizes){
            sumAlices+= each;
        }
        for(int each : bobSizes){
            sumBob+= each;
        }

        int diffCandy = (sumAlices - sumBob) / 2;
        HashMap<Integer, Integer> bobMap = new HashMap<>();
        for (int each : bobSizes) {
            bobMap.put(each, 1);
        }
        for(int each : aliceSizes){
            int swapCandy = each-diffCandy;
            if(bobMap.containsKey(swapCandy)){
                return new int[] {each,swapCandy};
            }
        }
        return new int[] {};
    }
}
