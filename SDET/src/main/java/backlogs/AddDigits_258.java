package backlogs;

import org.junit.Assert;
import org.junit.Test;

public class AddDigits_258 {
    @Test
	public void returnSumSc1() {
		Assert.assertEquals(2, addDigits(38));
	}

    @Test
    public void returnSumSc2() {
        Assert.assertEquals(1, addDigits(13456));
    }

    public int addDigits(int num){
        if(num<10) return num;
        int sum=0,quotient=0,reminder=0;

        while(num>=10){
            quotient = num/10;
            reminder = num%10;
            num = num / 10;
            sum=quotient+reminder;
            if(sum<10){
                return sum;
            }else{
                num=sum;
            }

        }
        return sum;
    }
}
