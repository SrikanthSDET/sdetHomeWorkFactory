package backlogs;

import org.junit.Assert;
import org.junit.Test;

public class CountOfMatchesInTournament_1688 {
    @Test
    public void testData1(){
        Assert.assertEquals(6,findCountOfMatchesInTournament(7));
    }
    public int findCountOfMatchesInTournament(int n){
        int matches=0,nextLevel=n;
        while(nextLevel>=2){
            if(n%2==0){
                matches+=n/2;
                nextLevel=n/2;
            }else{
                matches+=(n-1)/2;
                nextLevel=((n-1)/2)+1;
            }
            n=nextLevel;
        }
        return matches;
    }
}
