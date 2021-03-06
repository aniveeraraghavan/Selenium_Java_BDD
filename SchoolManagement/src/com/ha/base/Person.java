package com.ha.base;

public class Person {
	private String personName;//protected can be accessible inside package and extended child class
	private long personCell;
	private String personEmailId;
	private String personAddress;
	private static String schoolName;
	private static String schoolAddress;

//getting person name - getter method is read sccess
	public String getPersonName() {
		return personName;
	}
//setter method is write access
	public void setPersonName(String personName) {
		this.personName = personName;
	}

//getting person cell phone number
	public long getPersonCell() {
		return personCell;
	}

	public void setPersonCell(long personCell) {

		if (String.valueOf(personCell).length()== 10)
//converting int to string and checking the characters has 10 digits or not 
		{
			this.personCell = personCell;
		} else {
			System.out.println("Invalid cell number!");
		}

	}
}
