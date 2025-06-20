package ProblemSolving;

import java.util.Calendar;
public class CalendarClass {
	

	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		
		
		System.out.println(rightNow.getTime());
		System.out.println(rightNow.getClass().getName());

		System.out.println("Year: "+rightNow.get(Calendar.YEAR));
		System.out.println("Month: "+rightNow.get(Calendar.MONTH)); //0-based index like JAN-0
		System.out.println("Day: "+rightNow.get(Calendar.DAY_OF_MONTH));
		System.out.println("Hour: "+rightNow.get(Calendar.HOUR_OF_DAY));
		
		String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		int day_of_week = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println("Day of week: "+days[day_of_week-1]);
	}

}
