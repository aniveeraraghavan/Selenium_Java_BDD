package com.ha.employee;

public class EmployeeTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee.CompanyName = "HA";
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();

		
		emp1.empName = "john";
		emp1.emplID = 11;
		emp1.empSal = 80000;
		
		emp2.empName = "kerry";
		emp2.emplID = 12;
		emp2.empSal = 90000;
		
		emp3.empName = "Cathy";
		emp3.emplID = 13;
		emp3.empSal = 120000;
		 
		//System.out.println(emp1.emplID + " "+ emp1.empName + " "+ Employee.CompanyName+ " "+ emp1.empSal);
		
		/*
		 * Employee.printEmployeeDetail(emp1);
		 * Employee.printEmployeeDetail(emp2);
		 * Employee.printEmployeeDetail(emp3);
		 */
		
		emp1.printEmployeeDet();
		emp2.printEmployeeDet();
		emp3.printEmployeeDet();
		
		//employee array
		Employee[] e = new Employee[3];
		e[0] = emp1;
		e[1]= emp2;
		e[2] = emp3; //if we give 3 we will get index bound out of range issue. as the arrays are zero based index and we have declared the array size as 3.
		
		
	
		
	}

}
