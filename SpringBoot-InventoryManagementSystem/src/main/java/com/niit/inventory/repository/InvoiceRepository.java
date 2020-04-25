package com.niit.inventory.repository;

import java.util.List;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Query;

import com.niit.inventory.model.Invoice;
//import com.niit.inventory.model.InvoiceOrder1;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
	//@Query("SELECT new com.niit.inventory.model.Order1Invoice(i.invoice_id,i.date,i.order_date,i.produt_name,i.price,i.totalprice,i.quantity,o.order_id) "
		//	+ "FROM Invoice i INNER JOIN i.Order1 o")
	//List<InvoiceOrder1> fetchInvoiceInnerJoin();


}
