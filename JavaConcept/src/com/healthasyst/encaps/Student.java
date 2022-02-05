package com.healthasyst.encaps;

public class Student {

	private int studentId; // by using private we are protecting the variable and accessing this variable
							// using the method.
	// warping up the variable so that outsiders cannot access it- this is called
	// encapsulation
	private String studentName;
	private String studentEmail;
	private double studentPercentage;
	private static String schoolName;	
	
	
 

	public static int counter = 1001;

	public Student() // here we are using the constructor
	{
		studentId = counter;
		counter = counter + 1;

	}
	public double getstudentPercentage() {
		return this.studentPercentage;

	}

	public void setStudentPercentage(double studentPercentage) {
		if (studentPercentage >= 0 && studentPercentage <= 100) {
			this.studentPercentage = studentPercentage;
		} else {
			System.out.println("Invalid %!");
		}
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public static String getSchoolName() {
		return schoolName;
	}
	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}
public void printStudentDetail() {
	
	System.out.println(this.studentId);
	System.out.println(this.studentName);
	System.out.println(this.studentEmail);
	System.out.println(this.studentPercentage);
}
	

}
