package com.ha.inheritance;

class Parent {
	public int pAge =60;
	 
	public Parent()
	// constructor of the parent class.In real time data will not be hard coded only
	// in constructor we will load the data for the class
	{
		System.out.println("Parent class!");
		
	}
//construtor with argument
	public Parent(int a) {
		System.out.println("Calling the parent constructor using super keyword in child" + a);
	}
	
	public void parentStyle() {

		System.out.println("Parent Style");
	}
}

class Child extends Parent {
	public int cAge = 20;

	public Child() {
		 super(1994); //calling parent class with args using super keyword
		System.out.println("Child class");
	}

	public void childStyle() {

		System.out.println("Child Style");
		System.out.println(super.pAge);//calling parent constructor object/args using super keyword
	}
	

}

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1 = new Child();//when instantiating the child the memory will be first created for parent
		System.out.println(c1.cAge);
		//System.out.println(c1.pAge);
		c1.parentStyle();
		c1.childStyle();

	}

}
