import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Date {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Date");
		int date = input.nextInt();
		
		System.out.print("Enter the Second Date");
		int date2 = input.nextInt();
		
		long duration  = date.getTime() - date2.getTime();

		long diffInSeconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		long diffInHours = TimeUnit.MILLISECONDS.toHours(duration);
		
		System.out.println(diffInSeconds, diffInMinutes, diffInHours);

	}

}
