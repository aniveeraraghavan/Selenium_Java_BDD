package com.ha.employee;

public class Employee {
	public int emplID;
	public String empName;
	public double empSal;
	public static String CompanyName;	
	
	//print employee details
	
	/*
	 * public static void printEmployeeDetail (Employee a) {
	 * System.out.println(a.emplID); System.out.println(a.empName);
	 * System.out.println(a.empSal); System.out.println(Employee.CompanyName);
	 */
		
		
		public void printEmployeeDet()
		{
			System.out.println(emplID);
			System.out.println(empName);
			System.out.println(empSal);
			System.out.println(Employee.CompanyName);
		}
	}
	
	
	
	
	

