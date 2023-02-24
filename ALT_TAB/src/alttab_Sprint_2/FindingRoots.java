package alttab_Sprint_2;

import java.util.Scanner;

public class FindingRoots {
	public static void main(String[] args) {
		int a,b,c;
		double delta;
		double root1 = 0, root2 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("ax^2+bx+c") ;
		System.out.println("a = ");
		a = scan.nextInt();
		System.out.println("b = ");
		b = scan.nextInt();
		System.out.println("c = ");
		c = scan.nextInt();
		
		delta = b*b - 4*a*c;
		
		if (delta < 0) {
			System.out.println("Roots are complex.");
		}else if (delta == 0) {
			System.out.println("There is only one root.");
			root1 = (-b+Math.sqrt(delta))/2*a;
			System.out.println("Root of the "+a + "x^2+" + b + "x+" + c +" equation ; x1 = x2 = " + root1 );
		}else {
			System.out.println("Roots are reel.");
			root1 = (-b+Math.sqrt(delta))/2*a;
			root2 = (-b-Math.sqrt(delta))/2*a;
			System.out.println("Root of the "+a + "x^2+" + b + "x+" + c +" equation ; x1 = " + root1 + " x2= " + root2 );
		}
		
		
	}
}
