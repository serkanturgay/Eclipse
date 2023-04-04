package Sprint4_Pointer;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Point point1 = new Point();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the x1 : ");
		point1.setxValue(scan.nextInt());
		System.out.println("Enter the y1 : ");
		point1.setyValue(scan.nextInt());
		
		Point point2 = new Point();
		System.out.println("Enter the x2 : ");
		point2.setxValue(scan.nextInt());
		System.out.println("Enter the y2 : ");
		point2.setyValue(scan.nextInt());
		
		Point clonePointer = new Point();

		
		System.out.print("Point1 = " + "(" + point1.getxValue() + ",");
		System.out.println(point1.getyValue() + ")");
		System.out.print("Point2 = " + "(" + point2.getxValue() + ",");
		System.out.println(point2.getyValue() + ")");
		
		System.out.println("--------------------------------");
		
		System.out.print("Point1 => ");point1.distanceToOrigin(point1);
		System.out.print("Point2 => ");point2.distanceToOrigin(point2);
		
		System.out.println("--------------------------------");
		
		point1.distanceBetweenTwoPoint(point1, point2);
		
		System.out.println("--------------------------------");
		
		point1.clone(point1, clonePointer);
		System.out.println("Clone Point = " + "(" + clonePointer.getxValue() + "," + clonePointer.getyValue() + ")" );
		
		
		
	}

}
