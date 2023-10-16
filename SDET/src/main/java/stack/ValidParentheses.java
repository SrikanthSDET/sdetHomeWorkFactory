package stack;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class ValidParentheses {
    /*
    Pseudocode

    1. Init Stack
    2. For open braces add to stack
    3. for closed braces, we need to validated, is it the equivalent open braces in the stack 1st element
        if so, pop the stack
        else return false;
    4. return statement validate is the size if empty

    Time complexity -> O[N]
    Space Complexity -> O[N]

    (()) -> true
    ()()()() -> true
    (){[)} -> false

    (((( -> false



    ()
    first step -> (
        valid -> pop it
        invalid -> false
     */


    @Test
    public void test(){
        Assert.assertTrue(isValid("()()"));
        Assert.assertTrue(isValid("((){})()"));
        Assert.assertFalse(isValid(")()"));
        Assert.assertFalse(isValid("())"));
        Assert.assertFalse(isValid("{)"));
    }

    public boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();
        for(char eachChar: input.toCharArray()){
            switch (eachChar){
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{') return false;
//                    else stack.pop();
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(') return false;
//                    else stack.pop();
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[') return false;
//                    else stack.pop();
                    break;
                default:
                    stack.push(eachChar);
            }

        }
        return stack.isEmpty();
    }
}
