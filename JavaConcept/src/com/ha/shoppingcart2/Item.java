package com.ha.shoppingcart2;

public class Item {

	private String id;
	private String description;
	private int quantity;
	private double prize;

	public Item(String description, String id, int quantity, double price) {
		this.description = description;
		this.quantity = quantity;
		this.id = id;
		this.prize = prize;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

}
