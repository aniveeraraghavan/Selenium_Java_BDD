package com.healthasyst.loops;

public class LoopsDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	int[]numbers= {10,44,30,55,111,60};
	int size=numbers.length;
	 for (int i=0; i<numbers.length;i++)//for (int i=0;i<size;i++)
	{
		 //to print greater then 50
		 if(numbers[i] <=50)
		 {
	System.out.println(numbers[i]);
	break;// to stop the iteration once the loop condition is met
	}
	
	}
	}
}

