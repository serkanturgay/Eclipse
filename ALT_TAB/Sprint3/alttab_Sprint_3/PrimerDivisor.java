package alttab_Sprint_3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class PrimerDivisor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = scan.nextInt();
		boolean[] primeArray = new boolean[number];
		Arrays.fill(primeArray, true);
		for (int i = 2; i < number; i++) {
			for (int j = 2; i * j < number; j++) {
				if (primeArray[i * j] == true) {
					primeArray[i * j] = false;
				}
			}
		}
		primeArray[0] = false;
		primeArray[1] = false;
		int primeNumber = 0;
		for (boolean b : primeArray) {
			if (b) {
				primeNumber++;
			}
		}
		System.out.println("prime factors of the entered number");
		int primeDivisorNumber = 0;
		for (int i = 0; i < primeArray.length; i++) {
			if (primeArray[i] == true) {
				if (number % i == 0) {
					System.out.println(i);
					primeDivisorNumber++;
				}
			}
		}
		if(primeDivisorNumber == 0){
			System.out.println("the number entered is a prime number");
		}
		
	}

}
