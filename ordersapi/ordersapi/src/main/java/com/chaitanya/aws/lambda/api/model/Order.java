package com.chaitanya.aws.lambda.api.model;

public class Order {
	
	public int id;
	public String itemName;
	public int quantity;
	
	public Order() {
		super();
	}

	public Order(int id, String itemName, int quantity) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.quantity = quantity;
	}

}
