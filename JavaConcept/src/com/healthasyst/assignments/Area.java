package com.healthasyst.assignments;

public class Area {
	
	//area of Square
	public static void areOfSquare (int a) {
		
		int area = (a * a);
		System.out.println("Area of square:" +area);
		
	}
	
	//area of trapezium
	
	public  static void areaOfTrapezium (double h,double a,double b) {
		
		double area = (0.5 * h)* (a + b);
		System.out.println("Area of trapezium is : "+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 40;
		Area.areOfSquare(a);
		Area.areaOfTrapezium(10,3.5,25);
		
	}

}
