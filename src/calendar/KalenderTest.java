package calendar;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class KalenderTest {
	
	
	public static void main(String[] args) {
//		Calendar c = Calendar.getInstance();
//		System.out.println(c.getTime());
//		System.out.println(Calendar.WEEK_OF_YEAR);
//		System.out.println(c.DAY_OF_WEEK_IN_MONTH);
		GregorianCalendar ca = new GregorianCalendar(2015,2,24);
		System.out.println(ca.get(ca.DAY_OF_MONTH));
		System.out.println(ca.getTime());
		System.out.println(ca.get(ca.getFirstDayOfWeek()));
//		System.out.println(ca.getGregorianChange());
	}
}
