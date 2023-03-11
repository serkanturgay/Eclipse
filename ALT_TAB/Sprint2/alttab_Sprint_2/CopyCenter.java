package alttab_Sprint_2;

import java.util.Scanner;

public class CopyCenter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of copies : ");
		int copyNumber = scan.nextInt();
		CopyCenter copyCenter = new CopyCenter();
		copyCenter.calculatePrice(copyNumber);
		
	}

	static void calculatePrice(int n) {
		int twentyFiveCopy = 0;
		int twelveCopy = 0;
		int oneCopy = 0;
		while (n % 25 != n) {
			twentyFiveCopy++;
			n = n - 25;
		}
		
		while (n % 12 != n) {
			twelveCopy++;
			n = n - 12;
		}
		
		while (n < 12 && n > 0 ) {
			oneCopy++;
			n--;
		}
		System.out.println(twentyFiveCopy +  twelveCopy*0.5 + oneCopy*0.05 +" tl");
		
	}

}
