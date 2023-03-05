package alttab_Sprint_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		int tempNum = 2;
		int a = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int arrayLength = scan.nextInt();
		int[] arrayNumber = new int[arrayLength-1];
		int[] tempArray = new int[arrayLength-1];
		for (int i = 0; i < arrayNumber.length; i++) {
			
			if (tempNum != arrayLength+1) {
				arrayNumber[i] = tempNum;
				tempNum++;
			}
			
		}
		
		System.out.println(Arrays.toString(arrayNumber));
		
		for (int i = 2; i < tempArray.length; i++) {
			for (int j = 0; j < arrayNumber.length; j++) {
				if (arrayNumber[j] % i == 0) {
					tempArray[a] = arrayNumber[j];

				}
			}
			if (j == arrayNumber.length) {
				break;
			}
			
		}
		
		System.out.println(Arrays.toString(tempArray));

	}

}
