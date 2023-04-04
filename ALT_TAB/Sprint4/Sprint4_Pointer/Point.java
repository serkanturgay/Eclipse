package Sprint4_Pointer;

public class Point {
	private int xValue;
	private int yValue;
	

	int getxValue() {
		return xValue;
	}

	void setxValue(int xValue) {
		this.xValue = xValue;
	}

	int getyValue() {
		return yValue;
	}

	void setyValue(int yValue) {
		this.yValue = yValue;
	}

	void distanceToOrigin(Point tempPoint) {
		
		System.out.println("distance of point from origin = " + Math.sqrt(Math.pow(tempPoint.getxValue(), 2) + Math.pow(tempPoint.getyValue(), 2)));
		
	}
	
	void distanceBetweenTwoPoint(Point tempPoint1, Point tempPoint2) {
		
		System.out.print("Distance between Point1 and Point2 = ");
		System.out.println(Math.sqrt(Math.pow(tempPoint2.getxValue()-tempPoint1.getxValue(), 2) + Math.pow(tempPoint2.getyValue()-tempPoint1.getyValue(), 2)));
	}
	
	Point clone(Point tempPoint, Point clonePointer) {
		
		
		clonePointer.setxValue(tempPoint.getxValue());
		clonePointer.setyValue(tempPoint.getyValue());
		System.out.println("clone point set");
		return clonePointer;
		
		
		
	}

}
