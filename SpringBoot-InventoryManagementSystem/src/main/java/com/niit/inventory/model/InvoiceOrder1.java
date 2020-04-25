package com.niit.inventory.model;

import java.util.Date;


public class InvoiceOrder1 {
	 private long invoiceId;
	 private Date date;
	 private Order1 order1;
		private String name;
		private String price;
		private String price1;
		
		private String quantity;
		
		private long order_id;

		public long getInvoiceId() {
			return invoiceId;
		}

		public void setInvoiceId(long invoiceId) {
			this.invoiceId = invoiceId;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public Order1 getOrder1() {
			return order1;
		}

		public void setOrder1(Order1 order1) {
			this.order1 = order1;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public String getPrice1() {
			return price1;
		}

		public void setPrice1(String price1) {
			this.price1 = price1;
		}

		public String getQuantity() {
			return quantity;
		}

		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}

		public long getOrder_id() {
			return order_id;
		}

		public void setOrder_id(long order_id) {
			this.order_id = order_id;
		}

		public InvoiceOrder1(long invoiceId, Date date, Order1 order1, String price, String price1,String quantity, 
				 long order_id) {
			super();
			this.invoiceId = invoiceId;
			this.date = date;
			this.order1 = order1;
			//this.name = name;
			this.price = price;
			this.price1 = price1;
			this.quantity = quantity;
			this.order_id = order_id;
		}

}
