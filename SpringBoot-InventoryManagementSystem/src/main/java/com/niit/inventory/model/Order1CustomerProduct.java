package com.niit.inventory.model;

import java.util.Date;

public class Order1CustomerProduct {
	private long order_id;
	private Date date;
	private String price;
	private float quantity;
	private String type;
	
	
	
	 private int cust_id;
	 private long id;
	public long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public Order1CustomerProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order1CustomerProduct(long order_id, Date date, String price, float quantity, String type, int cust_id,
			long id) {
		super();
		this.order_id = order_id;
		this.date = date;
		this.price = price;
		this.quantity = quantity;
		this.type = type;
		this.cust_id = cust_id;
		this.id = id;
	}
	
	
}
