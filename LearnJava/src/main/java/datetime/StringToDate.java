package datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringToDate {

	public static void main(String[] args)  {
		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
		LocalDateTime dateTime = LocalDateTime.parse("2019-03-27 10:15:30 AM", formatter);
		System.out.println(dateTime);
		
	}

}
