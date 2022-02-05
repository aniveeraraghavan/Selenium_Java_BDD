package com.ha.shoppingcart;

public class Item {
	
	private int id;
	private String description;
	private int quantity;
	private double price;
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description){ 
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity >=1) {
		this.quantity = quantity;
	}else {
		System.out.println("Invalid quantity");
	}
	}
					
public void printDetails() {
	
	System.out.println(this.description);
	System.out.println(this.quantity);
}
	
}
