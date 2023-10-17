package hashmap;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class FirstUniqueChar_387 {
    @Test
    public void testData1(){
        Assert.assertEquals(0,findFirstUniqueCharInString("leetcode"));
    }
    @Test
    public void testData2(){
        Assert.assertEquals(2,findFirstUniqueCharInString("loveleetcode"));
    }
    @Test
    public void testData3(){
        Assert.assertEquals(-1,findFirstUniqueCharInString("aabb"));
    }
    public int findFirstUniqueCharInString(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char each : s.toCharArray()){
            map.put(each,map.getOrDefault(each,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
