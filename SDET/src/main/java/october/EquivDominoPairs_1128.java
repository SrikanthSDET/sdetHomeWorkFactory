package october;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class EquivDominoPairs_1128 {
    @Test
    public void testData1(){
        Assert.assertEquals(3,numEquivDominoPairs(new int[][] {{1,2},{2,1},{3,4},{5,6},{2,1}}));
    }

    @Test
    public void testData2(){
        Assert.assertEquals(3,numEquivDominoPairs(new int[][] {{1,2},{1,2},{1,1},{1,2},{2,2}}));
    }
    public int numEquivDominoPairs(int[][] dominoes){
        HashMap<String, Integer> pairCount = new HashMap<>();

        for (int[] domino : dominoes) {
            int x = Math.min(domino[0], domino[1]);
            int y = Math.max(domino[0], domino[1]);
            String normalizedPair = x + "," + y;

            pairCount.put(normalizedPair, pairCount.getOrDefault(normalizedPair, 0) + 1);
        }

        int totalPairs = 0;
        for (int count : pairCount.values()) {
            totalPairs += count * (count - 1) / 2;
        }
        /*int maxValue=Integer.MIN_VALUE;
        for(int count : pairCount.values()){
            if(count>maxValue){
                maxValue=count;
            }
        }*/

        return totalPairs;

    }
}
