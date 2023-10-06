package october;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class NumberOfConsistentStrings_1684 {
    @Test
    public void testData1(){
        Assert.assertEquals(2,findNumberOfConsistentStrings("ab",new String[] {"ad","bd","aaab","baa","badab"}));
    }
    public int findNumberOfConsistentStrings(String allowed, String[] words){
        int counter=0;
        HashSet<Character> allowedSet = new HashSet<>();
        for(char each : allowed.toCharArray()){
            allowedSet.add(each);
        }
        for(String word : words){
            boolean isConsistentWord = true;
            for(char each : word.toCharArray()){
                if(!allowedSet.contains(each)){
                    isConsistentWord=false;
                    break;
                }
            }
            if(isConsistentWord) counter++;
        }
        return counter;
    }
}
