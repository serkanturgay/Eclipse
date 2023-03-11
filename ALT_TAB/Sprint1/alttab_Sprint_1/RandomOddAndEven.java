package alttab_Sprint_1;

import java.util.Iterator;
import java.util.Random;
import java.util.Arrays;

public class RandomOddAndEven {

	public static void main(String[] args) {
		Random random = new Random();
		int[] numbers = new int[100];
		int oddNumber = 0;
		int evenNumber = 0;
		int oddTempArray = 0;
		int evenTempArray = 0;
		for (int i = 0; i < 100; i++) {
			int number = random.nextInt(100);
			numbers[i] = number;
			if (numbers[i] % 2 == 0) {
				oddNumber++;
			} else {
				evenNumber++;
			}
		}
		System.out.println("Elements = " + Arrays.toString(numbers));
		System.out.println("Odd Number = " + oddNumber + " Even Number = " + evenNumber);

		int[] oddArray = new int[oddNumber];
		int[] evenArray = new int[evenNumber];

		for (int i = 0; i < 100; i++) {
			if (numbers[i] % 2 == 0) {
				oddArray[oddTempArray] = numbers[i];
				oddTempArray++;
			}else {
				evenArray[evenTempArray] = numbers[i];
				evenTempArray++;
			}
		}
		
		System.out.println("Odd Numbers = " + Arrays.toString(evenArray));
		System.out.println("Even Numbers = " + Arrays.toString(oddArray));


	}

}
