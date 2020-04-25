package com.niit.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.niit.inventory.model.Order1;
import com.niit.inventory.model.Order1CustomerProduct;

public interface UserRepository extends JpaRepository<Order1, Long> {
	@Query("SELECT new com.niit.inventory.model.Order1CustomerProduct(o.order_id,o.date,o.price,o.quantity,o.type,c.cust_id,p.id) "
			+ "FROM Order1 o INNER JOIN o.customer c INNER JOIN o.product p")
	List<Order1CustomerProduct> fetchOrder1InnerJoin();

}
