package october;

import org.junit.Assert;
import org.junit.Test;

public class CheckSentenceIsPanagaram_1832 {

    @Test
    public void testData1(){
        Assert.assertEquals(true,isPanagaram("thequickbrownfoxjumpsoverthelazydog"));
    }

    @Test
    public void testData2(){
        Assert.assertEquals(false,isPanagaram("leetcode"));
    }
    public boolean isPanagaram(String sentence){
        if(sentence.length()<26) return false;
        short[] alpha = new short[26];
        for(char each : sentence.toCharArray()){
            alpha[each-'a']++;
        }
        for(short each : alpha){
            if(each==0) return false;
        }
        return true;
    }
}
