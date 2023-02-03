package alttab_Sprint_1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double result;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number ");
		double firsNumber = scan.nextInt();
		System.out.println("Enter the second number: ");
		double secondNumber = scan.nextInt();

		System.out.println("what action do you want to do? \n add = 1 \n subtract = 2 \n divide = 3 \n multiply = 4");
		int actionNumber = scan.nextInt();
		
		if (actionNumber == 1) {
			result = firsNumber + secondNumber;
			System.out.println("Result = " + result);
		}else if (actionNumber == 2) {
			result = firsNumber - secondNumber;
			System.out.println("Result = " + result);
		}else if (actionNumber == 3) {
			result = firsNumber / secondNumber;
			System.out.println("Result = " + result);
		}else if (actionNumber == 4) {
			result = firsNumber * secondNumber;
			System.out.println("Result = " + result);
		}else {
			System.out.println("Error!");
		}
	}

}
