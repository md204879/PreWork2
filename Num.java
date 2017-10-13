import java.util.Scanner;

public class Num {

	public static void main(String[] args) {
		
		//create scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a 3 digit number");
		int num1 = input.nextInt();
		
		System.out.print("Enter a second 3 digit number");
		int num2 = input.nextInt();
		
		boolean cond = num1 == num2;
		
		System.out.println(cond);
		

	}

}
