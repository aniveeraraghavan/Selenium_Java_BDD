package com.ha.variables;

public class VariableDemo {

	public static int aS= 10;//static variable or class variable
	public int aNS= 20;
	public int bNS = 30;//non static variable or instance variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(aS);//will print the static memory value
		VariableDemo.aS = 100; //changing the static value inside the method 
		//and the method will use this value when it is called as we have changed the value
		System.out.println(aS);
		VariableDemo obj1 = new VariableDemo();
		System.out.println(obj1.aNS);
		System.out.println(obj1.bNS);
		obj1.bNS = 2000;//changing the non static value using the object reference inside the method
		System.out.println(obj1.bNS);
		VariableDemo obj2 = new VariableDemo();
		System.out.println(obj2.aNS);
			obj2.aNS=999;
			obj1.bNS= 1067;
		obj1= obj2; //assigning the obj2 to obj1. now the obj2 connection is lost.
		System.out.println(obj2.aNS);
		System.out.println(obj1.bNS);
		obj1.bNS= 1067;
		System.out.println(obj1.bNS);
		
		
		

	}

}
//when you create an object for the variable and the variable is pointing to null we will get null point exception
