package alttab_Sprint_2;

import java.util.Scanner;

public class PrimeNumberV2 {

	public static void main(String[] args) {
		int primeNumber = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scan.nextInt();
		for (int i = 2; i <= number; i++) {
			if (i == 2) {
				System.out.println(i + " is prime number.");
			} else {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						System.out.println(i + " is not prime number.");
						break;
					} else if (j == i - 1) {
						System.out.println(i + " is prime number.");
						primeNumber++;
					}
				}
			}
		}
		System.out.println("Total prime number from 0 to " + number + " = " + primeNumber);
	}
}
