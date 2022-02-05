package com.ha.shoppingcart2;

public class Shirt extends Item {
	
private char size;
private char colorCode;


	
 public Shirt (String description, int quantity, double prize, char size, char colorCode)
 {
	super("Formal", "S23", 50,2000.203);
	this.size = 'S';
	this.colorCode= 'B';
	this.setPrize(2000.13);
	
	  }
	 
	 public void display() {
			
			System.out.println("Shirt Description: " + super.getDescription());
			System.out.println("Shirt Size: " + this.size);
			System.out.println("Shirt Color Code: " + this.colorCode);
			System.out.println("Shirt Quantity: " + super.getQuantity());
			System.out.println("Shirt ID: "+super.getId());
			System.out.println("Shirt Prize" +this.getPrize());
			
	 
	}
	
}
	
