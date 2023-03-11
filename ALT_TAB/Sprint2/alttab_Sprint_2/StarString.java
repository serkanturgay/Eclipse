package alttab_Sprint_2;

import java.util.Scanner;

public class StarString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word : ");
		String word = scan.next();
		int stringLength = word.length();
		for (int i = 0; i < stringLength; i++) {
			System.out.print(word.charAt(i));
			if (i == stringLength - 1) {
				break;
			} else {
				System.out.print("*");
			}
		}
	}
}
