package alttab_Sprint_2;

import java.util.Scanner;

public class MonteCarloPI {

	public static void main(String[] args) {

		System.out.println("Enter the number of point: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int numberInCircle = 0;
		
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < n; i++) {
			double x=Math.random();
			double y=Math.random();
			double distance = Math.sqrt(x*x+y*y);
			if (distance<=1) {
				numberInCircle++;
			}
			
		}
		
		long end = System.currentTimeMillis();                                                                                     
		long time = end - start;
		
		double myPI = 4.000 * numberInCircle / n;
		System.out.println("My pi = " + myPI);
		System.out.println("Java's pi = " + Math.PI);
		System.out.println("Time = " + time + " ms");
	}
	

}
