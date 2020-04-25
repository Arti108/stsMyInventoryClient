package com.niit.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.niit.inventory.model.Product;
import com.niit.inventory.model.Product1;

public interface UserPrRepository extends JpaRepository<Product, Long>{
	@Query("SELECT new com.niit.inventory.model.Product1(p.id,p.brand,p.date,p.madein,p.name,p.price,p.quantity,p.type) "
			+ "FROM Product p")
	List<Product1> fetchProduct1Join();

	
}
