package alttab_Sprint_2;

import java.util.Scanner;

public class MultipleMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of rows of the first matrix: ");
		int j = scan.nextInt();
		System.out.println("enter the number of column of the first matrix: ");
		int k = scan.nextInt();
		int[][] matrix = new int[j][k];
		
		for (int i = 0; i < j; i++) {
			for (int l = 0; l < k; l++) {
				System.out.println("Enter the a" + i + l);
				matrix[i][l] = scan.nextInt();
			}
		}
		
		System.out.println("enter the number of column of the second matrix: ");
		int m = scan.nextInt();
		int[][] matrix2 = new int[k][m];
		
		for (int i = 0; i < k; i++) {
			for (int l = 0; l < m; l++) {
				System.out.println("Enter the b" + i + l);
				matrix2[i][l] = scan.nextInt();
			}
		}
		
		int[][] multipleMatrix = new int[j][m];
		int temporarySum = 0;
		
		for (int i = 0; i < j; i++) {
			for (int l = 0; l < m; l++) {
				for (int n = 0; n < k; n++) {
					temporarySum = temporarySum + matrix[i][n] * matrix2[n][l];
				}
				multipleMatrix[i][l] = temporarySum;
				temporarySum=0;
			}
			
			
		}	
		
		for (int a = 0; a < j; a++) {
			for (int b = 0; b < m; b++) {
				System.out.print(multipleMatrix[a][b]+"      ");
			}
			System.out.println();
			
		}
		

	}
}