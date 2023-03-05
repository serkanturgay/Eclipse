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
		String[][] rectangular2 = new String[n][2*n-1];
		System.out.println("---------------V1--------------- \n");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				rectangular[i][j] = "*";
				System.out.print(rectangular[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		System.out.println("---------------V2--------------- \n");
		
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
		
		System.out.println("---------------V3--------------- \n");
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2*i+1; j++) {
				rectangular2[i][j] = "*";
				System.out.print(rectangular2[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		System.out.println("---------------V4--------------- \n");
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n-i ; j++) {
				System.out.print(" ");
				
			}
			for (int j = 0; j < i+1; j++) {
				rectangular2[i][j] = "*";
				System.out.print(rectangular2[i][j] + " ");
			}
			
			System.out.println("\n");
		}
		
	}

}
