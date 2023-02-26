package alttab_Sprint_2;

import java.util.Scanner;

public class RectangularArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of the row: ");
		int n = scan.nextInt();
		System.out.println("Enter number of the column: ");
		int m = scan.nextInt();
		String[][] rectangular = new String[n][m];
		System.out.println("V1");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				rectangular[i][j] = "*";
				System.out.print(rectangular[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		System.out.println("------------------------------ \n V2");
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i == 0 || i == n-1) {
					rectangular[i][j] = "*";
				} else if (j == 0 || j == m-1) {
					rectangular[i][j] = "*";
				} else {
					rectangular[i][j] = " ";
				}
				System.out.print(rectangular[i][j] + " ");
			}
			System.out.println("\n");
		}
		
	}

}
