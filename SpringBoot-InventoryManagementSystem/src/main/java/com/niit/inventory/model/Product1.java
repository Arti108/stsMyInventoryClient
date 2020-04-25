package com.niit.inventory.model;

import java.util.Date;



public class Product1 {
private long id;
private String brand;
private Date date;
private String madein;
	private String name;
	private float price;
	private float quantity;
	private String type;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMadein() {
		return madein;
	}
	public void setMadein(String madein) {
		this.madein = madein;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Product1(long id, String brand, Date date, String madein, String name, float price, float quantity,
			String type) {
		super();
		this.id = id;
		this.brand = brand;
		this.date = date;
		this.madein = madein;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.type = type;
	}
	
	 
}
