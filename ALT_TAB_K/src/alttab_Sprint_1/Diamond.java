package alttab_Sprint_1;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of the row: ");
		int numberOfRow = scan.nextInt();
		
		for (int i = 0; i < numberOfRow; i++) {
			for (int k = 0; k < numberOfRow-i-1; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 1+2*i; j++) {
				System.out.print("x");
			}
			System.out.println();
		}
		
		for (int m = numberOfRow; m > 0 ; m--) {
			for (int l = numberOfRow; l >= m ; l--) {
				System.out.print(" ");
			}for (int p = 1; p < 2*(m-1); p++) {
				System.out.print("x");
			}System.out.println();
			
		}

	}

}
