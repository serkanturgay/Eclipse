package alttab_Sprint_1;

import java.util.Scanner;

public class GCD_LCM {

	public static void main(String[] args) {
		int greatNumber = 0;
		int gcd = 1;
		int lcm = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number1 = scan.nextInt();
		System.out.println("Enter another number: ");
		int number2 = scan.nextInt();

		if (number1 >= number2) {
			greatNumber = number1;
		} else {
			greatNumber = number2;
		}

		for (int i = 2; i <= greatNumber; i++) {
			int tempNumber1 = number1 % i;
			int tempNumber2 = number2 % i;

			while (tempNumber1 == 0 | tempNumber2 == 0) {
				if (tempNumber1 == 0 & tempNumber2 == 0) {
					number1 = number1 / i;
					number2 = number2 / i;
					lcm = lcm*i;
					gcd = gcd*i;
				}else if (tempNumber1 == 0 & tempNumber2 != 0) {
					number1 = number1 / i;
					lcm = lcm*i;
				}else if (tempNumber1 != 0 & tempNumber2 == 0) {
					number2 = number2 / i;
					lcm = lcm*i;
				}
				
				tempNumber1 = number1 % i;
				tempNumber2 = number2 % i;
			}

		}
		
		System.out.println("Greatest Common Divisor = " + gcd + "\nLeast Common Multiple = " + lcm);
	}

}
