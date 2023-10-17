package stack;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class BackspaceStringCompare_844 {
    @Test
    public void testData1(){
        Assert.assertTrue(findBackspaceString("ab#c","ad#c"));
    }
    @Test
    public void testData2(){
        Assert.assertTrue(findBackspaceString("ab##","c#d#"));
    }
    @Test
    public void testData3(){
        Assert.assertFalse(findBackspaceString("a#c","b"));
    }
    public boolean findBackspaceString(String s, String t){
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        for(char each : s.toCharArray()){
           if(each=='#'){
               sStack.pop();
           }else{
               sStack.push(each);
           }
        }
        for(char each : t.toCharArray()){
            if(each=='#'){
                tStack.pop();
            }else{
                tStack.push(each);
            }
        }
        while(!sStack.isEmpty()){
            if(sStack.peek()==tStack.peek()){
                sStack.pop();
                tStack.pop();
            }else{
                return false;
            }
        }
        return true;
    }
}
