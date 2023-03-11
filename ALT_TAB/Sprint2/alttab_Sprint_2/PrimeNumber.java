package alttab_Sprint_2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scan.nextInt();

		if (number == 2) {
			System.out.println(number + " is prime number.");
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					System.out.println(number + " is not prime number.");
					break;
				} else if (i == number - 1) {
					System.out.println(number + " is prime number.");
				}

			}

		}

	}

}
