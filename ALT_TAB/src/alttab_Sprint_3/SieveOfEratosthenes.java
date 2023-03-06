package alttab_Sprint_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int arrayLength = scan.nextInt();
		boolean[] arrayNumber = new boolean[arrayLength];
		Arrays.fill(arrayNumber, true);
		for (int i = 2; i < arrayLength; i++) {
			for (int j  = 2; i * j < arrayLength; j ++) {
				if (arrayNumber[i * j] == true) {
					arrayNumber[i * j] = false;
				}
			}
		}
		arrayNumber[0] = false;
		arrayNumber[1] = false;	
		int primeNumber = 0;
		for (boolean b : arrayNumber) {
			if (b) {
				primeNumber++;
			}
		}
		System.out.println("There are " + primeNumber + " Prime Numbers  ");
		System.out.print("prime numbers from 1 to " + arrayLength + " : ");
		
		for (int i = 0; i < arrayNumber.length; i++) {
			if (arrayNumber[i] == true) {
				System.out.print(i + ", ");
			}
		}
	}

}
