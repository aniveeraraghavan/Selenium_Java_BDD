package com.healthasyst.methods;

public class MethodsDemo {

	public static double areaOfCircle(int r) {
		double area = 3.14 * r * r;
		return area;

	}

	// area of triangle
	//public static double areaOfTriangle(double b, int h) {

	//	double trianglearea = (b * h) / 2;
	//	return trianglearea;
	//}

	public static void main(String[] args) {

		int radius = 50;
		double result = MethodsDemo.areaOfCircle(20);
		System.out.println(result);
		result = MethodsDemo.areaOfCircle(radius);
		System.out.println(result);

		Area a= new Area();//calling the non static method using new keyword and allocating the memory for the class
		double triangle = a.areaOfTriangle(25.0, 1);
		System.out.println(triangle);
		
		double rand=Math.random();
		System.out.println(rand);
	}
}
