package backlogs;

import org.junit.Assert;
import org.junit.Test;

public class ArrangingCoins_441 {
    @Test
    public void testData1(){
        Assert.assertEquals(2,arrangingCoins(5));
    }
    @Test
    public void testData2(){
        Assert.assertEquals(3,arrangingCoins(8));
    }
    public int arrangingCoins(int n){
        if(n==1) return n;
        int coins=n;
        for(int i=1;i<=n;i++){
            if(coins<i){
                return i-1;
            }else{
                coins -= i;
            }
        }
        return 0;
    }
}
