package com.ha.base;

public class Student extends Person {
	
	private int stuRollNo;
	private double stuPercentage;
	private String stuCourseCode;
	
	//public static int counter = 101;
	
//	public Student() {
//		setStuRollNo(counter);
//			counter=counter+1;
//		}

	public int getStuRollNo() {
		return this.stuRollNo;
	}

	public void setStuRollNo(int stuRollNo) {
		this.stuRollNo = stuRollNo;
	}

	public double getStuPercentage() {
		return stuPercentage;
	}

	public void setStuPercentage(double stuPercentage) {
		
		if(stuPercentage>=0 && stuPercentage<=100) {
			this.stuPercentage = stuPercentage;
			}else {
				System.out.println("Invalid percentage");
			}
		
	}

	public String getStuCourseCode() {
		return stuCourseCode;
	}

	public void setStuCourseCode(String stuCourseCode) {
		this.stuCourseCode = stuCourseCode;
	}
	 public void printStudentDetail() {
		 System.out.println("Student id " +this.stuRollNo);
		 System.out.println("Student Name " + super.getPersonName());
		 System.out.println("Student phone " +super.getPersonCell());
		 System.out.println("Student percentage " + this.stuPercentage);
	 }
	

}
