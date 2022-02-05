package com.ha.runner;

import com.ha.base.Student;

public class AllDetailsOfSchool {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setPersonName("John Wick");
		student1.setPersonCell(8903089941L);
		
		//System.out.println(student1.getPersonName());
		
		student1.setStuRollNo(1000); 
		student1.setStuPercentage(34.83);
		student1.printStudentDetail();
		
		
		
		
	}

}
