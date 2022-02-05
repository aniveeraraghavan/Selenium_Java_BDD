package com.ha.methodoverloading;

public class Calculator {
	//overloading the same method using different types of args and same args in different positions
	 public  void add(int a, int b) {
		 System.out.println(a+b);
		 
	 } 
	 public void add(int a,int b, int c) {
		 System.out.println(a+b+c);
	 }
	 
	 public void add(long a, int b) {
		 System.out.println("long a + int b is " + a+b);
	 }
	 public long add(int a,long b,int c) {
		  long x = a+b+c;
		  return x;
		 
	 } public long add (long a,long b,int c) {
		 long y = a+b+c;
		 return y;
	 }
	 

}
