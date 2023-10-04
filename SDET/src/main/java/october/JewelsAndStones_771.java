package october;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class JewelsAndStones_771 {
    @Test
    public void testData1(){
        Assert.assertEquals(3,findNumOfJewelsInStones("aA","aAAbbbb"));
    }
    public int findNumOfJewelsInStones(String jewels, String stones){
        HashMap<Character,Integer> stoneMap = new HashMap<>();
        int jewelCnt=0;
        for(char stone : stones.toCharArray()){
            stoneMap.put(stone,stoneMap.getOrDefault(stone,0)+1);
        }

        for(char jewel : jewels.toCharArray()){
            if(stoneMap.containsKey(jewel)){
                jewelCnt += stoneMap.get(jewel);
            }
        }
        return jewelCnt;
    }
}
