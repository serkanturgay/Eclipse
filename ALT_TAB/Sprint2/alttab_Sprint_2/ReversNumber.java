package alttab_Sprint_2;

import java.util.Scanner;

public class ReversNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int gecici = 0;
		int number = scan.nextInt();
		if (number >= 0) {
			do {
				System.out.print(number % 10);
				number = number / 10;
			} while (number != 0);
		} else {
			System.out.print("-");
			do {
				int negativeNumber = ((number % 10) + 2 * (-1 * number % 10));
				System.out.print(negativeNumber);
				number = number / 10;
			} while (number != 0);
		}

	}

}
