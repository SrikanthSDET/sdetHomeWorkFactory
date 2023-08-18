package DSA30July;

import org.junit.Test;

import junit.framework.Assert;

public class DayOfTheYear_1154 {
	@Test
	public void Test1() {
		int findDayOfTheYear = findDayOfTheYear("2016-03-10");
		Assert.assertEquals(70, findDayOfTheYear);
	}
	
	//@Test
	public void Test2() {
		int findDayOfTheYear = findDayOfTheYear("2019-01-09");
		Assert.assertEquals(9, findDayOfTheYear);
	}
	public int findDayOfTheYear(String date) {
		
		String[] date1 = date.split("-");
		
		if((Integer.parseInt(date1[0])%100==0 && Integer.parseInt(date1[0])%400==0) || (Integer.parseInt(date1[0])%100!=0 && Integer.parseInt(date1[0])%4==0)) {
			
		}

		int days = Integer.parseInt(date1[2]);
		
		int[] daysOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i=0;i<Integer.parseInt(date1[1])-1;i++) {
			days=days+daysOfMonth[i];
		}
		
		if(Integer.parseInt(date1[0])%4==0 && ((Integer.parseInt(date1[1])==2 && Integer.parseInt(date1[2])==29) || (Integer.parseInt(date1[1])>2))) {
			days=days+1;
		}
		
		return days;
	}

}
