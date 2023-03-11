package alttab_Sprint_3;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array length : ");
		int arrayLenght = scan.nextInt();
		int array[] = new int[arrayLenght];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the " + (i+1) +". value : ");
			array[i] = scan.nextInt();
		}
		
		int[] dublicateArray = new int[array.length];
		int indexDublicateArray = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i != j && array[i] == array[j]) {
					if (itHave(dublicateArray, array[i])) {
						dublicateArray[indexDublicateArray] = array[i];
						indexDublicateArray++;
					}  
					break;
				}
				if (itHave(dublicateArray, array[i])) {
					dublicateArray[indexDublicateArray] = array[i];
					indexDublicateArray++;
				}
			}
				
		}
		
		System.out.print("New Array = ");
		for (int value : dublicateArray) {
			if (value != 0) {
				System.out.print(value + " ");

			}
		}
	}
	//****************************Method*****************************	
	static boolean itHave(int[] array, int a) {

		for (int i : array) {
			if (i == a) {
				return false;
			}
		}

		return true;
	}
	//****************************Method*****************************	
}
	