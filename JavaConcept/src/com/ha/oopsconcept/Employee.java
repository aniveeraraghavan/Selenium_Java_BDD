package com.ha.oopsconcept;

abstract class EmployeeTest {
	
	private int empId;
	private String empName;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public abstract double calculateEmpSalary();
	public abstract void printEmpDetail();
	

}
class PermanentEmployee extends EmployeeTest{
	public void printEmpDetail() {
		// TODO Auto-generated method stub
		System.out.println(super.getEmpId());
		System.out.println(super.getEmpName());
	}

	public double calculateEmpSalary() {
		// TODO Auto-generated method stub
		double sal=30*2000;
		return sal;
	}


}
	
class contractEmployee extends EmployeeTest{
	
	public void printEmpDetail() {
		System.out.println(super.getEmpName());
		System.out.println(super.getEmpId());
			}
	
	public double calculateEmpSalary() {
		double salary = 8*20*5;
		return salary;
		
	}
}
 
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeTest p = new PermanentEmployee();

		p.setEmpName("john");
		p.setEmpId(100);
p.printEmpDetail();
		System.out.println(p.calculateEmpSalary());
		
		EmployeeTest c = new contractEmployee();
		c.setEmpId(102);
		c.setEmpName("Harry");
		c.printEmpDetail();
System.out.println(c.calculateEmpSalary());
	}
}

