package alttab_Sprint_1;

import java.util.Iterator;
import java.util.Scanner;

public class FamilyAge {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("How many people are in your family = ");
		int numberOfIndividuals = scan.nextInt();
		int numberOfBaby = 0, numberOfChildiren = 0, numberOfTeenager = 0, numberOfYoung = 0, numberOfMiddleAge = 0,
				numberOfAged = 0;
		for (int i = 1; i < numberOfIndividuals+1; i++) {
			System.out.println("Enter the age of the " + i + ". family member");
			int ageOfMember = scan.nextInt();
			while (!(ageOfMember >= 0 & ageOfMember <= 150)) {
				System.out.println("Error! please enter a value between 0 and 150");
				ageOfMember = scan.nextInt();
			}
			
			if (ageOfMember >= 0 & ageOfMember <= 3) {
				numberOfBaby++;
			} else if (ageOfMember >= 4 & ageOfMember <= 12) {
				numberOfChildiren++;
			} else if (ageOfMember >= 13 & ageOfMember <= 19) {
				numberOfTeenager++;
			} else if (ageOfMember >= 20 & ageOfMember <= 30) {
				numberOfYoung++;
			} else if (ageOfMember >= 31 & ageOfMember <= 59) {
				numberOfMiddleAge++;
			} else {
				numberOfAged++;
			}
			
		}
		System.out.println("number of baby in the family = " + numberOfBaby);
		System.out.println("number of childiren in the family = " + numberOfChildiren);
		System.out.println("number of teenager in the family = " + numberOfTeenager);
		System.out.println("number of young people in the family = " + numberOfYoung);
		System.out.println("number of middle age in the family = " + numberOfMiddleAge);
		System.out.println("number of old people in the family = " + numberOfAged);
		

	}
}
