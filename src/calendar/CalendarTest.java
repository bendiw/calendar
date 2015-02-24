package calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	private Calendar cal;
	
	public static void main(String[] args) {
		CalendarTest c = new CalendarTest();
		Date date = new Date();
		c.cal.set(2014, 0, 12);
		System.out.println(c.cal);
	}
}
