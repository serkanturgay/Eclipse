package alttab_Sprint_3;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeMultipliers {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		int arrayNum = scan.nextInt();
		int myNumber = arrayNum;
		boolean[] primeArray = new boolean[arrayNum + 1];
		int[] primeNumberCounter = new int[arrayNum + 1];
		Arrays.fill(primeArray, true);
		for (int i = 2; i < arrayNum; i++) {
			for (int j = 2; i * j < arrayNum; j++) {
				if (primeArray[i * j] == true) {
					primeArray[i * j] = false;
				}
			}
		}
		primeArray[0] = false;
		primeArray[1] = false;
		Arrays.fill(primeNumberCounter, 0);

		for (int i = 0; i <= arrayNum; i++) {
			if (primeArray[i] == true) {
				for (int j = 0; j <= arrayNum; j++) {
					if (myNumber % i == 0) {
						primeNumberCounter[i]++;
						myNumber = myNumber / i;
					}
				}
				if (myNumber == 1) { // girilen sayi asallara bolunup 1 e sitlendiginde islem durur. Aksi takdirde
										// girilen sayiya kadar tum asallara bolmeye calisacak.
					break;
				}
			}
		}
		for (int i = 0; i <= arrayNum; i++) {
			if (primeNumberCounter[i] != 0) {
				System.out.print(i + "^" + primeNumberCounter[i] + " x ");
			}
		}
	}
}