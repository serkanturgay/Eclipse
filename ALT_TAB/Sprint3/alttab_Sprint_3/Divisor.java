package alttab_Sprint_3;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scan.nextInt();
		System.out.println("divisors of the entered number ");
		for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				System.out.println(i);
			}
		}
	}

}
