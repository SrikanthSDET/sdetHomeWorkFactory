package backlogs;

import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairs_70 {

    @Test
    public void testClimbStairsSc1() {
        Assert.assertEquals(0, climbStairs(0));
    }

    @Test
    public void testClimbStairsSc2() {
        Assert.assertEquals(1, climbStairs(1));
    }

    @Test
    public void testClimbStairsSc3() {
        Assert.assertEquals(2, climbStairs(2));
    }

    @Test
    public void testClimbStairsSc4() {
        Assert.assertEquals(3, climbStairs(3));
    }

    @Test
    public void testClimbStairsSc5() {
        Assert.assertEquals(5, climbStairs(4));
    }

    @Test
    public void testClimbStairsSc6() {
        Assert.assertEquals(8, climbStairs(5));
    }
    public int climbStairs (int n) {

        int[] array=new int[n+1];
        for(int i=0;i<=n;i++) {
            if (i<=2) {
                array[i]=i;
            }
            else {
                array[i]=array[i-2]+array[i-1];
            }
        }
        return array[array.length-1];

    }


}
