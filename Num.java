import java.util.Scanner;

public class Num {

	public static void main(String[] args) {

		// create scanner
		Scanner input = new Scanner(System.in);

		// Ask user for two numbers
		System.out.print("Enter two numbers with equal number of digits plus each number entered cant exceed 3 digits max"
						+ '\n' + "Enter your first number: ");
		
		// Save each number in an integer
		int num1 = input.nextInt();
		System.out.print("Enter your second number: ");
		int num2 = input.nextInt();

		// Create a while loop to determine how many digits each number has.
		int count = 0;
		int first = num1;
		int count2 = 0;
		int sec = num2;

		while (first != 0) {
			first /= 10;
			++count;
		}
		
		while (sec != 0) {
			sec /= 10;
			++count2;
		}

		if (count == count2) {

			// Creating and filling and array with number 1
			String sDigits = Integer.toString(num1);
			char[] cDigits = sDigits.toCharArray();
			int[] digits = new int[cDigits.length];

			for (int i = 0; i < cDigits.length; i++) {
				digits[i] = Character.digit(cDigits[i], 10);
			}

			// Creating and filling and array with number 2
			String ssDigits = Integer.toString(num2);
			char[] ccDigits = ssDigits.toCharArray();
			int[] digits2 = new int[ccDigits.length];

			for (int i = 0; i < ccDigits.length; i++) {
				digits2[i] = Character.digit(ccDigits[i], 10);
			}

			// Create variables to store the math equations
			int A = (digits[0] + digits2[0]);
			int B = (digits[1] + digits2[1]);
			int C = (digits[2] + digits2[2]);

			// Create an if loop with multiple conditions to verify
			// if all the corresponding digits added together are equal to each other
			if ((A == B) && (A == C) && (B == C)) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		} else {
			System.out.println("Error: False - number of digits in the two numbers dont match");
		}
	}

}
