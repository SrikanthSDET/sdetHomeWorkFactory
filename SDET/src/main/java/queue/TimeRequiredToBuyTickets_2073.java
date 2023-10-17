package queue;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class TimeRequiredToBuyTickets_2073 {
    @Test
    public void testData1(){
        Assert.assertEquals(6,timeRequiredToBuyTickets(new int[] {2,3,2},2));
    }
    @Test
    public void testData2(){
        Assert.assertEquals(8,timeRequiredToBuyTickets(new int[] {5,1,1,1},0));
    }
    @Test
    public void testData3(){
        Assert.assertEquals(154,timeRequiredToBuyTickets(new int[] {84,49,5,24,70,77,87,8},3));
    }
    public int timeRequiredToBuyTickets(int[] tickets ,int k){
        ArrayDeque<Integer> timeTicket = new ArrayDeque<>();
        int round=tickets[k];
        while(round!=0){
            for(int j=0;j<tickets.length;j++){
                if(tickets[j]!=0){
                    tickets[j]--;
                    timeTicket.add(1);
                }
                if(tickets[k]==0 && round==1){
                    break;
                }
            }
            round--;
        }
        return timeTicket.size();
    }


}
