package com.healthasyst.encaps;

public class StudenTest {
	

	public static void main(String[] args) {
		
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		
		s1.setStudentPercentage(99);
		s1.setStudentName("john");
		s1.setStudentEmail("john@gmail.com");
		
		s2.setStudentEmail("anitha.@Gmail.com");
		s2.setStudentName("Anitha");
		s2.setStudentPercentage(77);
		
		
		System.out.println(s1.getstudentPercentage());
		System.out.println(s1.getStudentEmail());
		System.out.println(s1.getStudentName());
		
		
		s1.printStudentDetail();
		s2.printStudentDetail();
		
		
		

	}

}
