package com.ha.shoppingcart;

public class shoppingCart extends Item {

	public static void main(String[] args) {
		Item i1= new Item();
		Item i2 = new Item();
		Item i3= new Item();
		i1.setDescription("Shirt");
		i2.setDescription("pant");
		i3.setDescription("laptop");
		i1.setQuantity(5);
		i2.setQuantity(0);
		i3.setQuantity(3);
		
		
	i1.printDetails();
	i2.printDetails();
	i3.printDetails();
	

	}

}
