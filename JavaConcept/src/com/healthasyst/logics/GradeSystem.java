package com.healthasyst.logics;

public class GradeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark = 60;

		if (mark >= 90) 
		{
			System.out.println("grade is A and the mark is " + mark);
		}

		else if (mark >= 80 && mark <= 89) 
		{
			System.out.println("grade is B and the mark is " + mark);
		}
		else if (mark >= 60 && mark <= 79) 
		{
			System.out.println("grade is C and the mark is " + mark);

		}
		else if (mark <= 60) 
		{
			System.out.println("grade is F and the mark is " + mark);
		}

	}

}
