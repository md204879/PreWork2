import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Date {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// First i'm going to get the input of two separate dates from the user
		System.out.println("Pick a date and record the day, month, and year" + '\n' + "Start by entering the day: ");
		int day1 = input.nextInt();
		System.out.println("Now enter the number of the month: ");
		int month1 = input.nextInt();
		System.out.println("Finally enter the number of the year" + "(Ex. 2014)" + " : ");
		int year1 = input.nextInt();

		System.out.println("Pick a second and different date and record the day, month, and year" + '\n'
				+ "Start by entering the day: ");
		int day2 = input.nextInt();
		System.out.println("Now enter the number of the month: ");
		int month2 = input.nextInt();
		System.out.println("Finally enter the number of the year" + "(Ex. 2014)" + " : ");
		int year2 = input.nextInt();

		// Get a Calendar 
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		// Set the new calendars I created to the dates the user entered
		cal1.set(year1, month1, day1);
		cal2.set(year2, month2, day2);

		// Convert to Milliseconds
		long milisecForDate1 = cal1.getTimeInMillis();
		long milisecForDate2 = cal2.getTimeInMillis();

		// Find the difference in Milliseconds first
		long diff = milisecForDate2 - milisecForDate1;

		System.out.println(diff);

		// Equations used to convert Milliseconds to Days, Months and Years
		long diffInDays = diff / (24 * 60 * 60 * 1000);
		long diffInWeeks = diff / (7 * 24 * 60 * 60 * 1000);
		long diffInMonths = diffInWeeks / 4;
		long diffInYears = diffInMonths / 12;

		System.out.println("Difference in Days : " + diffInDays + " days");
		System.out.println("Difference in Months : " + diffInMonths + " months");
		System.out.println("Difference in Years : " + diffInYears + " years");
	}

}
