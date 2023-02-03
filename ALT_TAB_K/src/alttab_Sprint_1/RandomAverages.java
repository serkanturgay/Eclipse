package alttab_Sprint_1;

import java.util.Random;
import java.util.Arrays;
public class RandomAverages {

	public static void main(String[] args) {
		Random random = new Random();
		int[] numbers = new int[100];
		double sum=0;
		for (int i = 0; i < 100; i++) {
			int number = random.nextInt(100);
			numbers[i] = number;
			
		}
		for (int j = 0; j < 100; j++) {
			sum = sum + numbers[j];
		}
		System.out.println("Elements = " + Arrays.toString(numbers));
		System.out.println(sum/100);

	}

}
