package com.ha.methodoverloading;

public class CalcTest {

	public static void main(String[] args) {
	Calculator c1= new Calculator();
	c1.add(12, 340);//overloading the method using arguments in different positions
	c1.add(8997799l, 5550);
	c1.add(10, 200, 30);
	
	double res=Math.max(100, 50);
	System.out.println(res);
	long result = c1.add(10, 2222220l, 10);
	System.out.println(result);
 long result2=c1.add(89l, 89l, 6666);
 System.out.println(result2);
	
	

	}

}
