package com.niit.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.niit.inventory.model.Customer;
import com.niit.inventory.model.Customer1;

public interface UserCsRepository extends JpaRepository<Customer, 	Integer> {
	@Query("SELECT new com.niit.inventory.model.Customer1(c.cust_id,c.name,c.password,c.email,c.phone,c.address) "
			+ "FROM Customer c")
	List<Customer1> fetchCustomer1Join();
}
